package model;

/**
 * Clase base general de persona relacionada a la empresa.
 */

public class Persona {
    private int id;
    private String nombre;
    private String correo;
    private int telefono;
    private Direccion direccion;

    public Persona(int id, String nombre, String correo, int telefono, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}

    public Direccion getDireccion() {return direccion;}
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}

    @Override
    public String toString() {
        return String.format("Nombre: %s, Correo: %s, Teléfono: %s, Dirección: %s",  nombre, correo, telefono, direccion);
    }
}
