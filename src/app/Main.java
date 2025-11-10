package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion(134, "Los Pinos", "Ñuñoa", "Santiago");
        Direccion direccion2 = new Direccion(12, "Los Robles", "Providencia", "Santiago");

        Persona persona1 = new Persona(1, "Juan Smith", "juansmith@mail.com", 912345678, direccion1);
        Empleado empleado1 = new Empleado(2, "Alberto Torres", "atorres1@mail.cl", 991919191, direccion2, "Vendedor");

        System.out.println("Información de persona con ID " + persona1.getId());
        System.out.println(persona1);
        System.out.println("Información de empleado:");
        System.out.println(empleado1);
    }
}