public class Satelite {
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
    return "Satelites{" +
        "tipo='" + tipo + '\'' +
        ", ubicacionOrientacion='" + ubicacionOrientacion + '\'' +
        ", trayectoria=" + trayectoria +
        ", cantidadDatos=" + cantidadDatos +
        ", tipoDatos='" + tipoDatos + '\'' +
        ", vidaUtil=" + vidaUtil +
        ", influenciaMeteorologica='" + influenciaMeteorologica + '\'' +
        '}';
  }
}
//espionaje e investigacion cientifica