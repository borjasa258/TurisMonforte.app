package com.example.proyectotfg.NavHostGuiaMonforteApp


import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectotfg.FiestasYTradiciones.FiestasMedievales.FiestasMedievales
import com.example.proyectotfg.FiestasYTradiciones.FiestasOritoScreenPrincipal.FiestasOritoScreenPrincipal
import com.example.proyectotfg.FiestasYTradiciones.FiestasOritoScreenPrincipal.FiestasSanPascual.FiestasSanPascualScreen
import com.example.proyectotfg.FiestasYTradiciones.FiestasOritoScreenPrincipal.FiestasVirgenOritoScreen.FiestasVirgenOritoScreen
import com.example.proyectotfg.FiestasYTradiciones.FiestasSanRamon.FiestasSanRamon
import com.example.proyectotfg.FiestasYTradiciones.FiestasSanRoque.FiestasSanRoque
import com.example.proyectotfg.FiestasYTradiciones.FiestasSantoCristo.FiestasSantoCristo
import com.example.proyectotfg.FiestasYTradiciones.FiestasYTradicionesMonforte.FiestasEnMonforteScreen
import com.example.proyectotfg.FiestasYTradiciones.FiestasYTradicionesScreen
import com.example.proyectotfg.FiestasYTradiciones.FiestasYTradicionesScreenPrincipal.FiestasMonforteScreenPrincipal
import com.example.proyectotfg.HistoriaScreen.HistoriaScreen
import com.example.proyectotfg.Inmobiliaria.InmobiliariaScreenPrincipal
import com.example.proyectotfg.Inmobiliaria.Monforte.Alquiler.CasasAlquilerMonforte
import com.example.proyectotfg.Inmobiliaria.Monforte.Venta.CasasVentaMonforte
import com.example.proyectotfg.LugaresScreen.LugaresAlendaScreen.LugaresAlendaScreen
import com.example.proyectotfg.LugaresScreen.LugaresFontLlopScreen.FontLlopScreen
import com.example.proyectotfg.LugaresScreen.LugaresLaCapitanaScreen.LugaresLaCapitanaScreen
import com.example.proyectotfg.LugaresScreen.LugaresMonforte.LugaresMonforteScreen
import com.example.proyectotfg.LugaresScreen.LugaresOritoScreen.LugaresOritoScreen
import com.example.proyectotfg.LugaresScreen.LugaresScreen
import com.example.proyectotfg.PantallaInicio.HomeScreen
import com.example.proyectotfg.menu.PantallaMenu
import com.example.proyectotfg.RestaurantesScreen.RestaurantesScreen
import com.example.proyectotfg.ServiciosPublicos.Ayuntamiento.AyuntamientoEdificio.AyuntamientoEdificioScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.Ayuntamiento.AyuntamientoScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.Ayuntamiento.CentroJuvenil.CentroJuvenilScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.Ayuntamiento.ServiciosSociales.ServiciosSocialesScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.CentrosEducativos.CentrosEducativosScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.CentrosEducativos.Colegios.ColegiosScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.CentrosEducativos.Guarderias.GuarderiasScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.CentrosEducativos.Institutos.InstitutosScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.Parques.ParquesScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.ServiciosPublicosScreenPrincipal
import com.example.proyectotfg.ServiciosPublicos.ZonasDeportivas.ZonasDeportivasScreenPrincipal
import com.example.proyectotfg.Tiendas.Carnicerias.CarniceriasScreenPrincipal
import com.example.proyectotfg.Tiendas.Comercios.TiendasScreenPrincipal
import com.example.proyectotfg.Tiendas.Mecanico.MecanicoScreenPrincipal
import com.example.proyectotfg.Tiendas.Opticas.OpticaScreenPrincipal
import com.example.proyectotfg.Tiendas.Panaderias.PanaderiasScreenPrincipal
import com.example.proyectotfg.Tiendas.Peluquerias.Canina.PeluqueriaCaninaScreenPrincipal
import com.example.proyectotfg.Tiendas.Peluquerias.Hombre.PeluqueriaHombreScreenPrincipal
import com.example.proyectotfg.Tiendas.Peluquerias.Mujer.PeluqueriaMujerScreenPrincipal
import com.example.proyectotfg.Tiendas.Peluquerias.PeluqueriaScreenPrincipal
import com.example.proyectotfg.Tiendas.Pescaderias.PescaderiasScreenPrincipal
import com.example.proyectotfg.Tiendas.Supermercados.SupermercadosScreenPrincipal
import com.example.proyectotfg.mapa.ScreenPrincipalMapa
import com.example.proyectotfg.tienda.PantallaCesta
import com.example.proyectotfg.tienda.PantallaTienda
import com.example.proyectotfg.tienda.TiendaViewModel

