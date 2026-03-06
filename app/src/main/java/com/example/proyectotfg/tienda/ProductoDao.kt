package com.example.proyectotfg.tienda

import androidx.room.*

@Dao
interface ProductoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(producto: ProductoBaseDeDatos)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(productos: List<ProductoBaseDeDatos>)
    @Query("SELECT * FROM productos WHERE enCarrito = 0")
    suspend fun obtenerTodos(): List<ProductoBaseDeDatos>
    @Query("SELECT * FROM productos")
    suspend fun obtenerTodosLosProductos(): List<ProductoBaseDeDatos>
    @Query("SELECT * FROM productos WHERE enCarrito = 0")
    suspend fun obtenerProductosParaTienda(): List<ProductoBaseDeDatos>
    @Query("SELECT * FROM productos WHERE enCarrito = 0")
    suspend fun obtenerProductosDisponibles(): List<ProductoBaseDeDatos>
    @Query("SELECT * FROM productos WHERE nombre = :nombre AND enCarrito = 1 LIMIT 1")
    suspend fun obtenerProductoEnCarritoPorNombre(nombre: String): ProductoBaseDeDatos?
    @Update
    suspend fun actualizarProducto(producto: ProductoBaseDeDatos)
    @Query("SELECT * FROM productos WHERE enCarrito = 1")
    suspend fun obtenerCarrito(): List<ProductoBaseDeDatos>
    @Query("UPDATE productos SET enCarrito = 1 WHERE id = :id")
    suspend fun agregarAlCarrito(id: Int)
    @Query("UPDATE productos SET enCarrito = 0 WHERE id = :id")
    suspend fun quitarDelCarrito(id: Int)
    @Query("UPDATE productos SET enCarrito = 0")
    suspend fun vaciarCarrito()
}

