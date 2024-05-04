public class Satelite {
  private String tipo;
  private String ubicacionOrientacion;
  private int trayectoria;
  private int cantidadDatos;
  private String tipoDatos;
  private double utilidadTiempo;
  private String influenciaMeteorologica;

  //Constructor
  public Satelite(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double utilidadTiempo, String influenciaMeteorologica) {
    this.tipo = tipo;
    this.ubicacionOrientacion = ubicacionOrientacion;
    this.trayectoria = trayectoria;
    this.cantidadDatos = cantidadDatos;
    this.tipoDatos = tipoDatos;
    this.utilidadTiempo = utilidadTiempo;
    this.influenciaMeteorologica = influenciaMeteorologica;
  }

  public String getTipo() {
    return tipo;
  }

  public String getUbicacionOrientacion() {
    return ubicacionOrientacion;
  }

  public int getTrayectoria() {
    return trayectoria;
  }

  public int getCantidadDatos() {
    return cantidadDatos;
  }

  public String getTipoDatos() {
    return tipoDatos;
  }

  public String getInfluenciaMeteorologica() {
    return influenciaMeteorologica;
  }

  public double getUtilidadTiempo() {
    return utilidadTiempo;
  }

  public void setUtilidadTiempo(double utilidadTiempo) {
    this.utilidadTiempo = utilidadTiempo;
  }

  @Override
  public String toString() {
    return "Satelites" +
        "Tipo: " + tipo + "\n" +
        "Ubicacion Orientacion: " + ubicacionOrientacion + "\n" +
        "Trayectoria: " + trayectoria + "\n" +
        "Cantidad Datos: " + cantidadDatos + "\n" +
        "Tipo Datos: " + tipoDatos + "\n" +
        "Vida Util: " + utilidadTiempo + "\n" +
        "Influencia Meteorologica: " + influenciaMeteorologica + "\n ******* \n";
  }

}

//espionaje e investigacion cientifica