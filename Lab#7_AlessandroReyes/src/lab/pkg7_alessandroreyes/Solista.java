package lab.pkg7_alessandroreyes;

import java.io.Serializable;
import java.util.ArrayList;

public class Solista extends Artista implements Serializable{
    private int Edad;

    public Solista(int Edad, String usuario, String contraseña, String nombre, String genero) {
        super(usuario, contraseña, nombre, genero);
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
