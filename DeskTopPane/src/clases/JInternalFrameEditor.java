/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class JInternalFrameEditor extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameEditor
     */
    public JInternalFrameEditor() {
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

        fileChooser = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonNuevo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonCopiar = new javax.swing.JButton();
        jButtonPegar = new javax.swing.JButton();
        jButtonCortar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setTitle("Editor de Textos");

        jToolBar1.setRollover(true);

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/nuevo.gif"))); // NOI18N
        jButtonNuevo.setToolTipText("Nuevo");
        jButtonNuevo.setFocusable(false);
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonNuevo);

        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/abrir.gif"))); // NOI18N
        jButtonAbrir.setToolTipText("Abrir");
        jButtonAbrir.setFocusable(false);
        jButtonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAbrir);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/guardar.gif"))); // NOI18N
        jButtonGuardar.setToolTipText("Guardar");
        jButtonGuardar.setFocusable(false);
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonGuardar);

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/impresora.gif"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir");
        jButtonImprimir.setFocusable(false);
        jButtonImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonImprimir);
        jToolBar1.add(jSeparator1);

        jButtonCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/copiar.gif"))); // NOI18N
        jButtonCopiar.setToolTipText("Copiar");
        jButtonCopiar.setFocusable(false);
        jButtonCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCopiar);

        jButtonPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/pegar.gif"))); // NOI18N
        jButtonPegar.setToolTipText("Pegar");
        jButtonPegar.setFocusable(false);
        jButtonPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPegarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPegar);

        jButtonCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/cortar.gif"))); // NOI18N
        jButtonCortar.setToolTipText("Cortar");
        jButtonCortar.setFocusable(false);
        jButtonCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCortar);
        jToolBar1.add(jSeparator2);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/buscar.gif"))); // NOI18N
        jButtonBuscar.setToolTipText("Buscar");
        jButtonBuscar.setFocusable(false);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonBuscar);

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/salir.gif"))); // NOI18N
        jButtonSalir.setToolTipText("Salir");
        jButtonSalir.setFocusable(false);
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSalir);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        this.textArea.setText("");
        this.textArea.requestFocus();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        // TODO add your handling code here:
        this.OpenActionPerformed(evt);
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        this.SaveActionPerformed();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        // TODO add your handling code here:
        this.PrintActionPerformed(evt);
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jButtonCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarActionPerformed
        // TODO add your handling code here:
        this.textArea.copy();
    }//GEN-LAST:event_jButtonCopiarActionPerformed

    private void jButtonPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPegarActionPerformed
        // TODO add your handling code here:
        this.textArea.paste();
    }//GEN-LAST:event_jButtonPegarActionPerformed

    private void jButtonCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCortarActionPerformed
        // TODO add your handling code here:
        this.textArea.cut();
    }//GEN-LAST:event_jButtonCortarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int posicion = 0;
        String palabra = JOptionPane.showInputDialog(this, "Palabra a buscar: ", "Buscar", JOptionPane.QUESTION_MESSAGE);
        this.textArea.requestFocus();
        String contenido = this.textArea.getText();
        posicion = contenido.indexOf(palabra, posicion);
        if (posicion != 1) {
            this.textArea.select(posicion, (posicion + palabra.length()));
        } else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado: " + palabra);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                textArea.read(new FileReader(file.getAbsolutePath()), null);
            } catch (IOException ex) {
                System.out.println("Problema al acceder al archivo" + file.getAbsolutePath());
            }
        } else {
            System.out.println("Acceso al archivo cancelado por el usuario");
        }
    }

    private void SaveActionPerformed() {
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            if (guarda != null) {
                /*guardamos el archivo y le damos el formato directamente,
                 * si queremos que se guarde en formato doc lo definimos como .doc*/
                FileWriter save = new FileWriter(guarda + ".txt");
                save.write(textArea.getText());
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se ha guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {
        String todo = this.textArea.getText();
        PrintJob pjob = getToolkit().getPrintJob(new Frame(), "Imprimir Hoja", null);
        Graphics pg = pjob.getGraphics();
        pg.setFont(new Font("SansSerif", Font.PLAIN, 10));
        pg.drawString("Imprimiendo...", 100, 100);
        int inicio = 0;
        int numlineas = 1;
        for (int i = 0; i < todo.length(); i++) {
            if ((int) todo.charAt(i) == 10) {
                pg.drawString(todo.substring(inicio, i - 1), 100, 100 + (15 * numlineas));
                inicio = i + 1;
                numlineas++;
            }
        }
        pg.drawString(todo.substring(inicio, todo.length()), 100, 100 + (15 * numlineas));
        pg.dispose(); //Finalizar pagina
        pjob.end(); //Termina trabajo e imprime

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCopiar;
    private javax.swing.JButton jButtonCortar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonPegar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
