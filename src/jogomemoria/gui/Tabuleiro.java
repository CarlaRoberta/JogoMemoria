/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.JSplitPane;

/**
 *
 * @author Aluno
 */
public class Tabuleiro extends javax.swing.JPanel {

    /**
     * Creates new form Tabuleiro
     */
    public Tabuleiro() {
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

        sppTabuleiro = new javax.swing.JSplitPane();
        infos1 = new jogomemoria.gui.Infos();

        setLayout(new java.awt.BorderLayout());

        sppTabuleiro.setMinimumSize(new java.awt.Dimension(500, 25));
        sppTabuleiro.setRightComponent(infos1);

        add(sppTabuleiro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public JSplitPane getsppTabuleiro(){
        return sppTabuleiro;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogomemoria.gui.Infos infos1;
    private javax.swing.JSplitPane sppTabuleiro;
    // End of variables declaration//GEN-END:variables
}
