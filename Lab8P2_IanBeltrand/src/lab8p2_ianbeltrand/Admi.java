package lab8p2_ianbeltrand;

import java.util.ArrayList;

public class Admi {
    
    //Atributos
    ArrayList<Zona> ListaZonas = new ArrayList();
    ArrayList<Mascota> ListaMascotas = new ArrayList();
    ArrayList<Item> ListaItems = new ArrayList();
    
    //Constructor y Mutadores
    public Admi(){
        
    }

    public ArrayList<Zona> getListaZonas() {
        return ListaZonas;
    }

    public void setListaZonas(ArrayList<Zona> ListaZonas) {
        this.ListaZonas = ListaZonas;
    }
    
    public ArrayList<Mascota> getListaMascotas() {
        return ListaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> ListaMascotas) {
        this.ListaMascotas = ListaMascotas;
    }

    public ArrayList<Item> getListaItems() {
        return ListaItems;
    }

    public void setListaItems(ArrayList<Item> ListaItems) {
        this.ListaItems = ListaItems;
    }
    
    //Funciones

    public Item BuscarItem(int id){
        for (Item item : ListaItems) {
            if(id == item.getID()){
                return item;
            }
        }
        
        return null;
    }
    
    public int GenerarIdItem(){
        for (int i = 0; i < 1000; i++) {
            if(BuscarItem(i) == null){
                return i;
            }
        }
        
        return 1000;
    }
    
    public Zona BuscarZona(int id){
        for (Zona zona : ListaZonas) {
            if(id == zona.getId()){
                return zona;
            }
        }
        
        return null;
    }
    
    public int GenerarIdZona(){
        for (int i = 0; i < 1000; i++) {
            if(BuscarZona(i) == null){
                return i;
            }
        }
        
        return 1000;
    }
    
    public Mascota BuscarMascota(String name){
        for (Mascota pet : ListaMascotas) {
            if(name.equals(pet.getNombre())){
                return pet;
            }
        }
        
        return null;
    }
}
