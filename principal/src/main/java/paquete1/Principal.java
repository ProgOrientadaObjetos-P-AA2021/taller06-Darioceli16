package paquete1;

import java.util.Scanner;
import paquete2.Enfermero;
import paquete2.EntidadHospital;
import paquete2.Hospital;
import paquete2.Medico;

/**
 *
 * @author Smart
 */
public class Principal {

    public static void main(String[] args) {

        ListaMedico[] ListaMedicos;
        ListaEnfermero[] ListaEnfermeros;
        Scanner sc = new Scanner(System.in);
        String nomH, dir, ci, pro;
        String nombreMedico, Especialidad, nombreEnfermero, tipoContrato;
        int nE, nM, cE;
        double sueldo_medico, sueldo_enfermero;

        System.out.print("Ingrese el nombre del hospital: ");
        nomH = sc.nextLine();
        System.out.print("Ingrese la direccion: ");
        dir = sc.nextLine();
        System.out.print("Ingres el nombre de la cuidad: ");
        ci = sc.nextLine();
        System.out.print("INgrese el nombre de la provincia: ");
        pro = sc.nextLine();
        System.out.print("Ingrese el numero de especialidades: ");
        nE = sc.nextInt();
        System.out.println("");
        System.out.print("Cuantos medicos hay: ");
        nM = sc.nextInt();

        Medico[] ListaMedico = new Medico[nM];
        for (int i = 0; i < nM; i++) {
            sc.nextLine();
            System.out.print("Ingrese nombre del médico " + (i + 1) + ": ");
            nombreMedico = sc.nextLine();
            System.out.print("Ingrese la especialidad " + (i + 1)
                    + ": ");
            Especialidad = sc.nextLine();
            System.out.print("Ingrese el sueldo que recibe " + (i + 1) + ": ");
            sueldo_medico = sc.nextDouble();
            EntidadHospital h = new EntidadHospital();
            Medico m = new Medico(nombreMedico, Especialidad, sueldo_medico);
            ListaMedico[i] = m;
        }
        System.out.println("");
        System.out.print("Cuantos enfermeros(as) hay: ");
        cE = sc.nextInt();
        Enfermero[] ListaEnfermero = new Enfermero[cE];

        for (int i = 0; i < cE; i++) {
            sc.nextLine();
            System.out.print("Ingrese en nombre del enfermero(a) " + (i + 1)
                    + ": ");
            nombreEnfermero = sc.nextLine();
            System.out.print("Ingrese el tipo de contrato del enfermero(a) puede ser (nombramiento, contrato) "
                    + (i + 1) + ": ");
            tipoContrato = sc.nextLine();
            System.out.print("Ingrese el sueldo que recibe " + (i + 1)
                    + ": ");
            sueldo_enfermero = sc.nextDouble();
            Enfermero enf = new Enfermero(nombreEnfermero, tipoContrato, sueldo_enfermero);
            ListaEnfermero[i] = enf;
        }
        EntidadHospital hosp = new EntidadHospital(nomH, dir, ci,
                pro, nE, ListaMedico, ListaEnfermero);
        System.out.printf("\n%s\n", hosp);
    }

}
