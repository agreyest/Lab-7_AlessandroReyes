package lab.pkg7_alessandroreyes;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private Date fecha; 
    private String Ciudad, Lugar;
    private int Capacidad;
    private ArrayList<Cancion> setlist = new ArrayList();

    public Evento(Date fecha, String Ciudad, String Lugar, int Capacidad) {
        this.fecha = fecha;
        this.Ciudad = Ciudad;
        this.Lugar = Lugar;
        this.Capacidad = Capacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public ArrayList<Cancion> getSetlist() {
        return setlist;
    }

    public void setSetlist(ArrayList<Cancion> setlist) {
        this.setlist = setlist;
    }

    @Override
    public String toString() {
        return "Ciudad: " + Ciudad + ", Lugar: " + Lugar + ", fecha: " + fecha;
    }
    
    
}