//import com.example.proyectotfg.mapa.ScreenPrincipalMapa


@Composable
fun GuiaMonforteApp(){
    val navController = rememberNavController()
    val viewModel: TiendaViewModel = viewModel()
    NavHost(navController = navController, startDestination = "home"){
        composable("home"){ HomeScreen(navController) }
        composable("historia"){ HistoriaScreen(navController) }
        composable("lugares"){ LugaresScreen(navController) }
        composable("fiestas y tradiciones"){ FiestasYTradicionesScreen(navController) }
        composable("lugares_monforte") { LugaresMonforteScreen(navController) }
        composable("lugares_orito") { LugaresOritoScreen(navController) }
        composable("lugares_capitana"){ LugaresLaCapitanaScreen(navController) }
        composable("lugares_alenda"){ LugaresAlendaScreen(navController) }
        composable("lugares_Fontllop"){ FontLlopScreen(navController) }
        composable("fiestas_monforte"){ FiestasMonforteScreenPrincipal(navController) }
        composable("fiestas_orito"){ FiestasOritoScreenPrincipal(navController) }
        composable("fiestasEnMonforte") { FiestasEnMonforteScreen(navController) }
        composable("fiestasEnSanRamon") { FiestasSanRamon (navController) }
        composable("fiestasSanRoque") { FiestasSanRoque(navController) }
        composable("fiestasMedievales") { FiestasMedievales(navController) }
        composable("fiestasSantoCristo") { FiestasSantoCristo(navController) }
        composable("fiestasVirgenOrito"){ FiestasVirgenOritoScreen(navController) }
        composable("fiestasSanPascual"){ FiestasSanPascualScreen(navController) }
        composable("mapa"){ ScreenPrincipalMapa(navController) }
        composable("inmobiliaria"){}
        composable("mapa_monforte"){}
        composable("restaurantes"){RestaurantesScreen(navController)}
        composable("tiendas") {TiendasScreenPrincipal(navController)}
        composable("supermercados") { SupermercadosScreenPrincipal(navController)}
        composable("carnicerias") { CarniceriasScreenPrincipal(navController)}
        composable("pescaderias"){ PescaderiasScreenPrincipal(navController)}
        composable ("mecanicos") {MecanicoScreenPrincipal(navController)}
        composable ("opticas") {OpticaScreenPrincipal(navController)}
        composable ("peluqueria") {PeluqueriaScreenPrincipal(navController)}
        composable ("peluqueria_hombre") {PeluqueriaHombreScreenPrincipal(navController)}
        composable ("peluqueria_mujer") {PeluqueriaMujerScreenPrincipal(navController)}
        composable ("peluqueria_canina") {PeluqueriaCaninaScreenPrincipal(navController)}
        composable("serviciosPublicos") { ServiciosPublicosScreenPrincipal(navController)}
        composable("ayuntamiento") { AyuntamientoScreenPrincipal(navController)}
        composable("ayuntamiento_edificio") { AyuntamientoEdificioScreenPrincipal(navController)}
        composable("centro_juvenil") {CentroJuvenilScreenPrincipal(navController)}
        composable("serviciosSociales"){ServiciosSocialesScreenPrincipal(navController)}
        composable("centrosEducativos"){ CentrosEducativosScreenPrincipal(navController)}
        composable("colegios"){ColegiosScreenPrincipal(navController)}
        composable("institutos"){InstitutosScreenPrincipal(navController)}
        composable("guarderias") {GuarderiasScreenPrincipal(navController)}
        composable("zonasDeportivas") { ZonasDeportivasScreenPrincipal(navController)}
        composable("parques"){ ParquesScreenPrincipal(navController) }
        composable("panaderias"){ PanaderiasScreenPrincipal(navController) }
        composable("inmobiliaria") { InmobiliariaScreenPrincipal(navController)  }
        //composable("inmobiliariaMonforte") { InmobiliariaMonforteScreenPrincipal(navController) }
        composable("casasAlquilerMonforte"){ CasasAlquilerMonforte(navController) }
        composable("casasVentaMonforte"){ CasasVentaMonforte(navController) }
        composable("tienda") { PantallaTienda(viewModel, navController) }
        composable("cesta") { PantallaCesta(viewModel, navController) }
        composable ("pantalla_menu"){ PantallaMenu(navController) }
    }
    }
