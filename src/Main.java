//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Meteorologica meteorologica =  new Meteorologica("volador","jose",22, 40,"el mejor",40.3,"mucho viento" );

    System.out.println(meteorologica.toString());
    meteorologica.predecirClima();
  }
}