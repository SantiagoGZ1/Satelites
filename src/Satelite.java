public class Satelite implements Informe {
  private String tipo;
  private String ubicacionOrientacion;
  private int trayectoria;
  private int cantidadDatos;
  private String tipoDatos;
  private double vidaUtil;
  private String influenciaMeteorologica;

  //Constructor
  public Satelite(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    this.tipo = tipo;
    this.ubicacionOrientacion = ubicacionOrientacion;
    this.trayectoria = trayectoria;
    this.cantidadDatos = cantidadDatos;
    this.tipoDatos = tipoDatos;
    this.vidaUtil = vidaUtil;
    this.influenciaMeteorologica = influenciaMeteorologica;
  }


  //******
  //Metodos mostrar info
  public void mastrarInfo(){ //polimorfismo
    //TODO Mostrar info general de cada satelite
  }

  @Override
  public String toString() {
    return "Satelites" +
        "Tipo: " + tipo + "\n" +
        "Ubicacion Orientacion: " + ubicacionOrientacion + "\n" +
        "Trayectoria: " + trayectoria + "\n" +
        "Cantidad Datos: " + cantidadDatos + "\n" +
        "Tipo Datos: " + tipoDatos + "\n" +
        "Vida Util: " + vidaUtil + "\n" +
        "Influencia Meteorologica: " + influenciaMeteorologica + "\n";
  }
}
//espionaje e investigacion cientifica