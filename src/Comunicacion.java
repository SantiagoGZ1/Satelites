//tv y cel
import java.util.Random;
import java.util.Scanner;
public class Comunicacion extends Satelite {
  private boolean encriptado;
  private float latencia;


  public Comunicacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidad, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidad, influenciaMeteorologica);
    this.encriptado = encriptado;
    this.latencia = latencia;
  }

  public boolean isEncriptado() {
    return encriptado;
  }

  public float getLatencia() {
    return latencia;
  }

  public void setEncriptado(boolean encriptado) {
    this.encriptado = encriptado;
  }

  public void setLatencia(float latencia) {
    this.latencia = latencia;
  }

  public void infoUsuarios(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Selecione una opcion: " + "\n" +
        "1. Activar señal de television." + "\n" +
        "2. Activar señal de comunicación: ");
    int option = sc.nextInt();
    switch (option){
      case 1:
        Random random = new Random();
        latencia = random.nextFloat()*100.f;
        System.out.println("Cuenta con 100 canales y hay una latencia de" + latencia + "ms");
        break;
      case 2:
        encriptado = true;
        Random random1 = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder codigo = new StringBuilder();
        //StringBuilder es para crear cadenas de texto sin necesidad de hacer un array o lista o lo que saa
        for (int i = 0; i < 10; i++){
          int index = random1.nextInt(caracteres.length());
          codigo.append(caracteres.charAt(index));
        }

        System.out.println("La llamada está siendo encriptada por motivos de seguridad");
        System.out.println("Ecriptacion " + codigo.toString());
        break;
      default:
        System.out.println("Opcion errada");
    }
  }
}