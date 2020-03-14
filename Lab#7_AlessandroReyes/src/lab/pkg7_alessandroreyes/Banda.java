package lab.pkg7_alessandroreyes;

import java.io.Serializable;
import java.util.ArrayList;

public class Banda extends Artista implements Serializable{
    private int numintegrantes;

    public Banda(int numintegrantes, String usuario, String contraseña, String nombre, String genero) {
        super(usuario, contraseña, nombre, genero);
        this.numintegrantes = numintegrantes;
    }

    public int getNumintegrantes() {
        return numintegrantes;
    }

    public void setNumintegrantes(int numintegrantes) {
        this.numintegrantes = numintegrantes;
    }
    
}
