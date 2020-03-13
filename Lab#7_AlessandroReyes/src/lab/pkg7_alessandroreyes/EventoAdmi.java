package lab.pkg7_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EventoAdmi {
    private ArrayList<Evento> listaEvento = new ArrayList();
    private File archivo = null;
    
    public EventoAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEvento;
    }

    public void setListaEventos(ArrayList<Evento> listaParadas) {
        this.listaEvento = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setEvento(Evento a){
        listaEvento.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaEvento = new ArrayList();
            Evento temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Evento) objeto.readObject()) != null) {
                        listaEvento.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Evento t : listaEvento) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
