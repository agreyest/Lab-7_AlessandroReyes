package lab.pkg7_alessandroreyes;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HiloLista extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private ArrayList lista;
    private JList list;
    private int seg;
    private JDialog jd;

    public HiloLista(JProgressBar barra, JDialog jd, int seg, JList list) {
        this.barra = barra;
        this.barra.setValue(0);
        this.barra.setMaximum(seg);
        this.list = list;
        this.seg = seg;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    
    
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue()+1);
                
                if (barra.getValue() == seg) {
                    vive = false;
                    barra.setValue(0);
                    JOptionPane.showMessageDialog(jd, "Se completo con éxito.");
                    DefaultListModel modelo = (DefaultListModel) list.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addElement(lista.get(i).toString());
                    }
                    list.setModel(modelo);
                }
            }//fin if
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
        
    }
}
