/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs404_one;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MrInsanity25
 */
public class FailedLoginGUI extends javax.swing.JFrame 
{
    //This is the FailedLoginListObject referenced in the rest of the program
    //FailedLoginList logFile = new FailedLoginList();
    
    // Don't forget, you will also need to couple my processed FailedLoginList to a FailFinder
    // to actually parse out the names. You will have to do something like:
    
    // FailedLoginList loginList = new FailedLoginList (filename);
    // loginList.processLogs ();
    File file;
    FailedLoginList loginList;
    private boolean browsed = false;
    private boolean canExport = false;
    // FailFinder processedNames = new FailFinder (loginList);
    // processedNames.processTimes ();      // or whatever Dolan decides for this method name
    // int listSize = processedNames.getSize () // or however Dolan decides to present this data
    // for (int i = 0; i < listSize; i++) {
    //      // set list model here
    // }
    
    /**
     * Creates new form FailedLoginGUI
     */
    public FailedLoginGUI() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jFileChooser2 = new javax.swing.JFileChooser();
        jTextField1 = new javax.swing.JTextField();
        jBrowseButton = new javax.swing.JButton();
        jFindButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jExportMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jResetMenuItem = new javax.swing.JMenuItem();
        jCloseMenuItem = new javax.swing.JMenuItem();

        jFileChooser1.addChoosableFileFilter(new FileNameExtensionFilter("log file", "log"));

        jDialog1.setMinimumSize(new java.awt.Dimension(545, 120));
        jDialog1.setModal(true);

        jLabel2.setText("Please make sure that no programs are using the csv file if you have exported previously. ");
        jLabel2.setToolTipText("");

        jLabel3.setText("This could cause an error with the program.");

        jButton1.setText("OK");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel3)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Failed Login Finder");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));

        jBrowseButton.setText("Browse");
        jBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowseButtonActionPerformed(evt);
            }
        });

        jFindButton.setText("Find Logins");
        jFindButton.setEnabled(false);
        jFindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Account", "IP Address"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("User Account");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("IP Address");
        }

        jLabel1.setText("Logins failed 3 or more times in 5 minutes");

        jMenu1.setText("File");

        jExportMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        jExportMenuItem.setText("Export to CSV");
        jExportMenuItem.setEnabled(false);
        jExportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExportMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(jExportMenuItem);
        jMenu1.add(jSeparator2);

        jResetMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jResetMenuItem.setText("Reset");
        jResetMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(jResetMenuItem);

        jCloseMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
        jCloseMenuItem.setText("Close Program");
        jCloseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(jCloseMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBrowseButton))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jFindButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrowseButton)
                    .addComponent(jFindButton))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExportMenuItemActionPerformed
        jDialog1.setVisible(true);
        if(canExport)
        {
            File file;
            if(evt.getSource() == jExportMenuItem)
            {
                jFileChooser2.setFileSelectionMode(1);
                int returnVal = jFileChooser2.showOpenDialog(this);
                if(returnVal == jFileChooser2.APPROVE_OPTION)
                {
                    String fileName = jFileChooser2.getSelectedFile().toString() + "\\file.csv";
                    System.out.println(fileName);
                    BufferedWriter buffWrite = null;
                    FileWriter fileWrite = null;

                    try
                    {
                        fileWrite = new FileWriter(fileName);
                        buffWrite = new BufferedWriter(fileWrite);
                        //replace 2 with the listSize variable.  Using rowCount will result in error because of null values
                        for(int i = 0; i < jTable1.getRowCount(); i++)
                        {
                            buffWrite.write(jTable1.getValueAt(i, 0).toString() + ", " + jTable1.getValueAt(i, 1).toString());
                        }
                    }
                    catch(IOException e)
                    {
                        e.printStackTrace();
                    }
                    finally
                    {
                        try
                        {
                            if(buffWrite != null)
                            {
                                buffWrite.close();
                            }

                            if(fileWrite != null)
                            {
                                fileWrite.close();
                            }
                        }
                        catch(IOException f)
                        {
                            f.printStackTrace();
                        }


                    }
                }
            }

            
        }
        
        
        //file = jFileChooser2.setFileSelectionMode(1);
    }//GEN-LAST:event_jExportMenuItemActionPerformed

    private void jBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowseButtonActionPerformed
        if(evt.getSource() == jBrowseButton)
        {
            int returnVal = jFileChooser1.showOpenDialog(this);
            if(returnVal == jFileChooser1.APPROVE_OPTION)
            {
                file = jFileChooser1.getSelectedFile();
                browsed = true;
                jFindButton.setEnabled(true);
                jTextField1.setText(file.toString());
                jBrowseButton.setEnabled(false);
            }
            
        }
        
        
        
        
        //This will send the file to FailedLoginList to be worked on. 
        //FailedLoginListObject.setFile(file);  
        /*
                    I noticed in FailedLoginList you want a string with the filename.  IF you want to use that
                method, I'll need setName instead of setFile since the FailedLoginListObject needs to be made
                outside of this method for it to work.
        */
        
        /* Instead of making one primary FailedLoginList object as a member of your class,
           consider this design instead, similar to using the JFileChooser:
        
            FailedLoginListObject = new FailedLoginList (file);
        
            That actually eliminates the need for a reset button as the object gets
            recreated on every log file change. 
        */
        
        //This is for testing purposes
        //System.out.println(file.getName());
    }//GEN-LAST:event_jBrowseButtonActionPerformed

    private void jFindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindButtonActionPerformed
        
        if(evt.getSource() == jFindButton)
        {
            //int returnVal = jFileChooser1.showOpenDialog(this);
            if(browsed)
            {
                
                loginList = new FailedLoginList(jTextField1.getText());
                loginList.readLogFile();
                
                FailFinder processedNames = new FailFinder(loginList.getFailedLogins());
                
                processedNames.processFails();
                
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    boolean removeRows = true;
                    
                    while(removeRows)
                    {
                        if(jTable1.getRowCount() > 0)
                        {
                            model.removeRow(jTable1.getRowCount()-1);
                        }
                        else
                        {
                            removeRows = false;
                        }
                    }
                    
                    while(jTable1.getRowCount() < processedNames.usernameCount())
                    {
                          model.addRow(new Object[]{null, null}); 
                    }
                
                for(int i = 0; i < processedNames.usernameCount(); i++)
                {
                    jTable1.setValueAt(processedNames.getUsernameAt(i), i, 0);
                }
                
                for(int i = 0; i < processedNames.usernameCount(); i++)
                {
                    jTable1.setValueAt(processedNames.getUserIPAddrs(i), i, 1);
                }
                
                canExport = true;
                jExportMenuItem.setEnabled(true);
            }
        }
        
