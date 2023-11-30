/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.CancionController;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Cancion;

/**
 *
 * @author Lucho
 */
public class ModificarCancionForm1 extends javax.swing.JPanel {

    private CancionController cancionController;
    private ModificarCancionForm2 modificarCancionForm2;
    private JDialog dialogo;  // Agrega 

    public ModificarCancionForm1() {
        initComponents();
        cancionController = new CancionController(this);
        modificarCancionForm2 = new ModificarCancionForm2();

       

        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idModificar = jTextFieldID.getText();
               cancionController.consultarCancion(Integer.parseInt(idModificar));
                
                

            }
        });

    }

    public void cargarInfo(ArrayList<Cancion> cancion) {
        System.out.println(cancion.toString());
        // método que toma como parámetro un ArrayList de objetos Cancion y luego imprime la representación de cadena de ese ArrayList.

        // Actualizar  ModificarCancionForm2
        modificarCancionForm2.actualizarContenido(cancion);

        // Inicializa el JDialog
                dialogo = new JDialog(dialogo,"Eliminar Cancion", true);
               // dialogo.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                dialogo.setContentPane(modificarCancionForm2);
                dialogo.pack();
                dialogo.setLocationRelativeTo(null);
                dialogo.setVisible(true);
       

    }

    public void limpiarCampos() {
        jTextFieldID.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel7 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jTextFieldID = new javax.swing.JTextField();
                modificar = new javax.swing.JButton();

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel7.setText("Modificar Cancion");

                jLabel1.setText("ID: ");

                jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextFieldIDActionPerformed(evt);
                        }
                });

                modificar.setText("Modificar");
                modificar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                modificarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(152, 152, 152)
                                                .addComponent(modificar)))
                                .addContainerGap(101, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(modificar)
                                .addContainerGap(38, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JTextField jTextFieldID;
        private javax.swing.JButton modificar;
        // End of variables declaration//GEN-END:variables
}
