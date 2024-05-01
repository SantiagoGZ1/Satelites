public class SateliteTv extends Satelites {
  public SateliteTv(String tipo, String ubicacionOrientacion, int trayectoria, int cantidadDatos, String tipoDatos, double vidaUtil, String influenciaMeteorologica) {
    super(tipo, ubicacionOrientacion, trayectoria, cantidadDatos, tipoDatos, vidaUtil, influenciaMeteorologica);
  }

  @Override
  public String mostrarInfoEstadisticas() {
    return "";
  }
}
