package GUI;


import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        returnBtn = new javax.swing.JButton();
        informationBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mapBtn = new javax.swing.JButton();
        languageBtn = new javax.swing.JButton();
        departureBtn = new javax.swing.JButton();

        returnBtn.setText("Return");
        returnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnBtn.setMaximumSize(new java.awt.Dimension(85, 45));
        returnBtn.setMinimumSize(new java.awt.Dimension(85, 45));
        returnBtn.setPreferredSize(new java.awt.Dimension(85, 45));
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        informationBtn.setText("Information");
        informationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informationBtn.setMaximumSize(new java.awt.Dimension(180, 70));
        informationBtn.setMinimumSize(new java.awt.Dimension(180, 70));
        informationBtn.setPreferredSize(new java.awt.Dimension(180, 70));
        informationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Click me!");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(180, 70));
        jButton3.setMinimumSize(new java.awt.Dimension(180, 70));
        jButton3.setPreferredSize(new java.awt.Dimension(180, 70));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        mapBtn.setText("Map");
        mapBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mapBtn.setMaximumSize(new java.awt.Dimension(180, 70));
        mapBtn.setMinimumSize(new java.awt.Dimension(180, 70));
        mapBtn.setPreferredSize(new java.awt.Dimension(180, 70));

        languageBtn.setText("Change language");
        languageBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        languageBtn.setMaximumSize(new java.awt.Dimension(180, 70));
        languageBtn.setMinimumSize(new java.awt.Dimension(180, 70));
        languageBtn.setPreferredSize(new java.awt.Dimension(180, 70));
        languageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageBtnActionPerformed(evt);
            }
        });

        departureBtn.setText("Departure time");
        departureBtn.setMaximumSize(new java.awt.Dimension(180, 70));
        departureBtn.setMinimumSize(new java.awt.Dimension(180, 70));
        departureBtn.setPreferredSize(new java.awt.Dimension(180, 70));
        departureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(departureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(languageBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mapBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(informationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(informationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(languageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void informationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_informationBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(Desktop.isDesktopSupported())
{
    try {
        Desktop.getDesktop().browse(new URI("http://www.example.com"));
    } catch (IOException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    } catch (URISyntaxException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

    private void languageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageBtnActionPerformed

    private void departureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton departureBtn;
    private javax.swing.JButton informationBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton languageBtn;
    private javax.swing.JButton mapBtn;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables

    public void addActionListenerWelcomeScreen(ActionListener l){
        returnBtn.addActionListener(l);
    }
    
    public void addActionListenerInformationScreen(ActionListener l){
        informationBtn.addActionListener(l);
    }
    
        public void addActionListenerMapScreen(ActionListener l){
        mapBtn.addActionListener(l);
    }
    
    public void addActionListenerChangeLanguage(ActionListener l){
        languageBtn.addActionListener(l);
    }
    
    public void addActionListenerDeparture(ActionListener l){
        departureBtn.addActionListener(l);
    }

}
