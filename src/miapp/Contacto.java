package miapp;
/**
 * Clase que recoge los datos de las personas que se añadiran.
 * @author Miguel Gonzalez
 * @version 9239290.292
 */
public class Contacto {

    private String nombre, apellido, email, telefono;

    
    /**
     * Constructor con parametros de la clase contacto.
     * @param nombre Nombre del contacto
     * @param apellido Apellido del contacto
     * @param email Email del contacto.
     * @param telefono Telefono del contacto.
     */
    
    public Contacto(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
