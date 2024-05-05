public class Main {
  public static void main(String[] args) {

    //Creación de satélites de Navegación
    System.out.println("*** SATELITE NAVEGACION ***");
    Navegacion GalileoIOV = new Navegacion("Sistema de posicionamiento global","Cumbres de la montana",63,369,"Drones",39,"Nieve");

    Navegacion GalaxyTracker = new Navegacion("Mapas interactivos","El gran canon",36,693,"Cascos RV",96,"Lluvia");

    Navegacion CosmoNavigator = new Navegacion("GPS","Desierto del Sahara",63,369,"Videografía aerea",69,"Sequia");

    Reporte reporteNavegacion = new Reporte();
    reporteNavegacion.agregarSatNavegacion(GalileoIOV);
    reporteNavegacion.agregarSatNavegacion(GalaxyTracker);
    reporteNavegacion.agregarSatNavegacion(CosmoNavigator);

    //Métodos Navegación

    GalileoIOV.precision();
    GalileoIOV.calcularConectividad();

    //Creación de satélites de comunicación
    System.out.println("*** SATELITE COMUNICACIÓN ***");
    Comunicacion connectSar = new Comunicacion("Banda Ancha", "Órbita geoestacionaria sobre el Océano Pacífico", 36000, 5000, "Transmisión de video en alta definición (HD)", 90, "Minima");

    Comunicacion LinkLaser = new Comunicacion("Comunicaciones de Emergencia", "Órbita polar, cubriendo áreas remotas", 800, 100, " Mensajes de text", 80, "Moderada");

    Comunicacion TeleComet = new Comunicacion("Comunicaciones Militares Seguras", "Órbita elíptica, patrullando regiones estratégicas", 1500, 2000, " Transmisiones encriptadas de voz y datos", 95, "Alta");

    //Reportes
    Reporte reporteComunicacion = new Reporte();
    reporteComunicacion.agregarSatComunicacion(connectSar);
    reporteComunicacion.agregarSatComunicacion(LinkLaser);
    reporteComunicacion.agregarSatComunicacion(TeleComet);

    //Metodos Comunicacion
    connectSar.activarSenal();
    connectSar.calcularConectividad();



    //Creación de satélites de meteorología
    System.out.println("*** SATELITE METEOROLOGICO ***");
    Meteorologica weatherWatcher= new Meteorologica("Geosincrónica","suroccidente", 253,5000, "infrarojos",1200, "Nubosidad",5000);

    Meteorologica stormSentinel= new Meteorologica("Polar", "órbitas bajas de la Tierra (LEO)", 52, 2000, "Vapor de agua",896,"Vientos",10000);

    Meteorologica skyGuardian= new Meteorologica("Contaminación atmosférica", "Órbita elíptica",458, 542, "Fenómenos climáticos severos",12,"Humedad del suelo",8000);

    Reporte reporteMeteorologica= new Reporte();
    reporteMeteorologica.agregarSatMeteorologica(weatherWatcher);
    reporteMeteorologica.agregarSatMeteorologica(stormSentinel);
    reporteMeteorologica.agregarSatMeteorologica(skyGuardian);


    //Metodos Meteorologica

    weatherWatcher.predecirClima();
    weatherWatcher.calibrarSensor();
    weatherWatcher.tomarFoto();
    System.out.println("********");
    //Reportes

    System.out.println("*** REPORTES ***");
    reporteComunicacion.reporteComunicaciones();
    reporteNavegacion.reporteNavegacion();
    reporteMeteorologica.reporteMeteorologica();


  }




}