package lab8p2_ianbeltrand;

public class Item {
    
    //Atributos
    int ID = 0;
    String Nombre = "";
    boolean Alimento = false;
    int ProbaObtencion = 0;
    int valor = 0;
    
    //Constructores y Mutadores

    public Item(int ID, String Nombre, boolean Alimento, int ProbaObtencion, int Valor){
        this.Nombre = Nombre;
        this.ID = ID;
        this.Alimento = Alimento;
        this.ProbaObtencion = ProbaObtencion;
        this.valor = Valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isAlimento() {
        return Alimento;
    }

    public void setAlimento(boolean Alimento) {
        this.Alimento = Alimento;
    }

    public int getProbaObtencion() {
        return ProbaObtencion;
    }

    public void setProbaObtencion(int ProbaObtencion) {
        this.ProbaObtencion = ProbaObtencion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " - Nombre: " + Nombre;
    }
            
}
