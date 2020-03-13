package lab.pkg7_alessandroreyes;

import java.util.ArrayList;

public class Usuario {
    private String usuario, contraseña, nombre; 
    int edad;
    ArrayList<Evento> eventos = new ArrayList();
    ArrayList<Artista> sigue = new ArrayList();

    public Usuario(String usuario, String contraseña, String nombre, int edad) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Artista> getSigue() {
        return sigue;
    }

    public void setSigue(ArrayList<Artista> sigue) {
        this.sigue = sigue;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + ", nombre: " + nombre + ", edad: " + edad;
    }
    
    
}
