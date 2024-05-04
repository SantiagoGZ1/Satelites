//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {


    Navegacion gps = new Navegacion("porfavor","oporfavorfunciona",15,52,"auxlio",1526,"quenosalga");


//    System.out.println(gps.toString());
//    meteo.predecirClima();
//    meteo.tomarFoto();

    Reporte reportePrimerosSatelites= new Reporte();
    reportePrimerosSatelites.agregarSatNavegacion(gps);


    Navegacion nav2= new Navegacion("kdjaksj","ckasjdask",12,52,"dados",1526,"no");
    reportePrimerosSatelites.agregarSatNavegacion(nav2);
    reportePrimerosSatelites.reporteNavegacion();

  nav2.precision();

  reportePrimerosSatelites.reporteNavegacion();


  }
}