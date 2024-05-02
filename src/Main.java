//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Meteorologica satClimahoy =  new Meteorologica("volador","jose",22, 40,"el mejor",40.3,"mucho viento" );


    Navegacion astroTechSat = new Navegacion("nose", "sur", 40, 100, "buenos", 100, "tornados", "manuela");

    //aqui pones el objeto
    Comunicacion satComunicacion = new Comunicacion("babab", "norte", 20, 40, "jfjfjfj",54, "viento");

//    System.out.println(satComunicacion.toString());
//    satComunicacion.infoUsuarios();

    System.out.println(satClimahoy.toString());

    satClimahoy.predecirClima();
    System.out.println("**********");
    satClimahoy.informe();
    System.out.println(astroTechSat.toString());
    astroTechSat.precision();

  }



}