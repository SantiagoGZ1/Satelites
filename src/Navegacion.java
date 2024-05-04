import java.util.Random;
import java.util.Scanner;

//gps
//coordenadas actuales: latitud, longitud
//destino
//sensor gps
public class Navegacion extends Satelite implements Conectividad {
  private int latitud, longitud;
  private String sensorGps;
  private String direccion;
  private float distancia;
  private int conectividad;

  public Navegacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidadTiempo, String influenciaMeteorologica, String sensorGps) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidadTiempo, influenciaMeteorologica);
    this.latitud = latitud;
    this.longitud = longitud;
    this.sensorGps = sensorGps;
    this.direccion = direccion;
    this.distancia = distancia;
    this.conectividad = conectividad;
  }

  public int getConectividad() {
    return conectividad;
  }

  public void setConectividad(int conectividad) {
    this.conectividad = conectividad;
  }

  //Metodos
  public void precision() {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cual es tu destino?");
    String ubi = sc.nextLine();
    Random random = new Random();
    latitud = random.nextInt(50);
    longitud = random.nextInt(80);
    distancia = random.nextFloat(100.0F);
    System.out.println("Ubicacion actual: " + "\n" +
        "Latitud: " + latitud + "\n" +
        "Longitud: " + longitud);

    System.out.println("Destino: " + ubi + "\n" +
        "Latitud: " + latitud + "\n" +
        "Longitud: " + longitud);
    System.out.println("Usted se encuentra a " + distancia + "KM de distancia del destino");

    setUtilidadTiempo(getUtilidadTiempo() - 2);
    System.out.println("nueva vida: " + getUtilidadTiempo());
  }

  @Override
  public void calcularConectividad() {
    System.out.println("Calculando conectividad de navegacion GPS...");
    Random random = new Random();
    conectividad = random.nextInt(91) + 10;
    setConectividad(conectividad);
    System.out.println("Conectividad actual GPS: " + getConectividad());
    if (getConectividad() < 50) {
      mejorarConectividad();
    } else {
      System.out.println("Conexion estable");
    }
  }

  @Override
  public void mejorarConectividad() {
    System.out.println("Mejornado calidad...");
    setConectividad(getConectividad() + 20);
    System.out.println("Nueva conexion: " + getConectividad());
  }
}

