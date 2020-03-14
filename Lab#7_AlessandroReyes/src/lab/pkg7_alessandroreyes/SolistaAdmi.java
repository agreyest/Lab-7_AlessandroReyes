package lab.pkg7_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SolistaAdmi {
    private ArrayList<Solista> listaSolista = new ArrayList();
    private File archivo = null;
    
    public SolistaAdmi(String path) {
        archivo = new File(path);
    }

    public ArrayList<Solista> getListaArtista() {
        return listaSolista;
    }

    public void setListaArtista(ArrayList<Solista> listaParadas) {
        this.listaSolista = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(Solista a){
        listaSolista.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaSolista = new ArrayList();
            Solista temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Solista) objeto.readObject()) != null) {
                        listaSolista.add(temp);
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
            for (Artista t : listaSolista) {
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
