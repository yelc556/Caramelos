/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.*;
import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;
import Excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author kz
 */
public class DC extends javax.swing.JFrame {
    TiempoEspera hilo;  //crea la clase cargar
    Caramelo caramelo = new Caramelo(); // crea el objeto caramelo
    JOptionPane opcion = new JOptionPane();
    /**
     * Creates new form DC
     */
    public DC() {
        initComponents();  
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        // hilo para cambiar el estado de la barra de progreso
        hilo= new TiempoEspera(getjProgressBar1());
        hilo.start();
        hilo = null;
        jProgressBar2.setVisible(false);
        Verde.setVisible(false);
        Rojo.setVisible(false);
        Amarillo.setVisible(false);
        jLabel7.setVisible(false);
        Si.setVisible(false);
        No.setVisible(false);
        jLabel1.setVisible(false);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seleccionar = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        Exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        Contador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        Comprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        Si = new javax.swing.JButton();
        No = new javax.swing.JButton();
        Verde = new javax.swing.JLabel();
        Rojo = new javax.swing.JLabel();
        Amarillo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yelc ");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_obj.gif"))); // NOI18N
        Exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Exit.setBorderPainted(false);
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.setOpaque(false);
        Exit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_obj.gif"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 50, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jPanel1.setOpaque(false);

        Seleccionar.add(jRadioButton1);
        jRadioButton1.setSelected(false);
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        Seleccionar.add(jRadioButton2);
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        Seleccionar.add(jRadioButton3);
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {".25", ".50", "1"}));
        jSpinner1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jSpinner1.setOpaque(false);

        Contador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Contador.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Moneda");

        jLabel6.setText("Seleccione Un Caramelo");

        jProgressBar2.setToolTipText("carmael");
        jProgressBar2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar2StateChanged(evt);
            }
        });

        Comprar.setText("Comprar");
        Comprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Comprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Comprar.setOpaque(false);
        Comprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/drooling-303313_640.png"))); // NOI18N
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 210));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Desa Comprar Otro Caramelo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 240, 20));

        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 260, 20));

        Si.setText("Si");
        Si.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Si.setOpaque(false);
        Si.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/drooling-303313_640.png"))); // NOI18N
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });
        getContentPane().add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, 30));

        No.setText("No");
        No.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        No.setOpaque(false);
        No.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/drooling-303313_640.png"))); // NOI18N
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        getContentPane().add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 70, 30));

        Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/14-54-46-memoria-flash-mm-verdememoria-flash-mampm-1750.jpg"))); // NOI18N
        Verde.setText("jLabel2");
        Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        getContentPane().add(Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 70));

        Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/14-54-04-MMS.jpg"))); // NOI18N
        Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        getContentPane().add(Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 90));

        Amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Amarillo.jpg"))); // NOI18N
        Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 70));

        jLabel1.setText("Ha Comprado Un Caramelo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_1.jpg"))); // NOI18N
        Fondo.setText("Ha Comprado Un Caramelo");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 730, 420));

        Seleccionar.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Salir
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jProgressBar2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar2StateChanged

        if((jProgressBar2.getValue()==10) && caramelo.getTotal()==.25)
            Dormir();
        if((jProgressBar2.getValue()==25) && caramelo.getTotal()==.5)
            Dormir();
        if((jProgressBar2.getValue()==50) && caramelo.getTotal()==.75)
            Dormir();
        if((jProgressBar2.getValue()==65) && caramelo.getTotal()==1)
            Dormir();
        if((jProgressBar2.getValue()==85) && caramelo.getTotal()==1.25)
            Dormir();
        if (jProgressBar2.getValue()==100){
            caramelo.Comprar_Caramelo();
            jPanel1.setVisible(false);
            Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg")));
            jLabel1.setVisible(true);
            if (jRadioButton1.isSelected())
                Verde.setVisible(true);
            if (jRadioButton2.isSelected())
                Rojo.setVisible(true);
            if (jRadioButton3.isSelected())
                Amarillo.setVisible(true);
           Si.setVisible(true);
           No.setVisible(true);
           jLabel7.setVisible(true);
           Contador.setText(String.valueOf(caramelo.getTotal()));
        }        
    }//GEN-LAST:event_jProgressBar2StateChanged
    public void Dormir(){
    try{
        Thread.sleep(1111700); //Dormir sistema
    }catch(InterruptedException ex){
        Logger.getLogger(DC.class.getName()).log(Level.SEVERE,null,ex);
    }
    }
    
    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        // Barra de progreso
        if(getjProgressBar1().getValue()<100){
            AWTUtilities.setWindowOpacity(this,Float.valueOf(getjProgressBar1().getValue())/100);    
        }
               if(getjProgressBar1().getValue()==100)
                   jProgressBar1.setVisible(false);
    }//GEN-LAST:event_jProgressBar1StateChanged

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        // OTRO
        this.jPanel1.setVisible(true);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_1.jpg")));
        Verde.setVisible(false);
        Rojo.setVisible(false);
        Amarillo.setVisible(false);
        jLabel1.setVisible(false);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);
        jProgressBar2.setVisible(false);
        Si.setVisible(false);
        No.setVisible(false);
        jLabel7.setVisible(false);
    }//GEN-LAST:event_SiActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        // vuelto
        caramelo.Vuelto();
    }//GEN-LAST:event_NoActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        // Comprar
        if ((jRadioButton1.isSelected()) ||(jRadioButton2.isSelected()) ||(jRadioButton3.isSelected())){
            jProgressBar2.setVisible(true);
            caramelo.setTotal(Float.valueOf(jSpinner1.getValue().toString()));
            Contador.setText(String.valueOf(caramelo.getTotal())); 
            hilo= new TiempoEspera(getjProgressBar2());
            hilo.start();
            hilo = null;   
        }
        else
        {
            opcion.showMessageDialog(null,"Seleccione Un Caramelo");
        }
                 
    }//GEN-LAST:event_ComprarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
         // Verde
         Verde.setVisible(true);
         Rojo.setVisible(false);
         Amarillo.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // Rojo
        Verde.setVisible(false);
        Rojo.setVisible(true);
        Amarillo.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // Amarillo
        Verde.setVisible(false);
        Rojo.setVisible(false);
        Amarillo.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * @param args the command line arguments
     */         public void run() {}
    public  static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amarillo;
    private javax.swing.JButton Comprar;
    private javax.swing.JLabel Contador;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton No;
    private javax.swing.JLabel Rojo;
    private javax.swing.ButtonGroup Seleccionar;
    private javax.swing.JButton Si;
    private javax.swing.JLabel Verde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jProgressBar1
     */
    public javax.swing.JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    /**
     * @param jProgressBar1 the jProgressBar1 to set
     */
    public void setjProgressBar1(javax.swing.JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }

    /**
     * @return the jProgressBar2
     */
    public javax.swing.JProgressBar getjProgressBar2() {
        return jProgressBar2;
    }

    /**
     * @param jProgressBar2 the jProgressBar2 to set
     */
    public void setjProgressBar2(javax.swing.JProgressBar jProgressBar2) {
        this.jProgressBar2 = jProgressBar2;
    }
}
