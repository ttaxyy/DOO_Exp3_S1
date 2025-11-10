package model;

/**
 * Clase que extiende Persona. Añade el atributo "rol".
 */

public class Empleado extends Persona{
    private String rol;

    public Empleado(int id, String nombre, String correo, int telefono, Direccion direccion, String rol) {
        super(id, nombre, correo, telefono, direccion); //Llama al constructor padre (Persona)
        this.rol = rol;
    }

    public String getRol() {return rol;}
    public void setRol(String rol) {this.rol = rol;}

    @Override
    public String toString() {
        return String.format("Nombre: %s, Correo: %s, Teléfono: %s, Dirección: %s, Rol: %s",  this.getNombre(), this.getCorreo(), this.getTelefono(), this.getDireccion(), rol);
    }
}
