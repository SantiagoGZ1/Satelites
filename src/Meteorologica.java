import java.util.Scanner;
import java.util.Random;
public class Meteorologica extends Satelite {

  public Meteorologica(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, vidaUtil, influenciaMeteorologica);

  }

  //Metodo
  public void predecirClima(){
    //datos en colombia
    Scanner sc = new Scanner(System.in);
    System.out.println("¿En que ciudad estás ubicado?");
    String ubicacion = sc.nextLine();
    Random random = new Random();
    int temperatura =  random.nextInt(56) - 15;
    int lluviaPorscentaje = random.nextInt(101);
    if (temperatura >= 30 ){
      System.out.println("El clima va a ser caluroso y humedo" + "\n" + "Temperatura:" + temperatura + "°");
    }else if(temperatura >= 25 &&  temperatura < 29){
      System.out.println("El clima va a ser caluroso y seco" + "\n" + "Temperatura: " + temperatura + "°");
    }else if (temperatura >= 9 && temperatura <= 24){
      System.out.println("Está nublado" + "\n" + "Temperatura: " + temperatura + "°" + "\n" + "Lluvia: " + lluviaPorscentaje + "%");
    }else {
      System.out.println("Hay probabilidades de helada: " + "\n" + "Temperatura: " + temperatura + "°" + "\n" + "Lluvia: " + lluviaPorscentaje + "%");
    }
  }
}
