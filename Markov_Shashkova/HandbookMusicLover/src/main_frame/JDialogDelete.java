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
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import main_compare.DateCompare;
import main_сlasses.MusicalRecording;
import main_сlasses.SongInformation;

/**
 *
 * @author константин
 */
public class JDialogDelete extends javax.swing.JDialog {

/**
 * Creates new form JDialogDelete
 */
public JDialogDelete(java.awt.Frame parent, boolean modal,ArrayList<MusicalRecording> music) {
    super(parent, modal);
    initComponents();
    this.music=music;
    this.getContentPane().setBackground(Color.white);
    this.initializeFields();
    this.changingComponents();
}
private void initializeFields()
{
   picture=Toolkit.getDefaultToolkit().getImage("program/155.jpg");
}
private void changingComponents()
{
    DefaultTableCellRenderer r = (DefaultTableCellRenderer) this.jTableMusic.getDefaultRenderer(String.class);
    r.setHorizontalAlignment(JLabel.CENTER);
    r.setVerticalAlignment(JLabel.CENTER);
    r = (DefaultTableCellRenderer) this.jTableMusic.getTableHeader().getDefaultRenderer();
    r.setHorizontalAlignment(JLabel.CENTER);
    r.setVerticalAlignment(JLabel.CENTER);
    this.jTableMusic.getColumnModel().getColumn(0).setMinWidth(340);
    this.jTableMusic.getColumnModel().getColumn(0).setMaxWidth(340);
    
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
        jTableMusic = new javax.swing.JTable();
        jButtonExit = new javax.swing.JButton();
        jFormattedTextFieldSearchName = new javax.swing.JFormattedTextField();
        jButtonDelete = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("main_frame/Bundle"); // NOI18N
        setTitle(bundle.getString("JDialogDelete.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setModal(true);
        setResizable(false);
        addWindowListener(formListener);
        getContentPane().setLayout(null);

        jTableMusic.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jTableMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Название", "Жанр", "Дата создания"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMusic.setFillsViewportHeight(true);
        jTableMusic.setGridColor(new java.awt.Color(51, 51, 51));
        jTableMusic.setRequestFocusEnabled(false);
        jTableMusic.setRowHeight(20);
        jTableMusic.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableMusic.getTableHeader().setResizingAllowed(false);
        jTableMusic.getTableHeader().setReorderingAllowed(false);
        jTableMusic.addMouseListener(formListener);
        jScrollPane1.setViewportView(jTableMusic);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 70, 630, 370);

        jButtonExit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonExit.setText(bundle.getString("JDialogDelete.jButtonExit.text")); // NOI18N
        jButtonExit.setToolTipText(bundle.getString("JDialogDelete.jButtonExit.toolTipText")); // NOI18N
        jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonExit.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonExit.setFocusable(false);
        jButtonExit.setName("exit"); // NOI18N
        jButtonExit.setRolloverEnabled(false);
        jButtonExit.addMouseListener(formListener);
        jButtonExit.addActionListener(formListener);
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(330, 590, 320, 60);

        jFormattedTextFieldSearchName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)), bundle.getString("JDialogDelete.jFormattedTextFieldSearchName.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP)); // NOI18N
        try {
            jFormattedTextFieldSearchName.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSearchName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldSearchName.setAutoscrolls(false);
        jFormattedTextFieldSearchName.addKeyListener(formListener);
        getContentPane().add(jFormattedTextFieldSearchName);
        jFormattedTextFieldSearchName.setBounds(320, 460, 340, 40);

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonDelete.setText(bundle.getString("JDialogDelete.jButtonDelete.text")); // NOI18N
        jButtonDelete.setToolTipText(bundle.getString("JDialogDelete.jButtonDelete.toolTipText")); // NOI18N
        jButtonDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDelete.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonDelete.setFocusable(false);
        jButtonDelete.setName("exit"); // NOI18N
        jButtonDelete.setRolloverEnabled(false);
        jButtonDelete.addMouseListener(formListener);
        jButtonDelete.addActionListener(formListener);
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(800, 230, 160, 50);

        pack();
        setLocationRelativeTo(null);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.KeyListener, java.awt.event.MouseListener, java.awt.event.WindowListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButtonExit) {
                JDialogDelete.this.jButtonExitActionPerformed(evt);
            }
            else if (evt.getSource() == jButtonDelete) {
                JDialogDelete.this.jButtonDeleteActionPerformed(evt);
            }
        }

        public void keyPressed(java.awt.event.KeyEvent evt) {
        }

