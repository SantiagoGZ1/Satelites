//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Meteorologica satClimahoy =  new Meteorologica("volador","jose",22, 40,"el mejor",40.3,"mucho viento" );

    Comunicacion comunicacion = new Comunicacion("hola", "lejos",20, 10, "nose", 10.0,"si");

    System.out.println(satClimahoy.toString());
    satClimahoy.predecirClima();

  }



}