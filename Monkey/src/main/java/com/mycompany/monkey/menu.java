package com.mycompany.monkey;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {
           public static int tiempoInv;
           public static int costoInv;
           public static int tiempoProd;
           public static int costoProd;
           public static int tiempoEmpaq;
           public static int costoEmpaq;
           public static int tiempoSal;
           public static int costoSal;
           
    public menu() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú inicial");

        jLabel4.setBackground(new java.awt.Color(145, 67, 124));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Empaquetado");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setBackground(new java.awt.Color(150, 29, 73));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salida");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setBackground(new java.awt.Color(67, 88, 145));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inventario");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setBackground(new java.awt.Color(67, 145, 87));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Producción");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiempo (s)");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Costo (Q/s)");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("1");

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText("1");

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setText("1");

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jTextField4.setText("1");

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jTextField5.setText("1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));
        jTextField6.setText("1");
        jTextField6.setToolTipText("");

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 51, 51));
        jTextField7.setText("1");

        jTextField8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jTextField8.setText("1");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Iniciar Simulación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField5)
                            .addComponent(jTextField7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField6)
                            .addComponent(jTextField8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty())){
            boolean field1 = false;
            boolean field2 = false;
            boolean field3 = false;
            boolean field4 = false;
            boolean field5 = false;
            boolean field6 = false;
            boolean field7 = false;
            boolean field8 = false;
            String JTF1 = jTextField1.getText();
            String JTF2 = jTextField2.getText();
            String JTF3 = jTextField3.getText();
            String JTF4 = jTextField4.getText();
            String JTF5 = jTextField5.getText();
            String JTF6 = jTextField6.getText();
            String JTF7 = jTextField7.getText();
            String JTF8 = jTextField8.getText();
            for (int i = 0; i < JTF1.length(); i++) {
                if(Character.isDigit(JTF1.charAt(i))){
                    field1 = true;
                }else{
                    field1 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF2.length(); i++) {
                if(Character.isDigit(JTF2.charAt(i))){
                    field2 = true;
                }else{
                    field2 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF3.length(); i++) {
                if(Character.isDigit(JTF3.charAt(i))){
                    field3 = true;
                }else{
                    field3 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF4.length(); i++) {
                if(Character.isDigit(JTF4.charAt(i))){
                    field4 = true;
                }else{
                    field4 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF5.length(); i++) {
                if(Character.isDigit(JTF5.charAt(i))){
                    field5 = true;
                }else{
                    field5 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF6.length(); i++) {
                if(Character.isDigit(JTF6.charAt(i))){
                    field6 = true;
                }else{
                    field6 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF7.length(); i++) {
                if(Character.isDigit(JTF7.charAt(i))){
                    field7 = true;
                }else{
                    field7 = false;
                    break;
                }
            }
            for (int i = 0; i < JTF8.length(); i++) {
                if(Character.isDigit(JTF8.charAt(i))){
                    field8 = true;
                }else{
                    field8 = false;
                    break;
                }
            }
            if (field1 && field2 && field3 && field4 && field5 && field6 && field7 && field8){
            tiempoInv = Integer.parseInt(jTextField1.getText());
            costoInv = Integer.parseInt(jTextField2.getText());
            tiempoProd = Integer.parseInt(jTextField3.getText());
            costoProd = Integer.parseInt(jTextField4.getText());
            tiempoEmpaq = Integer.parseInt(jTextField5.getText());
            costoEmpaq = Integer.parseInt(jTextField6.getText());
            tiempoSal = Integer.parseInt(jTextField7.getText());
            costoSal = Integer.parseInt(jTextField8.getText());
            System.out.println("Inventario | Tiempo: " + tiempoInv + "s | Costo: " + costoInv + "Q/s");
            System.out.println("Producción | Tiempo: " + tiempoProd + "s | Costo: " + costoProd + "Q/s");
            System.out.println("Empaquetado | Tiempo: " + tiempoEmpaq + "s | Costo: " + costoEmpaq + "Q/s");
            System.out.println("Salida | Tiempo: " + tiempoSal + "s | Costo: " + costoSal + "Q/s");
            System.out.println("________________________________________________________________________________________");  
            //___________________________________________________________________________________________________________________________________________
            JFrame ventana = new JFrame("Simulación");
            ventana.setSize(350, 850);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jpanel objeto = new jpanel();
            circulo circ = new circulo();
            ventana.add(circ);
            ventana.add(objeto);
            ventana.setVisible(true);
            /*JLabel Linicio = new JLabel();
            Linicio.setText("Inicio: ");
            Linicio.setSize(100, 20);
            Linicio.setLocation(60, 160);
            ventana.add(Linicio);
            JLabel Linv = new JLabel();
            Linv.setText("Inventario: ");
            Linv.setSize(100, 20);
            Linv.setLocation(210, 160);
            ventana.add(Linv);
            JLabel Lprod = new JLabel();
            Lprod.setText("Producción: ");
            Lprod.setSize(100, 20);
            Lprod.setLocation(210, 310);
            ventana.add(Lprod);
            JLabel Lempaq = new JLabel();
            Lempaq.setText("Empaquetado: ");
            Lempaq.setSize(100, 20);
            Lempaq.setLocation(210, 460);
            ventana.add(Lempaq);
            JLabel Lsal = new JLabel();
            Lsal.setText("Salida: ");
            Lsal.setSize(100, 20);
            Lsal.setLocation(210, 610);
            ventana.add(Lsal);
            JLabel LFinal = new JLabel();
            LFinal.setText("Final: ");
            LFinal.setSize(100, 20);
            LFinal.setLocation(60, 610);
            ventana.add(LFinal);*/
            
        }else{
                JOptionPane.showMessageDialog(rootPane, "Los valores deben ser enteros positivos!");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Faltan areas por rellenar!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
