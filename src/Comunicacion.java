//tv y cel
import java.util.Random;
import java.util.Scanner;
public class Comunicacion extends Satelite {

  //private String idHogar;
  private String paquete;

  public Comunicacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, vidaUtil, influenciaMeteorologica);
    this.paquete = paquete;
  }


  public void asignarPaquete(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el id de su hogar");
    String idHogar= sc.nextLine();
    System.out.println("¿Desea contratar un paquete para su hogar? n/ 1. Sí n/ 2.no");
    int eleccionPaquete=sc.nextInt();
    Random random= new Random();
    int paqueteRandom= random.nextInt(3);

    if (eleccionPaquete==1){
      switch (paqueteRandom){

        case 1:
          System.out.println("Según el id de su hogar se le asignó el paquete: n/ 1. Paquetes básicos: selección de canales esenciales que cubren una variedad de géneros como noticias, entretenimiento, deportes y canales locales." + "n/" );
      }
    }
  }
}