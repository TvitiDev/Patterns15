/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main_frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author константин
 */
public class Reference extends javax.swing.JDialog {

/**
 * Creates new form Reference
 */
public Reference(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    this.getContentPane().setBackground(Color.WHITE);
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
        jTextAreaReference = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("main_frame/Bundle"); // NOI18N
        setTitle(bundle.getString("Reference.title")); // NOI18N
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        addWindowListener(formListener);

        jTextAreaReference.setEditable(false);
        jTextAreaReference.setColumns(20);
        jTextAreaReference.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextAreaReference.setLineWrap(true);
        jTextAreaReference.setRows(5);
        jTextAreaReference.setText(bundle.getString("Reference.jTextAreaReference.text")); // NOI18N
        jTextAreaReference.setToolTipText(bundle.getString("Reference.jTextAreaReference.toolTipText")); // NOI18N
        jTextAreaReference.setAutoscrolls(false);
        jTextAreaReference.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jTextAreaReference.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextAreaReference.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextAreaReference.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaReference.setRequestFocusEnabled(false);
        jTextAreaReference.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextAreaReference);

        jButtonExit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonExit.setText(bundle.getString("Reference.jButtonExit.text")); // NOI18N
        jButtonExit.setToolTipText(bundle.getString("Reference.jButtonExit.toolTipText")); // NOI18N
        jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonExit.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonExit.setFocusable(false);
        jButtonExit.setName("exit"); // NOI18N
        jButtonExit.setRolloverEnabled(false);
        jButtonExit.addMouseListener(formListener);
        jButtonExit.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.awt.event.WindowListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButtonExit) {
                Reference.this.jButtonExitActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonExit) {
                Reference.this.jButtonExitMouseEntered(evt);
            }
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonExit) {
                Reference.this.jButtonExitMouseExited(evt);
            }
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }

        public void windowActivated(java.awt.event.WindowEvent evt) {
        }

        public void windowClosed(java.awt.event.WindowEvent evt) {
        }

        public void windowClosing(java.awt.event.WindowEvent evt) {
        }

        public void windowDeactivated(java.awt.event.WindowEvent evt) {
        }

        public void windowDeiconified(java.awt.event.WindowEvent evt) {
        }

        public void windowIconified(java.awt.event.WindowEvent evt) {
        }

        public void windowOpened(java.awt.event.WindowEvent evt) {
            if (evt.getSource() == Reference.this) {
                Reference.this.formWindowOpened(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        picture=Toolkit.getDefaultToolkit().getImage("program/mks.jpg");
        this.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseEntered
        // TODO add your handling code here:
        this.jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
    }//GEN-LAST:event_jButtonExitMouseEntered

    private void jButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseExited
        // TODO add your handling code here:
        jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));

    }//GEN-LAST:event_jButtonExitMouseExited

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonExitActionPerformed
@Override
public void paint(Graphics g)
{
     g.drawImage(picture, 0, 25, this);
    this.print_1();  
}
protected void print_1()
{
    this.jButtonExit.repaint();
    this.jTextAreaReference.repaint();
}
/**
 * @param args the command line arguments
 */
protected Image picture;//заставка

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaReference;
    // End of variables declaration//GEN-END:variables
}
