package lab8p2_ianbeltrand;

import java.util.ArrayList;

public class Zona {
    
    //Atributos
    int id = 0;
    String Nombre = "";
    ArrayList<Item> ItemsDisponibles = new ArrayList();
    int remuneracion = 0;
    int ProbaDerrumbe = 0;
    int ProbaAtaque = 0;
    
    //Constrcutores y Mutadores
    public Zona(int id, String Nombre, ArrayList Items, int ProbaDerrumbe, int ProbaAtaque){
        this.id = id;
        this.Nombre = Nombre;
        this.ItemsDisponibles = Items;
        this.ProbaDerrumbe = ProbaDerrumbe;
        this.ProbaAtaque = ProbaAtaque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Item> getItemsDisponibles() {
        return ItemsDisponibles;
    }

    public void setItemsDisponibles(ArrayList<Item> ItemsDisponibles) {
        this.ItemsDisponibles = ItemsDisponibles;
    }

    public int getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(int remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getProbaDerrumbe() {
        return ProbaDerrumbe;
    }

    public void setProbaDerrumbe(int ProbaDerrumbe) {
        this.ProbaDerrumbe = ProbaDerrumbe;
    }

    public int getProbaAtaque() {
        return ProbaAtaque;
    }

    public void setProbaAtaque(int ProbaAtaque) {
        this.ProbaAtaque = ProbaAtaque;
    }

    @Override
    public String toString() {
        return "Zona{" + "id=" + id + ", Nombre=" + Nombre + ", ItemsDisponibles=" + ItemsDisponibles + ", remuneracion=" + remuneracion + ", ProbaDerrumbe=" + ProbaDerrumbe + ", ProbaAtaque=" + ProbaAtaque + '}';
    }
        
}
