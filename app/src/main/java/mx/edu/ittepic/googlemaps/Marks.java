package mx.edu.ittepic.googlemaps;

public class Marks {
    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Marks() {

    }

    public Marks(Double latitud, Double longitud) {

        this.latitud = latitud;
        this.longitud = longitud;
    }

    Double latitud,longitud;


}
