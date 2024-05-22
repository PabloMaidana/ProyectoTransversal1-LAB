/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class menuView extends javax.swing.JFrame {

    private ArrayList<Alumno> listaAlumnos;
    /**
     * Creates new form mainView
     */
    public menuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiFAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiFMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiManejoNotas = new javax.swing.JMenuItem();
        jmiManipulacionNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAlumPorMateria = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumnos");

        jmiFAlumno.setText("Formulario de Alumno");
        jmiFAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiFAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        jmiFMateria.setText("Formulario de Materia");
        jmiFMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jmiManejoNotas.setText("Manejo de Inscripciones");
        jMenu3.add(jmiManejoNotas);

        jmiManipulacionNotas.setText("Manipulacion de notas");
        jMenu3.add(jmiManipulacionNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmiAlumPorMateria.setText("Alumnos por Materia");
        jMenu4.add(jmiAlumPorMateria);

        jMenuBar1.add(jMenu4);

        jmiSalir.setText("Salir");
        jMenuBar1.add(jmiSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumno fAlum = new FormularioAlumno();
        fAlum.setVisible(true);
        escritorio.add(fAlum);
    }//GEN-LAST:event_jmiFAlumnoActionPerformed

    private void jmiFMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria fMat = new FormularioMateria();
        fMat.setVisible(true);
        escritorio.add(fMat);
    }//GEN-LAST:event_jmiFMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAlumPorMateria;
    private javax.swing.JMenuItem jmiFAlumno;
    private javax.swing.JMenuItem jmiFMateria;
    private javax.swing.JMenuItem jmiManejoNotas;
    private javax.swing.JMenuItem jmiManipulacionNotas;
    private javax.swing.JMenu jmiSalir;
    // End of variables declaration//GEN-END:variables
}