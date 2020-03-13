package lab.pkg7_alessandroreyes;

public class Cancion {
    private String Nombre;
    private int Duración;// en segundos

    public Cancion(String Nombre, int Duración) {
        this.Nombre = Nombre;
        this.Duración = Duración;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuración() {
        return Duración;
    }

    public void setDuración(int Duración) {
        this.Duración = Duración;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Duracion: " + Duración;
    }
    
    
}
