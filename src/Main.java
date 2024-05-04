//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {


    Comunicacion comunicacion = new Comunicacion("hola", "lejos", 20, 10, "nose", 10.0, "si");

    Navegacion gps = new Navegacion("si", "sad", 22, 34, "no", 3399.0, "nose", "el mejor");

    Meteorologica meteo = new Meteorologica("adad", "no", 40, 29, "si", 40, "tornados", 40);

    System.out.println(gps.toString());
    meteo.predecirClima();
    meteo.tomarFoto();
  }
}