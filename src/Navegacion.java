import java.util.Random;
import java.util.Scanner;

public class Navegacion extends Satelite implements Conectividad {
  private int latitud, longitud;
  private String sensorGps;
  private String direccion;
  private float distancia;
  private int conectividad;

  //Constructor de lo que debe tener un satélite de navegación

  public Navegacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidadTiempo, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidadTiempo, influenciaMeteorologica);
    this.latitud = latitud;
    this.longitud = longitud;
    this.sensorGps= sensorGps;
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
    if(getUtilidadTiempo()>5){
      Scanner sc = new Scanner(System.in);
      System.out.println("¿Cual es tu destino?");
      String ubicacion = sc.nextLine();
      Random random = new Random();
      latitud = random.nextInt(50);
      longitud = random.nextInt(80);
      distancia = random.nextFloat(100.0F);
      System.out.println("Su ubicación actual es: " + "\n" +
              "Latitud: " + latitud + "\n" +
              "Longitud: " + longitud);

      System.out.println("Su destino es: " + ubicacion + "\n" +
              "Latitud: " + latitud + "\n" +
              "Longitud: " + longitud);
      System.out.println("Usted se encuentra a " + distancia + "Km de distancia del destino \n \n");

      setUtilidadTiempo(getUtilidadTiempo() - 2);}
    else {
      System.out.println("\n Error: La vida útil del sátelite ha llegado a su límite. El satélite debe ser reemplazado. \n");
    }
  }

  @Override
  public void calcularConectividad() {
   if(getUtilidadTiempo()>5){
     System.out.println("Calculando conectividad de navegación GPS...");
     Random random = new Random();
     conectividad = random.nextInt(91) + 10;
     setConectividad(conectividad);
     System.out.println("Conectividad actual GPS: " + getConectividad());
     if (getConectividad() < 50) {
       mejorarConectividad();
     } else {
       System.out.println("Conexión estable \n");
     }
   } else {
     System.out.println("\n Error: La vida útil del sátelite ha llegado a su límite. El satélite debe ser reemplazado. \n");
   };
  }

  @Override
  public void mejorarConectividad() {
    System.out.println("Mejorando calidad...");
    setConectividad(getConectividad() + 20);
    System.out.println("Nueva conexión: " + getConectividad());
  }


}

