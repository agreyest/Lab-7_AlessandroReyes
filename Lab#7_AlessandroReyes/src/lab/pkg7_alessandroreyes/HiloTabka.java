package lab.pkg7_alessandroreyes;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;

public class HiloTabka extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private ArrayList lista;
    private JTable table;
    private int seg;
    private JDialog jd;

    public HiloTabka(JProgressBar barra, JDialog jd, int seg, JTable list) {
        this.barra = barra;
        this.barra.setValue(0);
        this.barra.setMaximum(seg);
        this.table = list;
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
                    
                }
            }//fin if
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
        
    }
}
