public class SateliteGps extends Satelites{

  public SateliteGps(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, vidaUtil, influenciaMeteorologica);
  }

  @Override
  public String mostrarInfoEstadisticas() {
    return "";
  }
}
