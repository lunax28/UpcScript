
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author equilibrium
 */
public class Rename extends javax.swing.JFrame {

    /**
     * Creates new form Rename
     */
    File sourceFolderPath = null;

    public Rename() {
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

        jLabel1 = new javax.swing.JLabel();
        FolderPath = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RenameItmsp = new javax.swing.JButton();
        UpcRename = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jLabel9 = new javax.swing.JLabel();
        sourceButton = new javax.swing.JButton();
        sourceLabelOne = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sourceLabelTwo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        InfoMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CopyMenu = new javax.swing.JMenuItem();
        PasteMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("Select Folder");

        FolderPath.setText("Folder");
        FolderPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolderPathActionPerformed(evt);
            }
        });

        jLabel2.setText("Create itmsp package:");

        RenameItmsp.setText(".itmsp");
        RenameItmsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenameItmspActionPerformed(evt);
            }
        });

        UpcRename.setText("UPC");
        UpcRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpcRenameActionPerformed(evt);
            }
        });

        jLabel5.setText("Select Folder");

        jButton1.setText("Tracks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort Tracks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Create and Rename Folders according to upc.txt");

        jLabel8.setText("Sort");

        textArea1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textArea1TextValueChanged(evt);
            }
        });

        jLabel9.setText("UPC List");

        sourceButton.setText("SOURCE");
        sourceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceButtonActionPerformed(evt);
            }
        });

        sourceLabelOne.setText("1)");

        jLabel10.setText("Select the source folder. Album folders will be created according to the UPC List");

        jMenu1.setText("File");

        InfoMenu.setText("Info");
        InfoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoMenuActionPerformed(evt);
            }
        });
        jMenu1.add(InfoMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        CopyMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        CopyMenu.setText("Copy");
        CopyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyMenuActionPerformed(evt);
            }
        });
        jMenu2.add(CopyMenu);

        PasteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.META_MASK));
        PasteMenu.setText("Paste");
        PasteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteMenuActionPerformed(evt);
            }
        });
        jMenu2.add(PasteMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2))
                            .addComponent(RenameItmsp)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UpcRename)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FolderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addGap(56, 56, 56))
                            .addComponent(textArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sourceLabelOne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sourceButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sourceLabelTwo)))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sourceButton)
                    .addComponent(sourceLabelTwo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpcRename)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(FolderPath)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RenameItmsp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(sourceLabelOne)
                .addGap(411, 411, 411))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FolderPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolderPathActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(null);
        chooser.setDialogTitle("Choose a folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File sourcepath = null;
            sourcepath = chooser.getSelectedFile();
            String name = chooser.getName(sourcepath);
            System.out.println("name is: " + name);
            System.out.println(sourcepath.getAbsolutePath());

            System.out.println("path is: " + sourcepath.toString());

            if (!name.matches("[0-9]{13}")) {
                JOptionPane.showMessageDialog(this, "The folder name must contain a valid UPC");
                return;
            }

            String file_name = sourcepath.toString();
            //JOptionPane.showMessageDialog(this.frame, file_name);
            String title = "Confirmation Dialog";
            String message = "Make sure this is the correct folder! Files will be renamed, no reverse option. \n" + sourcepath.getAbsolutePath();

            int reply = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {

                jLabel3.setText(sourcepath.toString());

            } else {
                JOptionPane.showMessageDialog(this, "An error has occured!");

            }
        }
    }//GEN-LAST:event_FolderPathActionPerformed

    //concatenates .itmsp to the subdirectories in jLabel3.getText()
    private void RenameItmspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenameItmspActionPerformed
        if (jLabel3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a folder first");
            return;
        }
        File sourcepath = null;
        sourcepath = new File(jLabel3.getText());

        System.out.println(sourcepath);

        File list[] = sourcepath.listFiles();
        if (list == null) {
            JOptionPane.showMessageDialog(this, "No files/folders found");
            return;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i].isDirectory()) {
                File re = new File(list[i].getAbsolutePath().concat(".itmsp"));
                list[i].renameTo(re);
            }
        }
        JOptionPane.showMessageDialog(this, "Folders renamed!*");
    }//GEN-LAST:event_RenameItmspActionPerformed

    //rename the subdirectories with the relative UPC found in upc.txt
    private void UpcRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpcRenameActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(null);
        chooser.setDialogTitle("Choose a folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File sourcepath = null;
            sourcepath = chooser.getSelectedFile();

            String name = chooser.getName(sourcepath);
            System.out.println("name is: " + name);
            System.out.println(sourcepath.getAbsolutePath());

            System.out.println("path is: " + sourcepath.toString());

            if (!name.matches("[0-9]{13}")) {
                JOptionPane.showMessageDialog(this, "The folder name must contain a valid UPC");
                return;
            }

            String title = "Confirmation Dialog";
            String message = "Make sure this is the correct folder! Files will be renamed, no reverse option. \n" + sourcepath.getAbsolutePath();

            int reply = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {

                jLabel4.setText(sourcepath.toString());

            } else {
                JOptionPane.showMessageDialog(this, "An error has occured!");
                return;

            }

            if (textArea1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "UPC list empty!");
                jLabel4.setText("");
                return;

            }

            Scanner r = null;

            try {
                r = new Scanner(textArea1.getText());

                for (int i = 0; i < 15; i++) {

                    if (r.hasNextLine()) {

                        File file = new File(sourcepath.toString().concat("/").concat(r.nextLine()));
                        file.mkdir();

                    }
                }
            } finally {
                if (r != null) {
                    r.close();
                }
            }

            /*
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(null);
        chooser.setDialogTitle("Choose a folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File sourcepath = null;
            sourcepath = chooser.getSelectedFile();

            String name = chooser.getName(sourcepath);
            System.out.println("name is: " + name);
            System.out.println(sourcepath.getAbsolutePath());

            System.out.println("path is: " + sourcepath.toString());

            if (!name.matches("[0-9]{13}")) {
                JOptionPane.showMessageDialog(this, "The folder name must contain a valid UPC");
                return;
            }

            String title = "Confirmation Dialog";
            String message = "Make sure this is the correct folder! Files will be renamed, no reverse option. \n" + sourcepath.getAbsolutePath();

            int reply = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {

                jLabel4.setText(sourcepath.toString());

            } else {
                JOptionPane.showMessageDialog(this, "An error has occured!");
                return;

            }

            Scanner r = null;

            try {
                r = new Scanner(new BufferedReader(new FileReader("/Users/equilibrium/Desktop/upc.txt")));

                for (int i = 0; i < 15; i++) {

                    if (r.hasNextLine()) {

                        File file = new File(sourcepath.toString().concat("/").concat(r.nextLine()));
                        file.mkdir();

                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Rename.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (r != null) {
                    r.close();
                }
            }

        }

             */
        }
    }//GEN-LAST:event_UpcRenameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(null);
        chooser.setDialogTitle("Choose a folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File sourcepath = null;
            sourcepath = chooser.getSelectedFile();
            String name = chooser.getName(sourcepath);
            System.out.println("name is: " + name);
            System.out.println(sourcepath.getAbsolutePath());

            System.out.println("path is: " + sourcepath.toString());

            if (!name.matches("[0-9]{13}")) {
                JOptionPane.showMessageDialog(this, "The folder name must be named after a valid UPC");
                return;
            }

            String title = "Confirmation Dialog";
            String message = "Make sure this is the correct folder! Files will be renamed, no reverse option. \n" + sourcepath.getAbsolutePath();

            int reply = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {

                jLabel7.setText(sourcepath.toString());

            } else {
                JOptionPane.showMessageDialog(this, "An error has occured!");

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        File tracksFolder = null;
        File sourcepath = new File(jLabel7.getText());
        System.out.println("sourcepath: " + sourcepath);

        if (jLabel7.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a folder with your songs first");
            return;
        }

        try {
            tracksFolder = new File(jLabel7.getText() + "/" + "tracks");
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println(tracksFolder);

        File listRoot[] = sourcepath.listFiles();

        if (listRoot == null) {
            System.out.println("no files");
            return;
        } else {
            System.out.println("tracks folder available");
        }

        int count = 0;

        ArrayList<Integer> listRandom = new ArrayList<Integer>();

        Random rand = new Random();

        int index = 0;
        int in = 0;
        while (count < listRoot.length) {

            listRandom.clear();
            for (int i = 0; i < tracksFolder.listFiles().length; i++) {
                listRandom.add(i);
            }

            File list[] = tracksFolder.listFiles();
            if (list == null) {
                return;
            }

            if (listRoot[count].isDirectory() && listRoot[count].getName().matches("[0-9]{13}")) {
                for (int i = 0; i < 25; i++) {

                    if (listRandom.isEmpty()) {
                        return;
                    }
                    System.out.println("NEW LOOP i: " + i);
                    System.out.println("line 61: LIST length: " + list.length);
                    System.out.println("line 62: LISTRANDOM size: " + listRandom.size());
                    index = rand.nextInt(listRandom.size());

                    System.out.println("index: " + index);

                    Collections.shuffle(listRandom);
                    System.out.println("listRandom: " + listRandom);
                    System.out.println("listRandom.get(index): " + listRandom.get(index));
                    in = listRandom.remove(index);
                    System.out.println("in: " + in);

                    if (list[in].isFile() && !list[in].isHidden()) {

                        if (list[in].renameTo(new File(listRoot[count] + "/" + list[in].getName()))) {
                            System.out.println("File is moved successfully!");
                            list[in].delete();
                        } else {
                            System.out.println("File has failed to move!");
                        }
                    } else {
                        i = i - 1;
                    }
                }
            }
            count++;

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void textArea1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textArea1TextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textArea1TextValueChanged

    private void PasteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteMenuActionPerformed
        /*
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        String s = textArea1.getSelectedText();
        StringSelection clipString = new StringSelection(s);
        clip.setContents(clipString, null);
         */
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result;
        try {
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
            textArea1.setText(result);
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(Rename.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Rename.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PasteMenuActionPerformed

    private void CopyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyMenuActionPerformed
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        String s = textArea1.getSelectedText();
        StringSelection clipString = new StringSelection(s);
        clip.setContents(clipString, null);
    }//GEN-LAST:event_CopyMenuActionPerformed

    private void InfoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoMenuActionPerformed
        JOptionPane.showMessageDialog(this, "Alberto Vecchi - Version 1.1");
    }//GEN-LAST:event_InfoMenuActionPerformed

    private void sourceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(null);
        chooser.setDialogTitle("Choose a folder");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            sourceFolderPath = chooser.getSelectedFile();

            String name = chooser.getName(sourceFolderPath);
            System.out.println("name is: " + name);
            System.out.println(sourceFolderPath.getAbsolutePath());
            System.out.println("path is: " + sourceFolderPath.toString());

            if (!name.matches("[0-9]{13}")) {
                JOptionPane.showMessageDialog(this, "The folder name must contain a valid UPC");
                return;
            }

            String title = "Confirmation Dialog";
            String message = "Make sure this is the correct folder! Files will be renamed, no reverse option. \n" + sourceFolderPath.getAbsolutePath();

            int reply = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {

                sourceLabelTwo.setText(sourceFolderPath.toString());

            } else {
                JOptionPane.showMessageDialog(this, "An error has occured!");
                return;

            }
        }
    }//GEN-LAST:event_sourceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Rename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rename.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rename().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CopyMenu;
    private javax.swing.JButton FolderPath;
    private javax.swing.JMenuItem InfoMenu;
    private javax.swing.JMenuItem PasteMenu;
    private javax.swing.JButton RenameItmsp;
    private javax.swing.JButton UpcRename;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton sourceButton;
    private javax.swing.JLabel sourceLabelOne;
    private javax.swing.JLabel sourceLabelTwo;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
