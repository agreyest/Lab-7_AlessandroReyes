package lab.pkg7_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BandaAdmi {
    private ArrayList<Banda> listaBanda = new ArrayList();
    private File archivo = null;
    
    public BandaAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<Banda> getListaArtista() {
        return listaBanda;
    }

    public void setListaArtista(ArrayList<Banda> listaParadas) {
        this.listaBanda = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(Banda a){
        listaBanda.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaBanda = new ArrayList();
            Banda temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Banda) objeto.readObject()) != null) {
                        listaBanda.add(temp);
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
            for (Banda t : listaBanda) {
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
