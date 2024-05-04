import java.util.Arrays;
public class Reporte {
    private Navegacion[] navegaciones;
    private int contadorNavegacion;
    private Comunicacion[] comunicaciones;
    private int contadorComunicacion;
    private Meteorologica[] meteorologicas;
    private int contadorMeteorologica;

    public Reporte() {
        this.navegaciones = new Navegacion[3];
        this.contadorNavegacion = 0;
        this.meteorologicas = new Meteorologica[10];
        this.contadorMeteorologica = 0;
        this.comunicaciones = new Comunicacion[10];
        this.contadorComunicacion = 0;
    }


//Método de agregación para cada satélite

    public void agregarSatNavegacion(Navegacion navegacion) {
        if (contadorNavegacion < this.navegaciones.length) {
            this.navegaciones[contadorNavegacion] = navegacion;
            contadorNavegacion++;
        } else {
            System.out.println("No se pueden enviar más satélites a la órbita");
        }
    }

    //es que me pierdo, es para enforcarnos en uno :)
    public void agregarSatComunicacion(Comunicacion comunicacion) {
        if (contadorComunicacion < this.comunicaciones.length) {
            this.comunicaciones[contadorComunicacion] = comunicacion;
            contadorComunicacion++;
        } else {
            System.out.println("No se pueden enviar más satélites a la órbita");
        }
    }

    public void agregarSatMeteorologica(Meteorologica meteorologica) {
        if (contadorMeteorologica < this.meteorologicas.length) {
            this.meteorologicas[contadorMeteorologica] = meteorologica;
            contadorMeteorologica++;
        } else {
            System.out.println("No se pueden enviar más satélites a la órbita");
        }

    }

    //Reporte por cada tipo de satélite

    public void reporteNavegacion() {
        System.out.println(Arrays.toString(navegaciones));
        }

    public void reporteComunicaciones(){
        System.out.println(Arrays.toString(navegaciones));
    }

    public void reporteMeteorologica(){
        System.out.println(Arrays.toString(navegaciones));
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "navegaciones=" + Arrays.toString(navegaciones) +
                ", comunicaciones=" + Arrays.toString(comunicaciones) +
                ", meteorologicas=" + Arrays.toString(meteorologicas) +
                '}';
    }

    //Arrays.toString(navegaciones)



}