        public void keyReleased(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == jFormattedTextFieldSearchName) {
                JDialogDelete.this.jFormattedTextFieldSearchNameKeyReleased(evt);
            }
        }

        public void keyTyped(java.awt.event.KeyEvent evt) {
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jTableMusic) {
                JDialogDelete.this.jTableMusicMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonExit) {
                JDialogDelete.this.jButtonExitMouseEntered(evt);
            }
            else if (evt.getSource() == jButtonDelete) {
                JDialogDelete.this.jButtonDeleteMouseEntered(evt);
            }
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonExit) {
                JDialogDelete.this.jButtonExitMouseExited(evt);
            }
            else if (evt.getSource() == jButtonDelete) {
                JDialogDelete.this.jButtonDeleteMouseExited(evt);
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
            if (evt.getSource() == JDialogDelete.this) {
                JDialogDelete.this.formWindowOpened(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if(this.music.size()!=0)
        {
            this.fillTable();
            this.jTableMusic.setRowSelectionInterval(0, 0);
        }
        else
        {
            this.jButtonDelete.setEnabled(false);
        }
        this.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseEntered
        // TODO add your handling code here:
        jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
    }//GEN-LAST:event_jButtonExitMouseEntered

    private void jButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseExited
        // TODO add your handling code here:
        jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jButtonExitMouseExited

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jFormattedTextFieldSearchNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSearchNameKeyReleased
        // TODO add your handling code here:
        if(this.music.size()!=0)
        {
            if(this.jFormattedTextFieldSearchName.getText().trim().equalsIgnoreCase("")==false)
            {
                int a=-1;
                for(int i=0;i<this.music.size();i++)
                {
                    if(this.music.get(i).getSong().getName().toLowerCase().indexOf(this.jFormattedTextFieldSearchName.getText().trim().toLowerCase())==0)
                    {
                        a=i;
                        break;
                    }
                }
                if(a==-1)
                {
                    int i=this.jTableMusic.getSelectedRow();
                    if(i!=-1)
                        this.jTableMusic.removeRowSelectionInterval(i, i);
                    this.jButtonDelete.setEnabled(false);
                }
                else
                {
                    this.jTableMusic.setRowSelectionInterval(a, a);
                    this.jButtonDelete.setEnabled(true);
                }
            }
            else
            {
                int i=this.jTableMusic.getSelectedRow();
                if(i!=-1)
                    this.jTableMusic.removeRowSelectionInterval(i, i);
                this.jButtonDelete.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jFormattedTextFieldSearchNameKeyReleased

    private void jButtonDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseEntered
        // TODO add your handling code here:
        this.jButtonDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255)));
    }//GEN-LAST:event_jButtonDeleteMouseEntered

    private void jButtonDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseExited
        // TODO add your handling code here:
        this.jButtonDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
    }//GEN-LAST:event_jButtonDeleteMouseExited

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
            int i=this.jTableMusic.getSelectedRow();
            this.music.remove(i);
            DefaultTableModel table=(DefaultTableModel) this.jTableMusic.getModel();
            table.removeRow(i);
            this.jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMusicMouseClicked
        // TODO add your handling code here:
        if(jTableMusic.getSelectedRow()!=-1&&this.jButtonDelete.isEnabled()==false)
            this.jButtonDelete.setEnabled(true);  
    }//GEN-LAST:event_jTableMusicMouseClicked
protected void fillTable()
{
    String[] str=new String[3]; 
    DefaultTableModel table=(DefaultTableModel) this.jTableMusic.getModel();
    for(MusicalRecording v:this.music)
    {
        str[0]=v.getSong().getName();
        str[1]=this.russificationGenre(v.getSong().getGenre());
        if(new DateCompare().compare(v.getSong().getCreationDate(), "1.1.1")!=0)
            str[2]=v.getSong().getCreationDate();
        else
            str[2]=" ";
        table.addRow(str);
    }
}
protected String russificationGenre(String str)
{
    String s=null;
    if(str.equalsIgnoreCase(SongInformation.CLASSIC))
    {
        s="Классика";
    }
    else
    {
        if(str.equalsIgnoreCase(SongInformation.JAZZ))
        {
            s="Джаз";
        }
        else
        {
            if(str.equalsIgnoreCase(SongInformation.POP))
            {
                s="Поп";
            }
            else
                s="Рок";
        }
    }
    return s;
}
/**
 * @param args the command line arguments
 */
@Override
public void paint(Graphics g)
{
    g.drawImage(this.picture, 0, 25, this);
    this.paint_1();
}
@Override
public void update(Graphics g)
{
    g.drawImage(this.picture, 0, 25,this);
    this.update_1();
    
}
public void paint_1()
{
    for(int i=0;i<this.getContentPane().getComponentCount();i++)
    {
        this.getContentPane().getComponent(i).repaint();
    }
}
public void update_1()
{
    for(int i=0;i<this.getContentPane().getComponentCount();i++)
    {
        this.getContentPane().getComponent(i).update(this.getContentPane().getComponent(i).getGraphics());
    }
}
protected ArrayList<MusicalRecording> music;//пременная хранящая объект кторый получен из родительской формы
protected Image picture;//заставка
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JFormattedTextField jFormattedTextFieldSearchName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMusic;
    // End of variables declaration//GEN-END:variables
}