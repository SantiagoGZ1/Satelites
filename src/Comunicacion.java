//tv y cel
import java.util.Random;
import java.util.Scanner;
public class Comunicacion extends Satelite implements Conectividad{
  private boolean encriptado;
  private float latencia;
  private int conectividad;


  public Comunicacion(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidad, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, utilidad, influenciaMeteorologica);
    this.encriptado = encriptado;
    this.latencia = latencia;
    this.conectividad = conectividad;
  }

  public int getConectividad() {
    return conectividad;
  }

  public void setConectividad(int conectividad) {
    this.conectividad = conectividad;
  }

  public void activarSenal(){
    if(getUtilidadTiempo()>5){Scanner sc = new Scanner(System.in);
      System.out.println("Seleccione una opción: " + "\n" +
              "1. Activar señal de televisión." + "\n" +
              "2. Activar señal de comunicación: ");
      int option = sc.nextInt();
      switch (option){
        case 1:
          Random random = new Random();
          latencia = random.nextFloat()*100.f;
          System.out.println("Cuenta con 100 canales y hay una latencia de " + latencia + "ms");
          break;
        case 2:
          encriptado = true;
          Random random1 = new Random();
          String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
          StringBuilder codigo = new StringBuilder();
          //StringBuilder es para crear cadenas de texto sin necesidad de hacer un array o lista o lo que saa
          for (int i = 0; i < 10; i++){//itera hasta 10 porque son 10 caracteres
            int index = random1.nextInt(caracteres.length()); //index va a guardar un caracter de "caracteres" de forma aleatoria si sobrepasar el caracteres.lenght (largo de caracteres)
            codigo.append(caracteres.charAt(index));
            //agrega un valor en codigo de la secuencia acutal utilizando la posicion index
            //"append()" es un método de la clase StringBuilder que se utiliza para agregar contenido al final del StringBuilder. En este caso, codigo es un objeto de tipo StringBuilder que está siendo utilizado para construir gradualmente el código alfanumérico.
          }

          System.out.println("La llamada está siendo encriptada por motivos de seguridad");
          System.out.println("Encriptación " + codigo.toString());
          break;
        default:
          System.out.println("Opción errada");
      }
      //disminuye la vida util por su uso
      setUtilidadTiempo(getUtilidadTiempo() -2);}else {
      System.out.println("\n Error: La vida útil del sátelite ha llegado a su límite. El satélite debe ser reemplazado. \n");
    }

  }

  @Override
  public void calcularConectividad() {
    if(getUtilidadTiempo()>5){
      System.out.println("Calculando conectividad de telecomunicaciones...");
      Random random = new Random();
      conectividad = random.nextInt(91) + 10;
      setConectividad(conectividad);
      System.out.println("Conectividad actual telecomunicaciones: "  + getConectividad());

      //solo si la conectividad es menor a 50, llamamos a mejorar conectividad

      if (getConectividad() < 50){
        mejorarConectividad();
      }else {
        System.out.println("Conexión estable");
      } } else {
        System.out.println("\n Error: La vida útil del sátelite ha llegado a su límite. El satélite debe ser reemplazado. \n");

      }
    }


  @Override
  public void mejorarConectividad() {
    System.out.println("Mejorando calidad...");
    setConectividad(getConectividad() + 20);
    System.out.println("Nueva conexión: " + getConectividad());
  }
}