import java.util.Scanner;
import java.util.Random;
public class Meteorologica extends Satelite implements Sensor {
  //Metodos unicos para calcular meteorologia

  private int pxCamara;
  private Clima clima;

  public Meteorologica(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidadTiempo, String influenciaMeteorologica, int pxCamara) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidadTiempo, influenciaMeteorologica);
    this.pxCamara = pxCamara;
    this.clima = new Clima();
  }

  //Metodo
  public void predecirClima(){
    //datos en colombia
    Scanner sc = new Scanner(System.in);
    System.out.println("¿En qué ciudad deseas saber el clima?");
    String ubicacion = sc.nextLine();
    Random random = new Random();
    System.out.println("Clima actual en " + ubicacion + "\n" +
        "Precipitaciones: " + clima.getPrecipitaciones() + "%" + "\n" +
        "Humedad: " + clima.getHumedad() + "%" + "\n" +
        "Nubosidad: " + clima.getNubosidad() + "%" + "\n" +
        "Viento: " + clima.getNubosidad() + "%" + "\n" +
        "Evaporación: " + clima.getEvaporacion() + "%");

    //disminuye la vida util por su uso
    setUtilidadTiempo(getUtilidadTiempo() -2);
  }

  @Override
  public void calibrarSensor() {
    System.out.println("Calibrando sensor de la camara de " + pxCamara + "MP");
  }

  @Override
  public void tomarFoto() {
    System.out.println("Tomando foto...");
    System.out.println("Foto tomada");
    //disminuye la vida util por su uso
    setUtilidadTiempo(getUtilidadTiempo() -2);
  }
}
