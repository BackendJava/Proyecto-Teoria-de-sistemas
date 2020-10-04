package Clases;

import Conexiones.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Interfaz extends JFrame {

    private Timer timer;
    Connection con = null;
    Conexion conect = new Conexion();

    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("CONTROL FINANCIERO");
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.JLB_Fecha1.setText(fecha);
    }

    public class cronometro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            txtHora1.setText(String.valueOf(hora));
            txtMinutos1.setText(String.valueOf(minutos));
            txtSegundos1.setText(String.valueOf(segundos));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtHora1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMinutos1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSegundos1 = new javax.swing.JLabel();
        JLB_Fecha1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtHora1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtHora1.setForeground(new java.awt.Color(255, 255, 255));
        txtHora1.setText("00");

        jLabel6.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        txtMinutos1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtMinutos1.setForeground(new java.awt.Color(255, 255, 255));
        txtMinutos1.setText("00");

        jLabel7.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        txtSegundos1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        txtSegundos1.setForeground(new java.awt.Color(255, 255, 255));
        txtSegundos1.setText("00");

        JLB_Fecha1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        JLB_Fecha1.setForeground(new java.awt.Color(255, 255, 255));
        JLB_Fecha1.setText("00/00/00");
        JLB_Fecha1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JLB_Fecha1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jDesktopPane1.setLayer(txtHora1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtMinutos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtSegundos1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JLB_Fecha1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(702, Short.MAX_VALUE)
                .addComponent(JLB_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtHora1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMinutos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSegundos1)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora1)
                    .addComponent(jLabel6)
                    .addComponent(txtMinutos1)
                    .addComponent(jLabel7)
                    .addComponent(txtSegundos1)
                    .addComponent(JLB_Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Inventario.png"))); // NOI18N
        jMenu2.setText("INVENTARIO");
        jMenu2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenuItem1.setText("Ingresar,Modificar,Borrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Proveedores.png"))); // NOI18N
        jMenu4.setText("PROVEEDORES");
        jMenu4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenuItem5.setText("INGRESAR");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem3.setText("BUSCAR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ventas.png"))); // NOI18N
        jMenu1.setText("VENTAS");
        jMenu1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenuItem4.setText("Ventas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Cotizar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CLIENTES.png"))); // NOI18N
        jMenu3.setText("CLIENTES");
        jMenu3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenuItem7.setText("Ingresar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Buscar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RRHH.png"))); // NOI18N
        jMenu5.setText("RERCURSOS HUMANOS");
        jMenu5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Nuevo Empleado");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Buscar Empleado");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Despedir");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Agenda Telefonica");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FINANZAS.png"))); // NOI18N
        jMenu6.setText("FINANZAS");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        jMenuItem14.setText("Generar Estado de Resultados");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Registrar obj = new Registrar();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Buscar obj = new Buscar();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        clientes obj = new clientes();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      BuscarProveedor obj = new BuscarProveedor();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        clientes1 obj = new clientes1();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       BuscarCliente obj = new BuscarCliente();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Buscar1 obj = new Buscar1();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Venta obj = new Venta();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        NuevoEmpleado obj = new NuevoEmpleado();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         Buscar2 obj = new Buscar2();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
      NuevoEmpleado obj = new NuevoEmpleado();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        DESPEDIR obj = new DESPEDIR();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Agenda obj = new Agenda();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       GenerarEstado obj = new GenerarEstado();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
        obj.setMaximum(true); //OPCIONAL
        } catch (PropertyVetoException ex) {
        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void JLB_Fecha1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JLB_Fecha1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JLB_Fecha1AncestorAdded

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                //new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLB_Fecha1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel txtHora1;
    private javax.swing.JLabel txtMinutos1;
    private javax.swing.JLabel txtSegundos1;
    // End of variables declaration//GEN-END:variables
}
