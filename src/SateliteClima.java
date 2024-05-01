public class SateliteClima extends Satelites {

  public SateliteClima(String tipo, String bbicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    super(tipo, bbicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, vidaUtil, influenciaMeteorologica);
  }

  //Metodo
  public void predecirClima(){

  }
  @Override
  public String mostrarInfoEstadisticas(){
    return "";
  }
}
