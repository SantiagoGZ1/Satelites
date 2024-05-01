public abstract class Satelites {
  private String tipo;
  private String ubicacionOrientacion;
  private int trayectoria;
  private int cantidadDatos;
  private String tipoDatos;
  private double vidaUtil;
  private String influenciaMeteorologica;

  //Constructor
  public Satelites(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    this.tipo = tipo;
    this.ubicacionOrientacion = ubicacionOrientacion;
    this.trayectoria = trayectoria;
    this.cantidadDatos = cantidadDatos;
    this.tipoDatos = tipoDatos;
    this.vidaUtil = vidaUtil;
    this.influenciaMeteorologica = influenciaMeteorologica;
  }

  //Gets & sets
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getUbicacionOrientacion() {
    return ubicacionOrientacion;
  }

  public void setUbicacionOrientacion(String ubicacionOrientacion) {
    this.ubicacionOrientacion = ubicacionOrientacion;
  }

  public int getTrayectoria() {
    return trayectoria;
  }

  public void setTrayectoria(int trayectoria) {
    this.trayectoria = trayectoria;
  }

  public int getCantidadDatos() {
    return cantidadDatos;
  }

  public void setCantidadDatos(int cantidadDatos) {
    this.cantidadDatos = cantidadDatos;
  }

  public String getTipoDatos() {
    return tipoDatos;
  }

  public void setTipoDatos(String tipoDatos) {
    this.tipoDatos = tipoDatos;
  }

  public double getVidaUtil() {
    return vidaUtil;
  }

  public void setVidaUtil(double vidaUtil) {
    this.vidaUtil = vidaUtil;
  }

  public String getInfluenciaMeteorologica() {
    return influenciaMeteorologica;
  }

  public void setInfluenciaMeteorologica(String influenciaMeteorologica) {
    this.influenciaMeteorologica = influenciaMeteorologica;
  }
  //******
  //Metodos mostrar info
  public void mastrarInfo(){ //polimorfismo
    //TODO Mostrar info general de cada satelite
  }

  public abstract String mostrarInfoEstadisticas(); //Metodo abstracto

}
