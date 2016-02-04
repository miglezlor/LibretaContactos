package miapp;

import javax.swing.JOptionPane;
/**
 *  Clase que permite agrupar contactos creados.
 * @author Miguel Gonzalez
 * @version 394.340
 */
public class Grupo {

    private String nombreGrupo;

    private Contacto arrayContactos[] = new Contacto[10];

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    
}
