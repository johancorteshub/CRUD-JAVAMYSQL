/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.CancionController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Cancion;

/**
 *
 * @author Lucho
 */
public class ModificarCancionForm2 extends javax.swing.JPanel {
    
    private CancionController cancionController;
    private int cancionId;

    public ModificarCancionForm2() {
        initComponents();
        cancionController = new CancionController(this);
        
        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancionController.modificarCancion();
            }
        });

    }
    
    public void actualizarContenido(ArrayList<Cancion> cancion) {
        //Doy por hecho que solo tiene un registro.
        if (!cancion.isEmpty()) {
            Cancion primerCancion = cancion.get(0);
            titulo.setText(primerCancion.getTitulo());
            artista.setText(primerCancion.getArtista());
            anio.setText(Integer.toString(primerCancion.getAnio()));
            genero.setText(primerCancion.getGenero());
            duracion.setText(Double.toString(primerCancion.getDuracion()));
            cancionId = primerCancion.getId();
        }
    }
    
    public String getTitulo() {
        return titulo.getText();
    }

    public String getArtista() {
        return artista.getText();
    }

    public int getAnio() {
      
        try {
            return Integer.parseInt(anio.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public String getGenero() {
        return genero.getText();
    }

    public double getDuracion() {
       
        try {
            return Double.parseDouble(duracion.getText());
        } catch (NumberFormatException e) {
            return 0.0; // Valor predeterminado o manejar de otra manera
        }
    }

    public int getCancionId() {
        return cancionId;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                artista = new javax.swing.JTextField();
                anio = new javax.swing.JTextField();
                genero = new javax.swing.JTextField();
                duracion = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                modificar = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                titulo = new javax.swing.JTextField();

                genero.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                generoActionPerformed(evt);
                        }
                });

                jLabel1.setText("Titulo: ");

                jLabel2.setText("Artista: ");

                modificar.setText("Modificar");

                jLabel3.setText("Año: ");

                jLabel4.setText("Genero: ");

                jLabel5.setText("Duracion: ");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel6.setText("Modificar Cancion");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jLabel6))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(modificar)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel1))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(artista, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                                        .addComponent(anio, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(genero, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(duracion, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(titulo))))))
                                .addContainerGap(84, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(modificar)
                                .addContainerGap(33, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_generoActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField anio;
        private javax.swing.JTextField artista;
        private javax.swing.JTextField duracion;
        private javax.swing.JTextField genero;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JButton modificar;
        private javax.swing.JTextField titulo;
        // End of variables declaration//GEN-END:variables
}
