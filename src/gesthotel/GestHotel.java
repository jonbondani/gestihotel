/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesthotel;

import gesthotel.ventanas.FichaModificarReservas;
import gesthotel.ventanas.FichaReservas;
import gesthotel.ventanas.Reservas;
import gesthotel.ventanas.clientes.ListadoClientes;



/**
 *
 * @author daniellopezmesa
 */
public class GestHotel extends javax.swing.JFrame {

    /**
     * Creates new form GestHotel
     */
    public GestHotel() {
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

        jMenuItem6 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuReservas = new javax.swing.JMenu();
        jMenuItemResListado = new javax.swing.JMenuItem();
        jMenuItemResNueva = new javax.swing.JMenuItem();
        jMenuItemResModificar = new javax.swing.JMenuItem();
        jMenuEmpleados = new javax.swing.JMenu();
        jMenuItemEmpListado = new javax.swing.JMenuItem();
        jMenuItemEmpNuevo = new javax.swing.JMenuItem();
        jMenuItemEmpModificar = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenu();
        jMenuItemProvListado = new javax.swing.JMenuItem();
        jMenuItemProvNuevo = new javax.swing.JMenuItem();
        jMenuItemProvModificar = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemCliListado = new javax.swing.JMenuItem();
        jMenuItemCliNuevo = new javax.swing.JMenuItem();
        jMenuItemCliModificar = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Hoteles");
        setLocation(new java.awt.Point(600, 200));

        escritorio.setAutoscrolls(true);
        escritorio.setName("Gestión de Hotel"); // NOI18N
        escritorio.setPreferredSize(new java.awt.Dimension(800, 800));
        escritorio.setSize(new java.awt.Dimension(800, 800));

        jMenuReservas.setText("Reservas");

        jMenuItemResListado.setText("Listado");
        jMenuItemResListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirListado(evt);
            }
        });
        jMenuReservas.add(jMenuItemResListado);

        jMenuItemResNueva.setText("Nueva Reserva");
        jMenuItemResNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFichaReservas(evt);
            }
        });
        jMenuReservas.add(jMenuItemResNueva);

        jMenuItemResModificar.setText("Modificar Reserva");
        jMenuItemResModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarReserva(evt);
            }
        });
        jMenuReservas.add(jMenuItemResModificar);

        jMenuBar1.add(jMenuReservas);

        jMenuEmpleados.setText("Empleados");

        jMenuItemEmpListado.setText("Listado");
        jMenuEmpleados.add(jMenuItemEmpListado);

        jMenuItemEmpNuevo.setText("Nuevo");
        jMenuEmpleados.add(jMenuItemEmpNuevo);

        jMenuItemEmpModificar.setText("Modificar");
        jMenuEmpleados.add(jMenuItemEmpModificar);

        jMenuBar1.add(jMenuEmpleados);

        jMenuProveedores.setText("Proveedores");

        jMenuItemProvListado.setText("Listado");
        jMenuProveedores.add(jMenuItemProvListado);

        jMenuItemProvNuevo.setText("Nuevo");
        jMenuProveedores.add(jMenuItemProvNuevo);

        jMenuItemProvModificar.setText("Modificar");
        jMenuProveedores.add(jMenuItemProvModificar);

        jMenuBar1.add(jMenuProveedores);

        jMenuClientes.setText("Clientes");

        jMenuItemCliListado.setText("Listado");
        jMenuItemCliListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCliListadoActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemCliListado);

        jMenuItemCliNuevo.setText("Nuevo");
        jMenuClientes.add(jMenuItemCliNuevo);

        jMenuItemCliModificar.setText("Modificar");
        jMenuClientes.add(jMenuItemCliModificar);

        jMenuBar1.add(jMenuClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirListado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirListado
        Reservas reservas = new Reservas();
        escritorio.add(reservas);
        reservas.show();
        
    }//GEN-LAST:event_abrirListado

    private void abrirFichaReservas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirFichaReservas
        FichaReservas fichaReservas = new FichaReservas();
        escritorio.add(fichaReservas);
        fichaReservas.show();
    }//GEN-LAST:event_abrirFichaReservas

    private void modificarReserva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarReserva
       FichaModificarReservas fichaModificarReservas = new FichaModificarReservas();
       escritorio.add(fichaModificarReservas);
       fichaModificarReservas.show();
    }//GEN-LAST:event_modificarReserva

    private void jMenuItemCliListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCliListadoActionPerformed
       ListadoClientes listadoClientes = new ListadoClientes();
       escritorio.add(listadoClientes);
       listadoClientes.show();
    }//GEN-LAST:event_jMenuItemCliListadoActionPerformed

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
            java.util.logging.Logger.getLogger(GestHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuEmpleados;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemCliListado;
    private javax.swing.JMenuItem jMenuItemCliModificar;
    private javax.swing.JMenuItem jMenuItemCliNuevo;
    private javax.swing.JMenuItem jMenuItemEmpListado;
    private javax.swing.JMenuItem jMenuItemEmpModificar;
    private javax.swing.JMenuItem jMenuItemEmpNuevo;
    private javax.swing.JMenuItem jMenuItemProvListado;
    private javax.swing.JMenuItem jMenuItemProvModificar;
    private javax.swing.JMenuItem jMenuItemProvNuevo;
    private javax.swing.JMenuItem jMenuItemResListado;
    private javax.swing.JMenuItem jMenuItemResModificar;
    private javax.swing.JMenuItem jMenuItemResNueva;
    private javax.swing.JMenu jMenuProveedores;
    private javax.swing.JMenu jMenuReservas;
    // End of variables declaration//GEN-END:variables
}
