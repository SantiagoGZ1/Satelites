import java.util.Random;

public class Clima {
  private int precipitaciones;
  private int humedad;
  private int nubosidad;
  private int viento;
  private int evaporacion;

  // Constructor
  public Clima() {
    // Generar valores aleatorios para las condiciones climáticas
    Random random = new Random();
    precipitaciones = random.nextInt(101);
    humedad = random.nextInt(101);
    nubosidad = random.nextInt(101);
    viento = random.nextInt(101);
    evaporacion = random.nextInt(101);
  }

  // Métodos getters para acceder a las condiciones climáticas
  public int getPrecipitaciones() {
    return precipitaciones;
  }

  public int getHumedad() {
    return humedad;
  }

  public int getNubosidad() {
    return nubosidad;
  }

  public int getViento() {
    return viento;
  }

  public int getEvaporacion() {
    return evaporacion;
  }
}
