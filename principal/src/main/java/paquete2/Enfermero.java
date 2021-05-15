
package paquete2;

public class Enfermero {
    
    
    private String nombre;
    private String tipo;
    double sueldo;

    public Enfermero(String nom, String e, double s) {
        nombre = nom;
        tipo = e;
        sueldo = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldoE(double n) {
        sueldo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoE() {
        return sueldo;
    }

    
}
