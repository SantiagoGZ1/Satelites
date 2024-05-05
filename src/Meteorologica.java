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
    if(getUtilidadTiempo()>5){
      Scanner sc = new Scanner(System.in);
      System.out.println("¿De cuál ciudad deseas saber el clima?");
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
    }else {
      System.out.println("\n Error: La vida útil del sátelite ha llegado a su límite. El satélite debe ser reemplazado. \n");
    }
  }

  @Override
  public void calibrarSensor() {
    System.out.println("Calibrando sensor de la cámara de " + pxCamara + "MP");
  }

  @Override
  public void tomarFoto() {
    if(getUtilidadTiempo()>5){
      System.out.println("Tomando foto...");
      System.out.println("Foto tomada");
      //disminuye la vida util por su uso
      setUtilidadTiempo(getUtilidadTiempo() -2);
    }else {
      System.out.println("\n Error: La vida útil del sátelite ha llegado a su límite. El satélite debe ser reemplazado. \n");
    }


  }
}
