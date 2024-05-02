import java.util.Random;
import java.util.Scanner;

//gps
//coordenadas actuales: latitud, longitud
//destino
//sensor gps
public class Navegacion extends Satelite {
  private int latitud, longitud;
  private String sensorGps;
  private String direccion;
  private float distancia;

  public Navegacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidad, String influenciaMeteorologica, String sensorGps) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidad, influenciaMeteorologica);
    this.latitud = latitud;
    this.longitud = longitud;
    this.sensorGps = sensorGps;
    this.direccion = direccion;
    this.distancia = distancia;
  }


  //Metodos
  public void precision(){
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cual es tu destino?");
    String ubi = sc.nextLine();
    Random random = new Random();
    latitud = random.nextInt(50);
    longitud = random.nextInt(80);
    distancia = random.nextFloat(100.0F);
    System.out.println("Ubicacion actual " + "\n" +
        "Latitud: "  + latitud + "\n" +
        "Longitud: " + longitud);

    System.out.println("Destino: " + ubi + "\n" +
        "Latitud: "  + latitud + "\n" +
        "Longitud: " + longitud + "\n" +
        "Direccion: " + ubi);

    System.out.println("Usted se encuentra a " + distancia + "KM de distancia del destino" );
  }


  @Override
  public void vidaUtil(){

  }
  @Override
  public void informe() {
  }

}
