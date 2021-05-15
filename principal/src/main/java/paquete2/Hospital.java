package paquete2;

public class Hospital {

    private String nombreCiudad;
    private String provinciaCiudad;

    public Hospital(String nom, String n) {
        nombreCiudad = nom;
        provinciaCiudad = n;
    }

    public void establecerNombre(String nom) {
        nombreCiudad = nom;
    }

    public void establecerProvincia(String n) {
        provinciaCiudad = n;
    }


    public String obtenerNombre() {
        return nombreCiudad;
    }

    public String obtenerProvincia() {
        return provinciaCiudad;
    }


}
