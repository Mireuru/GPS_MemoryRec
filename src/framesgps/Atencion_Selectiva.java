/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesgps;


import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author ERIK
 */
public class Atencion_Selectiva extends javax.swing.JFrame {
    Random rand = new Random();
    int a,b,c;
    /**
     * Creates new form Atencion_Selectiva
     */
    Menu men;
    Interact inter = new Interact();
    Player pl = new Player();
    int errores = 0;
    
    public Atencion_Selectiva() {
        initComponents();
        Imagen im = new Imagen();
        this.setLocationRelativeTo(null);
        this.setTitle("Atencion Selectiva");
        im.setIconGeneral(this);
        a = rand.nextInt((3 - 1) + 1) + 1;
        b = rand.nextInt((3 - 1) + 1) + 1;
        c = rand.nextInt((3 - 1) + 1) + 1;       
        //ImagenP.setText(a+"");
        String d20 = "./src/framesgps/img/12.jpg";
        String d12 = "./src/framesgps/img/12ver.jpg";
        String d8 = "./src/framesgps/img/hex.jpg";
        String green1 = "./src/framesgps/img/green1.png";
        String green2 = "./src/framesgps/img/green2.png";
        String red = "./src/framesgps/img/red.png";
        String pieza1 = "./src/framesgps/img/pieza1.png";
        String pieza2 = "./src/framesgps/img/pieza2.png";
        String pieza3 = "./src/framesgps/img/pieza3.jpg";
        
        
        
        
        switch (a) 
        {
            case 1:  a = 1;
                 switch (b) {
                    case 1:  b = 1;
                        im.setImageLabel(192, 165, "12.png", ImagenP);
                            switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "12.png", jButton1);
                                    im.setImageBoton(192, 165, "12ver.png", jButton2);
                                    im.setImageBoton(192, 165, "hex.png", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "12.png", jButton2);
                                    im.setImageBoton(192, 165, "12ver.png", jButton1);
                                    im.setImageBoton(192, 165, "hex.png", jButton3);
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "12.png", jButton3);
                                    im.setImageBoton(192, 165, "12ver.png", jButton2);
                                    im.setImageBoton(192, 165, "hex.png", jButton1);
                                break;
                     }
                         break;
                    case 2:  b = 2;
                        im.setImageLabel(192, 165, "12ver.png", ImagenP);
                            switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "12ver.png", jButton1);    
                                    im.setImageBoton(192, 165, "12.png", jButton2);
                                    im.setImageBoton(192, 165, "hex.png", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "12ver.png", jButton2);    
                                    im.setImageBoton(192, 165, "12.png", jButton1);
                                    im.setImageBoton(192, 165, "hex.png", jButton3);    
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "12ver.png", jButton3);    
                                    im.setImageBoton(192, 165, "12.png", jButton2);
                                    im.setImageBoton(192, 165, "hex.png", jButton1);    
                                break;
                     }
                        break;
                    case 3:  b = 3;
                        im.setImageLabel(192, 165, "hex.png", ImagenP);
                            switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "hex.png", jButton1);     
                                    im.setImageBoton(192, 165, "12ver.png", jButton2);
                                    im.setImageBoton(192, 165, "12.png", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "hex.png", jButton2);     
                                    im.setImageBoton(192, 165, "12ver.png", jButton1);
                                    im.setImageBoton(192, 165, "12.png", jButton3);
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "hex.png", jButton3);     
                                    im.setImageBoton(192, 165, "12ver.png", jButton2);
                                    im.setImageBoton(192, 165, "12.png", jButton1);
                                break;
                     }
                        break;
                     }
                     break;
            case 2:  a = 2;
                switch (b) {
                    case 1:  b = 1;
                        im.setImageLabel(192, 165, "green1.png", ImagenP);
                             switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "green1.png", jButton1);     
                                    im.setImageBoton(192, 165, "green2.png", jButton2);
                                    im.setImageBoton(192, 165, "red.png", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "green1.png", jButton2);     
                                    im.setImageBoton(192, 165, "green2.png", jButton1);
                                    im.setImageBoton(192, 165, "red.png", jButton3);
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "green1.png", jButton3);     
                                    im.setImageBoton(192, 165, "green2.png", jButton2);
                                    im.setImageBoton(192, 165, "red.png", jButton1);
                                break;
                     }
                         break;
                    case 2:  b = 2;
                        im.setImageLabel(192, 165, "green2.png", ImagenP);
                             switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "green2.png", jButton1);    
                                    im.setImageBoton(192, 165, "green1.png", jButton2);     
                                    im.setImageBoton(192, 165, "red.png", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "green2.png", jButton2);    
                                    im.setImageBoton(192, 165, "green1.png", jButton1);     
                                    im.setImageBoton(192, 165, "red.png", jButton3);
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "green2.png", jButton3);    
                                    im.setImageBoton(192, 165, "green1.png", jButton2);     
                                    im.setImageBoton(192, 165, "red.png", jButton1);    
                                break;
                     }
                        break;
                    case 3:  b = 3;
                        im.setImageLabel(192, 165, "red.png", ImagenP);
                             switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "red.png", jButton1);          
                                    im.setImageBoton(192, 165, "green2.png", jButton2);    
                                    im.setImageBoton(192, 165, "green1.png", jButton3);     
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "red.png", jButton2);          
                                    im.setImageBoton(192, 165, "green2.png", jButton1);    
                                    im.setImageBoton(192, 165, "green1.png", jButton3);     
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "red.png", jButton3);          
                                    im.setImageBoton(192, 165, "green2.png", jButton2);    
                                    im.setImageBoton(192, 165, "green1.png", jButton1);    
                                break;
                     }
                        break;
                     }
                     break;
            case 3:  a = 3;
                switch (b) {
                    case 1:  b = 1;
                        im.setImageLabel(192, 165, "pieza1.png", ImagenP);
                             switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "pieza1.png", jButton1);
                                    im.setImageBoton(192, 165, "pieza2.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "pieza1.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza2.png", jButton1);
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton3);    
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "pieza1.png", jButton3);
                                    im.setImageBoton(192, 165, "pieza2.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton1);        
                                break;
                     }
                         break;
                    case 2:  b = 2;
                        im.setImageLabel(192, 165, "pieza2.png", ImagenP);
                            switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "pieza2.png", jButton1);
                                    im.setImageBoton(192, 165, "pieza1.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "pieza2.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza1.png", jButton1);
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton3);    
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "pieza2.png", jButton3);
                                    im.setImageBoton(192, 165, "pieza1.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton1);        
                                break;
                            }
                        break;
                    case 3:  b = 3;
                        im.setImageLabel(192, 165, "pieza3.jpg", ImagenP);
                             switch (c) {
                                case 1:  c = 1;
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton1);        
                                    im.setImageBoton(192, 165, "pieza2.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza1.png", jButton3);
                                 break;
                                case 2:  c = 2;
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton2);        
                                    im.setImageBoton(192, 165, "pieza2.png", jButton1);
                                    im.setImageBoton(192, 165, "pieza1.png", jButton3);    
                                break;
                                case 3:  c = 3;
                                    im.setImageBoton(192, 165, "pieza3.jpg", jButton3);        
                                    im.setImageBoton(192, 165, "pieza2.png", jButton2);
                                    im.setImageBoton(192, 165, "pieza1.png", jButton1);    
                                break;
                     }
                        break;
                     }
                     break;
        }
       
        im.setImageBoton(197,76,"BotonMenu.png", botonMenu);
        Color color = new Color(102, 189, 230);
        getContentPane().setBackground(color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        ImagenP = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));

        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagenP, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImagenP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Seleccione la imagen igual a la de la izquierda");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel2.setText("Errores: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pl.click();
        if (1==c) {
            pl.victoria();
            jLabel1.setText("Correcto");
            jLabel1.setForeground(Color.green);
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(false);
            this.jButton3.setEnabled(false);
        }
        else {
            pl.error();
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Incorrecto");
            errores++;
            this.jLabel2.setText("Errores: "+errores);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pl.click();
        if (2==c) {
            pl.victoria();
            jLabel1.setText("Correcto");
            jLabel1.setForeground(Color.green);
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(false);
            this.jButton3.setEnabled(false);
        }
        else {
            pl.error();
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Incorrecto");
            errores++;
            this.jLabel2.setText("Errores: "+errores);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pl.click();
        if (3==c) {
            pl.victoria();
            jLabel1.setText("Correcto");
            jLabel1.setForeground(Color.green);
            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(false);
            this.jButton3.setEnabled(false);
        }
        else {
            pl.error();
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Incorrecto");
            errores++;
            this.jLabel2.setText("Errores: "+errores);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        pl.click();
        inter.setRanking("At_Selectiva", errores);
        men = new Menu();
        inter.back(men,this);
    }//GEN-LAST:event_botonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Atencion_Selectiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atencion_Selectiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atencion_Selectiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atencion_Selectiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atencion_Selectiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenP;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
