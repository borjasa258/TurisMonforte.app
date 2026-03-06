package com.example.proyectotfg.tienda

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectotfg.R
import kotlinx.coroutines.launch

class TiendaViewModel(application: Application) : AndroidViewModel(application) {
    val cantidadEnCesta = mutableStateOf(0)
    private val dao = AppDatabase.getDatabase(application).productoDao()

    var productos by mutableStateOf(listOf<ProductoBaseDeDatos>())
        private set

    var carrito by mutableStateOf(listOf<ProductoBaseDeDatos>())
        private set

    init {
        cargarProductos()
        cargarCarrito()
    }

    private suspend fun insertarProductosPredefinidos() {
        val todosLosProductos = dao.obtenerTodosLosProductos()
        if (todosLosProductos.isEmpty()) {
            val productosPredefinidos = listOf(
                ProductoBaseDeDatos(nombre = "Espinilleras personalizadas", precio = 25.00, imagen = R.drawable.producto1espinilleras),
                ProductoBaseDeDatos(nombre = "Bufanda Monforte C.F", precio = 9.50, imagen = R.drawable.producto2bufanda),
                ProductoBaseDeDatos(nombre = "Gorra Monforte C.F", precio = 5.00, imagen = R.drawable.producto3gorra),
                ProductoBaseDeDatos(nombre = "Braga Monforte C.F", precio = 4.00, imagen = R.drawable.producto4braga),
                ProductoBaseDeDatos(nombre = "Gorro Monforte C.F", precio = 5.00, imagen = R.drawable.producto5gorro),
                ProductoBaseDeDatos(nombre = "Guantes Monforte C.F", precio = 5.00, imagen = R.drawable.producto6guantes),
                ProductoBaseDeDatos(nombre = "Botella metálica Monforte C.F", precio = 6.00, imagen = R.drawable.producto6botella),
                ProductoBaseDeDatos(nombre = "Taza Monforte C.F", precio = 5.00, imagen = R.drawable.producto6taza),
                ProductoBaseDeDatos(nombre = "Sudadera con capucha Monforte C.F", precio = 20.00, imagen = R.drawable.productosudaderacapucha),
                ProductoBaseDeDatos(nombre = "Sudadera con capucha Monforte C.F", precio = 20.00, imagen = R.drawable.productosudaderacapucha2),
                ProductoBaseDeDatos(nombre = "Miniatura de Toro Íbero en piedra Monforte C.F", precio = 13.00, imagen = R.drawable.productotoroibero)
            )
            dao.insertar(productosPredefinidos)
        }
    }



    fun ProductoBaseDeDatos.toProducto(): ProductoBaseDeDatos {
        return ProductoBaseDeDatos(
            id = this.id,
            nombre = this.nombre,
            precio = this.precio,
            imagen = this.imagen,
            cantidad = this.cantidad
        )
    }



    fun anadirAlCarrito(producto: ProductoBaseDeDatos) {
        viewModelScope.launch {
            val existente = dao.obtenerProductoEnCarritoPorNombre(producto.nombre)
            if (existente != null) {
                val actualizado = existente.copy(cantidad = existente.cantidad + 1)
                dao.actualizarProducto(actualizado)
            } else {
                val productoBD = producto.copy(enCarrito = true, cantidad = 1)
                dao.insertar(productoBD)
            }
            cargarCarrito()
        }
    }


    fun cargarProductos() {
        viewModelScope.launch {
            insertarProductosPredefinidos()
            productos = dao.obtenerTodos().map { it.toProducto() }
        }
    }

    fun agregarProducto(nombre: String, precio: Double, imagen: Int) {
        viewModelScope.launch {
            val nuevoProducto = ProductoBaseDeDatos(nombre = nombre, precio = precio, imagen = imagen)
            dao.insertar(nuevoProducto)
            cargarProductos()
        }
    }

    fun cargarCarrito() {
        viewModelScope.launch {
            carrito = dao.obtenerCarrito()
        }
    }

    fun quitarProducto(producto: ProductoBaseDeDatos) {
        viewModelScope.launch {
            dao.quitarDelCarrito(producto.id)
            cargarCarrito()
        }
    }

    fun vaciarCarrito() {
        viewModelScope.launch {
            dao.vaciarCarrito()
            cargarCarrito()
        }
    }

    fun total(): Double {
        return carrito.sumOf { it.precio }
    }
}




