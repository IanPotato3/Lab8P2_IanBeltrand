package lab8p2_ianbeltrand;

import java.awt.Color;
import javax.swing.JProgressBar;

public class HiloBarraVida implements Runnable{
    
    //Atributos
    private JProgressBar VidaPet;
    private Color color;
    private Mascota pet;
    
    public HiloBarraVida(JProgressBar VidaPet, Mascota Pet){
        this.VidaPet = VidaPet;
        this.pet = Pet;
    }

    public JProgressBar getVidaPet() {
        return VidaPet;
    }

    public void setVidaPet(JProgressBar VidaPet) {
        this.VidaPet = VidaPet;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Mascota getPet() {
        return pet;
    }

    public void setPet(Mascota pet) {
        this.pet = pet;
    }
    
    @Override
    public void run(){
        VidaPet.setMaximum(pet.getVidaActual());
        VidaPet.setValue(pet.getVidaActual());
        VidaPet.setBackground(pet.getColor());
        VidaPet.setForeground(pet.getColor());

        while(pet.getVida() != 0){
            VidaPet.setValue(VidaPet.getValue() - 100);
            
            if(VidaPet.getValue() == 0){
                pet.setVidaActual(0);
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                
            }
        }
    }
}
