/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_ianbeltrand;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        
        MascotasTabla tabla = new MascotasTabla(TablaMascotas, admi.player);
        Thread process = new Thread(tabla);
        process.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        BarraVidaPet = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMascotas = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombrePetCrear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VidaPetCrear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DelayPetCrear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CostoPetCrear = new javax.swing.JTextField();
        ColorPetCrear = new javax.swing.JButton();
        CrearPetButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NombreItemCrear = new javax.swing.JTextField();
        AlimentoCheckBox = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        ProbaObtencion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PrecioItemCrear = new javax.swing.JTextField();
        CrearItemButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NombreZonaCrear = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ProbaDerrumbe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ProbaAtaque = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaItemsA = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaItemsZ = new javax.swing.JList<>();
        AddItemButton = new javax.swing.JButton();
        CrearZonaButton = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        LogArea = new javax.swing.JTextArea();
        ComandoEntrada = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        TablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Delay", "Costo", "Color", "Vida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaMascotas);
        if (TablaMascotas.getColumnModel().getColumnCount() > 0) {
            TablaMascotas.getColumnModel().getColumn(0).setResizable(false);
            TablaMascotas.getColumnModel().getColumn(1).setResizable(false);
            TablaMascotas.getColumnModel().getColumn(2).setResizable(false);
            TablaMascotas.getColumnModel().getColumn(3).setResizable(false);
            TablaMascotas.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraVidaPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarraVidaPet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        jTabbedPane1.addTab("Mascotas", jToolBar1);

        jToolBar2.setRollover(true);

        jLabel1.setText("Crear Mascota");

        jLabel2.setText("Nombre");

        jLabel3.setText("Puntos de Vida");

        jLabel4.setText("Delay");

        jLabel5.setText("Costo");

        ColorPetCrear.setText("COLOR");
        ColorPetCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColorPetCrearMouseClicked(evt);
            }
        });

        CrearPetButton.setText("CREAR PET");
        CrearPetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearPetButtonMouseClicked(evt);
            }
        });

        jLabel6.setText("Crear Item");

        jLabel7.setText("Nombre");

        AlimentoCheckBox.setText("Alimento");

        jLabel8.setText("Probabilidad de Obtencion");

        jLabel9.setText("Precio de Venta");

        CrearItemButton.setText("CREAR ITEM");
        CrearItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearItemButtonMouseClicked(evt);
            }
        });

        jLabel10.setText("Crear Zona");

        jLabel11.setText("Nombre");

        jLabel12.setText("Probabilidad Derrumbe");

        jLabel13.setText("Probabilidad Ataque");

        jLabel14.setText("Agregar Item");

        ListaItemsA.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(ListaItemsA);

        jLabel15.setText("Items");

        ListaItemsZ.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(ListaItemsZ);

        AddItemButton.setText("Agregar Item");
        AddItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemButtonMouseClicked(evt);
            }
        });

        CrearZonaButton.setText("Crear Zona");
        CrearZonaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearZonaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(NombrePetCrear)
                    .addComponent(VidaPetCrear)
                    .addComponent(DelayPetCrear)
                    .addComponent(CostoPetCrear)
                    .addComponent(ColorPetCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearPetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(NombreItemCrear)
                        .addComponent(AlimentoCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CrearItemButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(PrecioItemCrear, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ProbaObtencion, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProbaDerrumbe)
                    .addComponent(ProbaAtaque)
                    .addComponent(NombreZonaCrear)
                    .addComponent(jScrollPane2))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane3)
                    .addComponent(AddItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearZonaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombrePetCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreItemCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreZonaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VidaPetCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AlimentoCheckBox)
                                .addComponent(ProbaDerrumbe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DelayPetCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProbaObtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProbaAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CostoPetCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioItemCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ColorPetCrear)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CrearPetButton)
                                    .addComponent(CrearItemButton)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(AddItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearZonaButton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jToolBar2.add(jPanel2);

        jTabbedPane1.addTab("Administracion", jToolBar2);

        jToolBar3.setRollover(true);

        LogArea.setEditable(false);
        LogArea.setColumns(20);
        LogArea.setRows(5);
        jScrollPane4.setViewportView(LogArea);

        SubmitButton.setText(">");
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ComandoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComandoEntrada)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jToolBar3.add(jPanel3);

        jTabbedPane1.addTab("Comando", jToolBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearPetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearPetButtonMouseClicked
        // TODO add your handling code here:
        String name = NombrePetCrear.getText();
        int life = Integer.parseInt(VidaPetCrear.getText());
        int delay = Integer.parseInt(DelayPetCrear.getText());
        int Costo = Integer.parseInt(CostoPetCrear.getText());
        Color color = ColorPetCrear.getBackground();
        
        if(life%200 != 0){
            JOptionPane.showMessageDialog(this, "Esta vida no es valida, intente de nuevo");
        }else{
            if(delay%100 != 0){
                JOptionPane.showMessageDialog(this, "Este delay no es valido, intente de nuevo");
            }else{
                if(admi.BuscarMascota(name) == null){
                    Mascota pet = new Mascota(name, life, delay, Costo, color);
                    admi.getListaMascotas().add(pet);

                    JOptionPane.showMessageDialog(this, "Mascota Agregada Exitosamente");
                }else{
                    JOptionPane.showMessageDialog(this, "Ya hay una mascota con este nombre, elige otro");
                }
                
            }
        }

        admi.GuardarArchivo();
    }//GEN-LAST:event_CrearPetButtonMouseClicked

    private void ColorPetCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorPetCrearMouseClicked
        // TODO add your handling code here:
        ColorPetCrear.setBackground(JColorChooser.showDialog(this, "Seleccione el color de la mascota", Color.yellow));
    }//GEN-LAST:event_ColorPetCrearMouseClicked

    private void CrearItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearItemButtonMouseClicked
        // TODO add your handling code here:
        String name = NombreItemCrear.getText();
        boolean food = AlimentoCheckBox.isSelected();
        int probabilidadOb = Integer.parseInt(ProbaObtencion.getText());
        int precio = Integer.parseInt(PrecioItemCrear.getText());
        
        if(probabilidadOb > 100 || probabilidadOb < 0){
            JOptionPane.showMessageDialog(this, "Esta probabilidad no es validad, intente de nuevo");
        }else{
            Item item = new Item(admi.GenerarIdItem(), name, food, probabilidadOb, precio);
            admi.getListaItems().add(item);
            ActualizarListaItems();
            JOptionPane.showMessageDialog(this, "Item Creado Exitosamente");
        }
        
        admi.GuardarArchivo();
    }//GEN-LAST:event_CrearItemButtonMouseClicked

    public void ActualizarListaItems(){
        DefaultListModel model = (DefaultListModel)ListaItemsA.getModel();
        
        model.clear();
        for (Item item : admi.getListaItems()){
            model.addElement(item);
        }
        
        ListaItemsA.setModel(model);
        
        admi.GuardarArchivo();
    }
    
    private void CrearZonaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearZonaButtonMouseClicked
        // TODO add your handling code here:
        String name = NombreZonaCrear.getText();
        int probaDerrumbe = Integer.parseInt(ProbaDerrumbe.getText());
        int probaAtaque = Integer.parseInt(ProbaAtaque.getText());
        
        if(probaDerrumbe > 100 || probaDerrumbe < 0){
            JOptionPane.showMessageDialog(this, "Esta probabilidad de derrumbe no es validad, intente de nuevo");
        }else{
            if(probaAtaque > 100 || probaAtaque < 0){
                JOptionPane.showMessageDialog(this, "Esta probabilidad de ataque no es validad, intente de nuevo");
            }else{
                ArrayList<Item> listaItemsF = ListaItemsP;
                
                Zona zona = new Zona(admi.GenerarIdZona(), name, listaItemsF, probaDerrumbe, probaAtaque);
                admi.getListaZonas().add(zona);
                JOptionPane.showMessageDialog(this, "Zona Creada Exitosamente");
                ListaItemsP.clear();
            }
        }
        
        admi.GuardarArchivo();
    }//GEN-LAST:event_CrearZonaButtonMouseClicked

    public void ActualizarItemsSeleccionados(){
        DefaultListModel model = (DefaultListModel)ListaItemsZ.getModel();
        
        model.clear();
        for (Item item : ListaItemsP){
            model.addElement(item);
        }
        
        ListaItemsZ.setModel(model);
        
        admi.GuardarArchivo();
    }
    
    private void AddItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemButtonMouseClicked
        // TODO add your handling code here:
        DefaultListModel model = (DefaultListModel)ListaItemsA.getModel();
        
        Item item = (Item)model.getElementAt(ListaItemsA.getSelectedIndex());
        
        ListaItemsP.add(item);
        ActualizarItemsSeleccionados();
        
        admi.GuardarArchivo();
    }//GEN-LAST:event_AddItemButtonMouseClicked

    public Item GenerarItem(Zona zone){
        Random random = new Random();
        int Up = zone.getItemsDisponibles().size();
        System.out.println(Up);
        int Nrandom = random.nextInt(Up);
        
        return admi.getListaItems().get(Nrandom);
    }
    
    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        // TODO add your handling code here:
        String comando = ComandoEntrada.getText();
        Scanner scanned = new Scanner(comando);
        scanned.useDelimiter(" ");
        String Salida = "";
        String Text = "";
        String getComando = "";
        
        //Mascotas
        switch(scanned.next()){
            case "!pet":
                getComando = scanned.next();
                switch(getComando){
                    case "active":
                        String namePet = scanned.next();
                        
                        if(admi.BuscarMascotaPlayer(namePet) != null){
                            HiloBarraVida barraVida = new HiloBarraVida(BarraVidaPet, admi.BuscarMascotaPlayer(namePet));
                            Thread proceso = new Thread(barraVida);
                            proceso.start();
                            
                            Salida = "\n\n" + Salida + "Has activado a " + namePet;
                            Text = LogArea.getText();
                            
                            LogArea.setText(Text + Salida);
                            ComandoEntrada.setText("");
                        }else{
                            Salida = "\n\n" + Salida + "No tienes una pet que se llame de ese modo";
                            Text = LogArea.getText();
                            
                            LogArea.setText(Text + Salida);
                            ComandoEntrada.setText("");
                        }
                        break;
                    case "feed":
                        break;
                    case "list":
                        Salida = "\n\nMascotas Disponibles: ";
                        for (Mascota pet : admi.getListaMascotas()) {
                            Salida = Salida + "\n" + pet.toString();
                        }
                        
                        Text = LogArea.getText();
                        
                        LogArea.setText(Text + Salida);
                        ComandoEntrada.setText("");
                        break;
                }
                break;
            case "!adopt":
                getComando = scanned.next();
                
                if(admi.BuscarMascota(getComando) != null){
                    Mascota pet = admi.BuscarMascota(getComando);
                    if(admi.player.getDinero() >= pet.getCosto()){
                        admi.player.getListaMascotas().add(pet);
                        admi.getListaMascotas().remove(pet);
                        
                        Salida = "\n\n" + pet.getNombre() + " es ahora tu mascota, cuidala bien!";
                        
                        Text = LogArea.getText();
                        
                        LogArea.setText(Text + Salida);
                        ComandoEntrada.setText("");
                    }
                }
                break;
            case "!mine":
                getComando = scanned.next();
                
                if(admi.BuscarZona(Integer.parseInt(getComando)) != null){
                    Zona zone = admi.BuscarZona(Integer.parseInt(getComando));
                    
                    Random random = new Random();
                    int Up = 101;
                    int Nrandom = random.nextInt(Up);
                    
                    if(Nrandom <= zone.ProbaDerrumbe){
                        admi.player.setDinero(admi.player.getDinero() + 300);
                        Salida = "\n\n" + Salida + "Has ganado $300" + 
                                "\nItems Ganados: ";
                        
                        Item itemganado;
                        
                        for (int i = 0; i < 3; i++) {
                            itemganado = GenerarItem(zone);
                            admi.player.getListaItems().add(itemganado);
                            
                            Salida = Salida + "\n" + itemganado.toString();
                        }
                        
                        Text = LogArea.getText();
                        
                        LogArea.setText(Text + Salida);
                        
                    }else{
                        Salida = "\n\n" + Salida + "La mina se ha derrumbado";
                        admi.player.setDinero(0);
                        
                        Text = LogArea.getText();
                        
                        LogArea.setText(Text + Salida);
                    }
                }
                break;
            case "!fish":
                break;
            case "!zone":
                break;
            case "!sell":
                break;
            case "!item":
                break;
            case "!buy":
                break;
            case "!bag":
                Salida = "\n\nBag Items: ";
                
                for (Item listaItem : admi.player.getListaItems()){
                    Salida = Salida + "\n" + listaItem.toString();
                }
                
                String LAa = LogArea.getText();
                
                LogArea.setText(LAa + Salida);
                ComandoEntrada.setText("");
                break;
            case "!d":
                break;
            case "!w":
                break;
            case "!b":
                String dinero = "\n\nDinero: " + admi.player.getDinero() +
                        "\nDinero Banco: " + admi.player.getDineroBanco();
                String LA = LogArea.getText();
                
                LogArea.setText(LA+dinero);
                ComandoEntrada.setText("");
                break;
            case "!clear":
                LogArea.setText("");
                ComandoEntrada.setText("");
                break;
        }
        
        admi.GuardarArchivo();
    }//GEN-LAST:event_SubmitButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemButton;
    private javax.swing.JCheckBox AlimentoCheckBox;
    private javax.swing.JProgressBar BarraVidaPet;
    private javax.swing.JButton ColorPetCrear;
    private javax.swing.JTextField ComandoEntrada;
    private javax.swing.JTextField CostoPetCrear;
    private javax.swing.JButton CrearItemButton;
    private javax.swing.JButton CrearPetButton;
    private javax.swing.JButton CrearZonaButton;
    private javax.swing.JTextField DelayPetCrear;
    private javax.swing.JList<String> ListaItemsA;
    private javax.swing.JList<String> ListaItemsZ;
    private javax.swing.JTextArea LogArea;
    private javax.swing.JTextField NombreItemCrear;
    private javax.swing.JTextField NombrePetCrear;
    private javax.swing.JTextField NombreZonaCrear;
    private javax.swing.JTextField PrecioItemCrear;
    private javax.swing.JTextField ProbaAtaque;
    private javax.swing.JTextField ProbaDerrumbe;
    private javax.swing.JTextField ProbaObtencion;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTable TablaMascotas;
    private javax.swing.JTextField VidaPetCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables
    Admi admi = new Admi();
    int NumeroAutoNumerico = 1;
    ArrayList<Item> ListaItemsP  = new ArrayList();
}
