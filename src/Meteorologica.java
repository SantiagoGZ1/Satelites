import java.util.Scanner;
import java.util.Random;
public class Meteorologica extends Satelite {
  //Metodos unicos para calcular meteorologia

  private Clima clima;
  public Meteorologica(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidadTiempo, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidadTiempo, influenciaMeteorologica);
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
    System.out.println("nueva vida: " + getUtilidadTiempo());
  }

}
