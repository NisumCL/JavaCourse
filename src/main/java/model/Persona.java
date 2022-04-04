package model;

import java.util.Date;

public class Persona {

    protected String nombre;
    String apellido;
    Date fechaNacimiento;
    String rut;

    public static void saluda() {
        System.out.println("Hola a todos");
    }

    public void otroSaludo() {
        System.out.println("Este es otro saludo");
    }
}
