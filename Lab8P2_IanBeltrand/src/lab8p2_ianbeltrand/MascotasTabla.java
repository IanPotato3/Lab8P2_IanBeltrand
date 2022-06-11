package lab8p2_ianbeltrand;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MascotasTabla implements Runnable{
    
    //Atributos
    private JTable TablaMascotas;
    private Jugador player;
    
    public MascotasTabla(JTable TablaMascotas, Jugador player){
        this.TablaMascotas = TablaMascotas;
        this.player = player;
    }

    public JTable getTablaMascotas() {
        return TablaMascotas;
    }

    public void setTablaMascotas(JTable TablaMascotas) {
        this.TablaMascotas = TablaMascotas;
    }
    
    public void ActualizarTabla(){
        DefaultTableModel model = (DefaultTableModel)TablaMascotas.getModel();
        model.setRowCount(0);
        for (Mascota pet : player.getListaMascotas()) {
            Object[] newrow = {
                pet.getNombre(), pet.getDelay(), pet.getCosto(), pet.getColor(), pet.getVidaActual()
            };
            model.addRow(newrow);
            TablaMascotas.setModel(model);
        }
    }
        
    @Override
    public void run(){

        while(true){
            try{
                for (Mascota pet : player.getListaMascotas()) {
                    pet.setVidaActual(pet.getVidaActual() - 100);

                    if(pet.getVidaActual() == 0){
                        player.getListaMascotas().remove(pet);
                    }
                }

                ActualizarTabla();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex){

                }
            }catch(Exception e){
                
            }
            
        }
    }
}
