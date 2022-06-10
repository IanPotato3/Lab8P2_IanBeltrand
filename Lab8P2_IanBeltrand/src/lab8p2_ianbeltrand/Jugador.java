package lab8p2_ianbeltrand;

import java.util.ArrayList;

public class Jugador {
    
    //Atributos
    ArrayList<Item> ListaItems = new ArrayList();
    ArrayList<Mascota> ListaMascotas = new ArrayList();
    int Dinero = 0;
    int DineroBanco = 0;
    
    //Constrcutores y Mutadores
    public Jugador(){
        
    }

    public ArrayList<Item> getListaItems() {
        return ListaItems;
    }

    public void setListaItems(ArrayList<Item> ListaItems) {
        this.ListaItems = ListaItems;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return ListaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> ListaMascotas) {
        this.ListaMascotas = ListaMascotas;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public int getDineroBanco() {
        return DineroBanco;
    }

    public void setDineroBanco(int DineroBanco) {
        this.DineroBanco = DineroBanco;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ListaItems=" + ListaItems + ", ListaMascotas=" + ListaMascotas + ", Dinero=" + Dinero + ", DineroBanco=" + DineroBanco + '}';
    }
        
}
