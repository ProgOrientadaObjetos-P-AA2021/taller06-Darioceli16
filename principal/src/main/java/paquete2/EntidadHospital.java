/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Smart
 */
public class EntidadHospital {

    private String nombreH;
    private String direccion;
    private String ciudad;
    private String provincia;
    private int numeroE;
    private Medico[] me;
    private Enfermero[] en;

    public EntidadHospital(String nom, String dir, String ci,
            String pro, int e, Medico[] m, Enfermero[] p) {
        nombreH = nom;
        direccion = dir;
        ciudad = ci;
        provincia = pro;
        numeroE = e;
        me = m;
        en = p;
    }

    public EntidadHospital() {

    }
    public void establecerNombreHo(String n) {
        nombreH = n;
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

    public void establecerNumeroE(int n) {
        numeroE = n;
    }

    public String obtenerNombreH() {
        return nombreH;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerCiudadH() {
        return ciudad;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public int obtenerNumeroE() {
        return numeroE;
    }

    public Medico[] obtenerListaMedicos() {
        return me;
    }

    public Enfermero[] obtenerListaEnfermeros() {
        return en;
    }

    public double obtenerTotalSueldo(Medico[] m, Enfermero[] enf) {
        double tSueldo = 0;
        double tSueldoE = 0;
        for (int i = 0; i < m.length; i++) {
            tSueldo += m[i].sueldoM;
        }

        for (int i = 0; i < enf.length; i++) {
            tSueldo += enf[i].sueldo;
        }
        return tSueldo + tSueldoE;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("HOSPITAL %s\nDirección: %s\nCiudad: %s"
                + "\nProvincia: %s\nNúmero de especialidades: %d"
                + "\nListado de médicos\n", obtenerNombreH(),
                obtenerDireccion(),
                obtenerCiudadH(), obtenerProvincia(),
                obtenerNumeroE());
        for (int i = 0; i < obtenerListaMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerListaMedicos()[i].obtenerNombre(),
                    obtenerListaMedicos()[i].obtenerSueldoM(),
                    obtenerListaMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);
        for (int i = 0; i < obtenerListaEnfermeros().length; i++) {
            cadena = String.format("%s - %s - sueldo: %.2f - %s\n", cadena,
                    obtenerListaEnfermeros()[i].obtenerNombre(),
                    obtenerListaEnfermeros()[i].obtenerSueldoE(),
                    obtenerListaEnfermeros()[i].obtenerTipo());
        }
        cadena = String.format("%s \nTotal de sueldos a pagar por mes: %.2f",
                cadena, obtenerTotalSueldo(obtenerListaMedicos(),
                        obtenerListaEnfermeros()));
        return cadena;
    }
}
