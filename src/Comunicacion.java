//tv y cel
import java.util.Random;
import java.util.Scanner;
public class Comunicacion extends Satelite {
  public Comunicacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidad, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidad, influenciaMeteorologica);
  }


  public void infoUsuarios(){
    String clientesBronce = "100 canales de Televión nacional." + "\n" + "30 megas internet";
    String clientesplata = "200 canales de Televión nacional." + "\n" + "60 megas internet";
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el id del usuario (entre 1 y 99)");
    int id= sc.nextInt();

    if (id >= 1 && id <= 50){
      System.out.println(clientesBronce);
    } else if (id >= 51 && id <= 99) {
      System.out.println(clientesplata);
    }else {
      System.out.println("Error, el ID no existe");
    }
  }

  @Override
  public void vidaUtil(){

  }
  @Override
  public void informe() {
  }
}