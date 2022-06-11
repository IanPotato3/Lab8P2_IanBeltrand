package lab8p2_ianbeltrand;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admi {
    
    //Atributos
    ArrayList<Zona> ListaZonas = new ArrayList();
    ArrayList<Mascota> ListaMascotas = new ArrayList();
    ArrayList<Item> ListaItems = new ArrayList();
    Jugador player = new Jugador();
    File fileGuardado = new File("./Guardados.JML");
    
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
    
    public Mascota BuscarMascotaPlayer(String name){
        for (Mascota pet : player.getListaMascotas()) {
            if(name.equals(pet.getNombre())){
                return pet;
            }
        }
        
        return null;
    }
    
    public void GuardarArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(fileGuardado);
            bw = new ObjectOutputStream(fw);
            
            bw.writeObject(ListaItems);
            bw.writeObject(ListaMascotas);
            bw.writeObject(ListaZonas);
            bw.writeObject(player);
            
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
    
    public void CargarArchivo() throws FileNotFoundException, IOException, ClassNotFoundException{
        if(fileGuardado.exists()){
            FileInputStream entrada = new FileInputStream(fileGuardado);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            
            try{
                ArrayList<Item> temp = (ArrayList<Item>)objeto.readObject();
                ListaItems = temp;
                
                ArrayList<Mascota> temp2 = (ArrayList<Mascota>)objeto.readObject();
                ListaMascotas = temp2;
                
                ArrayList<Zona> temp3 = (ArrayList<Zona>)objeto.readObject();
                ListaZonas = temp3;
                
                Jugador temp4 = (Jugador)objeto.readObject();
                player = temp4;

            } catch (EOFException e) {
                e.printStackTrace();
            }
            objeto.close();
            entrada.close();
        }
        
    }
}
