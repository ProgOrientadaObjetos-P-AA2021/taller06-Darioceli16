package paquete2;

public class Medico {

    private String nombre;
    private String especialidad;
    double sueldoM;

    public Medico(String nom, String e, double s) {
        nombre = nom;
        especialidad = e;
        sueldoM = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldoM(double n) {
        sueldoM = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoM() {
        return sueldoM;
    }
}
