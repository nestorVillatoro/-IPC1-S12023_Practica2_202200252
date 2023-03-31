package com.mycompany.monkey;

import static com.mycompany.monkey.jpanel.contFinal;
import static com.mycompany.monkey.menu.costoEmpaq;
import static com.mycompany.monkey.menu.costoInv;
import static com.mycompany.monkey.menu.costoProd;
import static com.mycompany.monkey.menu.costoSal;
import static com.mycompany.monkey.menu.tiempoEmpaq;
import static com.mycompany.monkey.menu.tiempoInv;
import static com.mycompany.monkey.menu.tiempoProd;
import static com.mycompany.monkey.menu.tiempoSal;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class sim extends javax.swing.JFrame {
    
    public sim() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpanel1 = new com.mycompany.monkey.jpanel();
        circulo1 = new com.mycompany.monkey.circulo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REPORTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circulo1Layout = new javax.swing.GroupLayout(circulo1);
        circulo1.setLayout(circulo1Layout);
        circulo1Layout.setHorizontalGroup(
            circulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        circulo1Layout.setVerticalGroup(
            circulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(circulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(circulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jpanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(contFinal==30){
            menu newframe = new menu();
            newframe.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debes esperar a que la simulación termine!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(contFinal==30){
        long totalInventario = tiempoInv*costoInv*30;
        long totalProduccion = tiempoProd*costoProd*30;
        long totalEmpaquetado = tiempoEmpaq*costoEmpaq*30;
        long totalSalida = tiempoSal*costoSal*30;
        long total = totalSalida+totalEmpaquetado+totalProduccion+totalInventario;
        String contenido = "<html>\n" +
                           "<head>\n" +
                           "<meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>\n" +
                           "<title>Reporte</title>\n" +
                           "</head>\n" +
                           "<body>\n" +
                "<center>\n" +
                           "<h1>Reporte</h1>\n" +
                           "<table border='1'>\n"+
                
                           "<tr>\n"+
                           "<th>Costo total del sector Inventario</th>\n"+
                           "<th>Costo total del sector Producción</th>\n"+
                           "<th>Costo total del sector Empaquetado</th>\n"+
                           "<th>Costo total del sector Salida</th>\n"+
                           "<th>Costo total de todos los sectore</th>\n"+
                           "</tr>\n"+
                
                           "<tr>\n"+
                           "<td>" + totalInventario + "Q</td>\n"+
                           "<td>" + totalProduccion + "Q</td>\n"+
                           "<td>" + totalEmpaquetado + "Q</td>\n"+
                           "<td>" + totalSalida + "Q</td>\n"+
                           "<td>" + total + "Q</td>\n"+
                           "</tr>\n"+
                
                           "</table>\n"+
                           "<p>Néstor Enrique Villatoro Avendaño</p><br>\n"+
                           "<p>202200252</p><br>\n"+
                "</center>\n" +
                           "</body>\n" +
                           "</html>";
        try {
            FileWriter archivo = new FileWriter("Reporte.html"); 
            archivo.write(contenido);
            archivo.close();
            System.out.println("El archivo HTML ha sido generado exitosamente.");
            JOptionPane.showMessageDialog(rootPane, "El archivo reporte.html ha sido generado exitosamente!");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al generar el archivo HTML: " + e.getMessage());
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debes esperar a que la simulación termine!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sim().setVisible(true);
                /*Thread hilo = new Thread(new circulo());
                hilo.start();*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.monkey.circulo circulo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.mycompany.monkey.jpanel jpanel1;
    // End of variables declaration//GEN-END:variables
}