//        jTable1.setValueAt("1",0,0);
//        jTable1.setValueAt("2",0,1);
//        jTable1.setValueAt("3",1,0);
//        jTable1.setValueAt("4",1,1);
        
        //Code will be put here for getting the size and adjusting the table to suit
        /*
            if(jTable1.getRowCount() < FailedLoginListObject.getSize())
            {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while(jTable1.getRowCount() < FailedLoginListObject.getSize())
                {
                      model.addRow(new Object[]{null, null}); 
                }
            }
        */
        
        
        //Fills in names in the first column,  5 would be FailedLoginListObject.getSize()
//        for(int row = 0; row < 5; row++)
//        {
//                //jTable1.setValueAt(FailedLoginListObject.getName(i), row, 0);
//        }
        
        //Fills in IP Addresses in the second column,  5 would be FailedLoginListObject.getSize()
//        for(int row = 0; row < 5; row++)
//        {
//                //jTable1.setValueAt(FailedLoginListObject.getAddress(i), row, 1);
//        }
    }//GEN-LAST:event_jFindButtonActionPerformed

    private void jResetMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetMenuItemActionPerformed
        for(int cell = 0; cell < jTable1.getRowCount(); cell++)
        {
            jTable1.setValueAt("", cell, 0);
            jTable1.setValueAt("", cell, 1);
        }
        
        canExport = false;
        jExportMenuItem.setEnabled(false);
        jBrowseButton.setEnabled(true);
        jFindButton.setEnabled(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jResetMenuItemActionPerformed

    private void jCloseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCloseMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // test code for FailFinder class
        /*
        FailedLoginList fll = new FailedLoginList ("owncloud.log");
        fll.readLogFile();
        
        FailFinder ff = new FailFinder (fll.getFailedLogins());
        ff.processFails ();
      
        for (int i = 0; i < ff.usernameCount(); i++) {
            
            ff.getUsernameAt (i);
        }
        */
        
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
            java.util.logging.Logger.getLogger(FailedLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FailedLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FailedLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FailedLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FailedLoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBrowseButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jCloseMenuItem;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuItem jExportMenuItem;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JButton jFindButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jResetMenuItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
