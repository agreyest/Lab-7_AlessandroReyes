package lab.pkg7_alessandroreyes;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilocrear extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int seg;
    private JDialog jd;

    public Hilocrear(JProgressBar barra, JDialog jd, int seg) {
        this.barra = barra;
        this.barra.setValue(0);
        this.barra.setMaximum(5);
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
