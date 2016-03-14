package miapp;

import javax.swing.JOptionPane;
/**
 * Clase donde se recogen los contactos y permite realizar modificaciones.
 * @author Miguel Gonzalez
 * @version 6.3
 */
public class Libreta {

    private String nombre, dni;

    int k = Integer.parseInt(JOptionPane.showInputDialog("Numero grupos"));

    private Grupo arrayGrupo[] = new Grupo[k];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Grupo[] getArrayGrupo() {
        return arrayGrupo;
    }

    public void setArrayGrupo(Grupo[] arrayGrupo) {
        this.arrayGrupo = arrayGrupo;
    }

    /**
     * Añade un contacto.
     * @return
     */
    public String engadir() {
        nombre = JOptionPane.showInputDialog("Introduce nombre del contacto");
        dni = JOptionPane.showInputDialog("Introduce el DNI del contacto");
        return nombre;
    }

    /**
     * Metodo para comprobar si hay hueco libres en la libreta.
     * @return En caso de que haya huecos, retorna i, si no, devuelve -1.
     */
    public int cualLibre() {
        int i;
        for (i = 0; i < arrayGrupo.length; i++) {
            if (arrayGrupo[i].getNombreGrupo().equals("")){
            JOptionPane.showMessageDialog(null, "Hay hueco");
            return i;
            }
        }
        return -1;
    }

    /**
     *
     */
    public void listar() {
    }

    
}
