/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoisii;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author dudu
 */
public class PantallaListaPacientes extends javax.swing.JFrame {
    VistaManager vistaManager = new VistaManager();
    private Controlador controlador;
    /**
     * Creates new form PantallaListaPacientes
     */
    public PantallaListaPacientes(Controlador controlador) 
    {
        this.controlador = controlador;
        initComponents();
        cargarPacientesEnTabla();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        VerHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Habitacion", "Sintomas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        VerHistorial.setText("Ver Historial");
        VerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(VerHistorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(VerHistorial))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cargarPacientesEnTabla()
    {
        List<Modelo.Paciente> pacientes = controlador.obtenerPacientesConEnfermedadesConDosis();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
         for (Modelo.Paciente paciente : pacientes) {
            model.addRow(new Object[]{
                paciente.getNombre(),            // Nombre del paciente
                paciente.getApellidos(),           // Puedes adaptar esta línea según los datos que tengas de los apellidos
                paciente.getHab(),               // Número de habitación del paciente
                paciente.getSintom()             // Síntomas del paciente
            });
        }
    }
     
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        SalirActionPerformed(evt);
    }//GEN-LAST:event_salirActionPerformed

    private void VerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerHistorialActionPerformed
      int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener el valor del nombre del paciente (puedes adaptar esto según necesites)
            String nombrePaciente = (String) jTable1.getValueAt(selectedRow, 0);

            // Aquí puedes usar VistaManager para mostrar la pantalla del historial del paciente
            vistaManager.mostrarPantallaHistorialPaciente(nombrePaciente);
        }
    }//GEN-LAST:event_VerHistorialActionPerformed
                                       

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {                                      
        vistaManager.mostrarPantallaMedicos();
        this.dispose();
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VerHistorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
