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
        this.meteorologicas = new Meteorologica[3];
        this.contadorMeteorologica = 0;
        this.comunicaciones = new Comunicacion[3];
        this.contadorComunicacion = 0;
    }

//Método de agregación para cada satélite

    public void agregarSatNavegacion(Navegacion navegacion) {
        if (contadorNavegacion < this.navegaciones.length) {
            this.navegaciones[contadorNavegacion] = navegacion;
            contadorNavegacion++;
        } else {
            System.out.println("No se pueden enviar más satélites a la órbita \n");
        }
    }

    public void agregarSatComunicacion(Comunicacion comunicacion) {
        if (contadorComunicacion < this.comunicaciones.length) {
            this.comunicaciones[contadorComunicacion] = comunicacion;
            contadorComunicacion++;
        } else {
            System.out.println("No se pueden enviar más satélites a la órbita \n");
        }
    }

    public void agregarSatMeteorologica(Meteorologica meteorologica) {
        if (contadorMeteorologica < this.meteorologicas.length) {
            this.meteorologicas[contadorMeteorologica] = meteorologica;
            contadorMeteorologica++;
        } else {
            System.out.println("No se pueden enviar más satélites a la órbita \n");
        }

    }

    //Reporte por cada tipo de satélite

    public void reporteNavegacion() {
        System.out.println("Los satélites del área de navegación son: \n"+
                Arrays.toString(navegaciones));
        }

    public void reporteComunicaciones(){
        System.out.println("Los satélites el área de comunicaciones son: \n" +
                Arrays.toString(comunicaciones));
    }

    public void reporteMeteorologica(){
        System.out.println("Los satélites del área de meteorología son: \n"+
                Arrays.toString(meteorologicas));
    }


    //Arrays.toString(navegaciones)
}
