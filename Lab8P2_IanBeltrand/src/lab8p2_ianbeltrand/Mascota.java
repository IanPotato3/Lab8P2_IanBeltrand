package lab8p2_ianbeltrand;

import java.awt.Color;

public class Mascota {
    
    //Atributos
    String Nombre = "";
    int Vida = 0;
    int delay = 0;
    int Costo = 0;
    Color color = null;

    public Mascota(String Nombre, int Vida, int delay, int Costo, Color color){
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.delay = delay;
        this.Costo = Costo;
        this.color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
