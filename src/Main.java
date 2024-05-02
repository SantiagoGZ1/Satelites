//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Meteorologica meteorologica =  new Meteorologica("volador","jose",22, 40,"el mejor",40.3,"mucho viento" );
    Navegacion astroTechSat = new Navegacion("nose", "sur", 40, 100, "buenos", 100, "tornados", "manuela");


    System.out.println(meteorologica.toString());
    meteorologica.predecirClima();
    System.out.println("**********");
    System.out.println(astroTechSat.toString());
    astroTechSat.precision();

  }
}