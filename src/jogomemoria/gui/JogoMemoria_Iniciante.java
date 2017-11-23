 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author Aluno
 */
public class JogoMemoria_Iniciante extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;

    PecaTabuleiro ptSel1; //1ª Peca de tabuleiro selecionada em cada jogada
    PecaTabuleiro ptSel2; //2ª Peca de tabuleiro selecionada em cada jogada
    int pecasSelecionadas = 0; //Qtde de pecas de tabuleiro selecionadas num dado momento

    public JogoMemoria_Iniciante(JogoMemoriaCtrl ctrl) {
        initComponents();
        controle = ctrl;
    }

    public void mostrar(boolean inicioJogo) {

        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;

        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"));

        if (inicioJogo || pctb[0][0].isVirado()) {
            idImg = pctb[0][0].getIdImagem();
            ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl00()).setIcon(img00);
        } else {
            (getLbl00()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][1].isVirado()) {
            idImg = pctb[0][1].getIdImagem();
            ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl01()).setIcon(img01);
        } else {
            (getLbl01()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][2].isVirado()) {
            idImg = pctb[0][2].getIdImagem();
            ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl02()).setIcon(img02);
        } else {
            (getLbl02()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][3].isVirado()) {
            idImg = pctb[0][3].getIdImagem();
            ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl03()).setIcon(img03);
        } else {
            (getLbl03()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][0].isVirado()) {
            idImg = pctb[1][0].getIdImagem();
            ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl10()).setIcon(img10);
        } else {
            (getLbl10()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][1].isVirado()) {
            idImg = pctb[1][1].getIdImagem();
            ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl11()).setIcon(img11);
        } else {
            (getLbl11()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][2].isVirado()) {
            idImg = pctb[1][2].getIdImagem();
            ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl12()).setIcon(img12);
        } else {
            (getLbl12()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][3].isVirado()) {
            idImg = pctb[1][3].getIdImagem();
            ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl13()).setIcon(img13);
        } else {
            (getLbl13()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][0].isVirado()) {
            idImg = pctb[2][0].getIdImagem();
            ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl20()).setIcon(img20);
        } else {
            (getLbl20()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][1].isVirado()) {
            idImg = pctb[2][1].getIdImagem();
            ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl21()).setIcon(img21);
        } else {
            (getLbl21()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][2].isVirado()) {
            idImg = pctb[2][2].getIdImagem();
            ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl22()).setIcon(img22);
        } else {
            (getLbl22()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][3].isVirado()) {
            idImg = pctb[2][3].getIdImagem();
            ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl23()).setIcon(img23);
        } else {
            (getLbl23()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][0].isVirado()) {
            idImg = pctb[3][0].getIdImagem();
            ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl30()).setIcon(img30);
        } else {
            (getLbl30()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][1].isVirado()) {
            idImg = pctb[3][1].getIdImagem();
            ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl31()).setIcon(img31);
        } else {
            (getLbl31()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][2].isVirado()) {
            idImg = pctb[3][2].getIdImagem();
            ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl32()).setIcon(img32);
        } else {
            (getLbl32()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][3].isVirado()) {
            idImg = pctb[3][3].getIdImagem();
            ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl33()).setIcon(img33);
        } else {
            (getLbl33()).setIcon(imgDuvida);
        }

    }

    private void tentarJogada(int linha, int coluna, JLabel rotuloImagem) {
        PecaTabuleiro pt[][] = controle.getTabuleiro();

        int idImg = pt[linha][coluna].getIdImagem();
        ImageIcon img = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
        rotuloImagem.setIcon(img);

        if (pecasSelecionadas == 0) {
            ptSel1 = pt[linha][coluna];
            pecasSelecionadas++;
        } else if (pecasSelecionadas == 1) {
            ptSel2 = pt[linha][coluna];
            int result = controle.realizarJogada(ptSel1, ptSel2);
            if (result == controle.JOGADA_CERTA) {
                JOptionPane.showMessageDialog(this, "Muito bem!!!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_ERRADA) {
                JOptionPane.showMessageDialog(this, "Puts não deu. tente de novo!!!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_INVALIDA) {
                JOptionPane.showMessageDialog(this, "Ô meu, se liga!!!", "Resultado da jogada", JOptionPane.ERROR_MESSAGE);
            }
            pecasSelecionadas = 0;
            mostrar(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl00 = new javax.swing.JLabel();
        lbl01 = new javax.swing.JLabel();
        lbl02 = new javax.swing.JLabel();
        lbl03 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        lbl00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl00MouseClicked(evt);
            }
        });
        add(lbl00);

        lbl01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl01MouseClicked(evt);
            }
        });
        add(lbl01);

        lbl02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl02MouseClicked(evt);
            }
        });
        add(lbl02);

        lbl03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl03MouseClicked(evt);
            }
        });
        add(lbl03);

        lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });
        add(lbl10);

        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });
        add(lbl11);

        lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });
        add(lbl12);

        lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl13MouseClicked(evt);
            }
        });
        add(lbl13);

        lbl20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });
        add(lbl20);

        lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl21MouseClicked(evt);
            }
        });
        add(lbl21);

        lbl22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl22MouseClicked(evt);
            }
        });
        add(lbl22);

        lbl23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl23MouseClicked(evt);
            }
        });
        add(lbl23);

        lbl30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl30MouseClicked(evt);
            }
        });
        add(lbl30);

        lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl31MouseClicked(evt);
            }
        });
        add(lbl31);

        lbl32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl32MouseClicked(evt);
            }
        });
        add(lbl32);

        lbl33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl33MouseClicked(evt);
            }
        });
        add(lbl33);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl00MouseClicked
        tentarJogada(0, 0, lbl00);
    }//GEN-LAST:event_lbl00MouseClicked

    private void lbl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseClicked
        tentarJogada(0, 1, lbl01);
    }//GEN-LAST:event_lbl01MouseClicked

    private void lbl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseClicked
        tentarJogada(0, 2, lbl02);
    }//GEN-LAST:event_lbl02MouseClicked

    private void lbl03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl03MouseClicked
        tentarJogada(0, 3, lbl03);
    }//GEN-LAST:event_lbl03MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        tentarJogada(1, 0, lbl10);
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        tentarJogada(1, 1, lbl11);
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        tentarJogada(1, 2, lbl12);
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl13MouseClicked
        tentarJogada(1, 3, lbl13);
    }//GEN-LAST:event_lbl13MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        tentarJogada(2, 0, lbl20);
    }//GEN-LAST:event_lbl20MouseClicked

    private void lbl21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl21MouseClicked
        tentarJogada(2, 1, lbl21);
    }//GEN-LAST:event_lbl21MouseClicked

    private void lbl22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl22MouseClicked
        tentarJogada(2, 2, lbl22);
    }//GEN-LAST:event_lbl22MouseClicked

    private void lbl23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl23MouseClicked
        tentarJogada(2, 3, lbl23);
    }//GEN-LAST:event_lbl23MouseClicked

    private void lbl30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl30MouseClicked
        tentarJogada(3, 0, lbl30);
    }//GEN-LAST:event_lbl30MouseClicked

    private void lbl31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl31MouseClicked
        tentarJogada(3, 1, lbl31);
    }//GEN-LAST:event_lbl31MouseClicked

    private void lbl32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl32MouseClicked
        tentarJogada(3, 2, lbl32);
    }//GEN-LAST:event_lbl32MouseClicked

    private void lbl33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl33MouseClicked
        tentarJogada(3, 3, lbl33);
    }//GEN-LAST:event_lbl33MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl03;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the lbl00
     */
    public javax.swing.JLabel getLbl00() {
        return lbl00;
    }

    /**
     * @param lbl00 the lbl00 to set
     */
    public void setLbl00(javax.swing.JLabel lbl00) {
        this.lbl00 = lbl00;
    }

    /**
     * @return the lbl01
     */
    public javax.swing.JLabel getLbl01() {
        return lbl01;
    }

    /**
     * @param lbl01 the lbl01 to set
     */
    public void setLbl01(javax.swing.JLabel lbl01) {
        this.lbl01 = lbl01;
    }

    /**
     * @return the lbl02
     */
    public javax.swing.JLabel getLbl02() {
        return lbl02;
    }

    /**
     * @param lbl02 the lbl02 to set
     */
    public void setLbl02(javax.swing.JLabel lbl02) {
        this.lbl02 = lbl02;
    }

    /**
     * @return the lbl03
     */
    public javax.swing.JLabel getLbl03() {
        return lbl03;
    }

    /**
     * @param lbl03 the lbl03 to set
     */
    public void setLbl03(javax.swing.JLabel lbl03) {
        this.lbl03 = lbl03;
    }

    /**
     * @return the lbl10
     */
    public javax.swing.JLabel getLbl10() {
        return lbl10;
    }

    /**
     * @param lbl10 the lbl10 to set
     */
    public void setLbl10(javax.swing.JLabel lbl10) {
        this.lbl10 = lbl10;
    }

    /**
     * @return the lbl11
     */
    public javax.swing.JLabel getLbl11() {
        return lbl11;
    }

    /**
     * @param lbl11 the lbl11 to set
     */
    public void setLbl11(javax.swing.JLabel lbl11) {
        this.lbl11 = lbl11;
    }

    /**
     * @return the lbl12
     */
    public javax.swing.JLabel getLbl12() {
        return lbl12;
    }

    /**
     * @param lbl12 the lbl12 to set
     */
    public void setLbl12(javax.swing.JLabel lbl12) {
        this.lbl12 = lbl12;
    }

    /**
     * @return the lbl13
     */
    public javax.swing.JLabel getLbl13() {
        return lbl13;
    }

    /**
     * @param lbl13 the lbl13 to set
     */
    public void setLbl13(javax.swing.JLabel lbl13) {
        this.lbl13 = lbl13;
    }

    /**
     * @return the lbl20
     */
    public javax.swing.JLabel getLbl20() {
        return lbl20;
    }

    /**
     * @param lbl20 the lbl20 to set
     */
    public void setLbl20(javax.swing.JLabel lbl20) {
        this.lbl20 = lbl20;
    }

    /**
     * @return the lbl21
     */
    public javax.swing.JLabel getLbl21() {
        return lbl21;
    }

    /**
     * @param lbl21 the lbl21 to set
     */
    public void setLbl21(javax.swing.JLabel lbl21) {
        this.lbl21 = lbl21;
    }

    /**
     * @return the lbl22
     */
    public javax.swing.JLabel getLbl22() {
        return lbl22;
    }

    /**
     * @param lbl22 the lbl22 to set
     */
    public void setLbl22(javax.swing.JLabel lbl22) {
        this.lbl22 = lbl22;
    }

    /**
     * @return the lbl23
     */
    public javax.swing.JLabel getLbl23() {
        return lbl23;
    }

    /**
     * @param lbl23 the lbl23 to set
     */
    public void setLbl23(javax.swing.JLabel lbl23) {
        this.lbl23 = lbl23;
    }

    /**
     * @return the lbl30
     */
    public javax.swing.JLabel getLbl30() {
        return lbl30;
    }

    /**
     * @param lbl30 the lbl30 to set
     */
    public void setLbl30(javax.swing.JLabel lbl30) {
        this.lbl30 = lbl30;
    }

    /**
     * @return the lbl31
     */
    public javax.swing.JLabel getLbl31() {
        return lbl31;
    }

    /**
     * @param lbl31 the lbl31 to set
     */
    public void setLbl31(javax.swing.JLabel lbl31) {
        this.lbl31 = lbl31;
    }

    /**
     * @return the lbl32
     */
    public javax.swing.JLabel getLbl32() {
        return lbl32;
    }

    /**
     * @param lbl32 the lbl32 to set
     */
    public void setLbl32(javax.swing.JLabel lbl32) {
        this.lbl32 = lbl32;
    }

    /**
     * @return the lbl33
     */
    public javax.swing.JLabel getLbl33() {
        return lbl33;
    }

    /**
     * @param lbl33 the lbl33 to set
     */
    public void setLbl33(javax.swing.JLabel lbl33) {
        this.lbl33 = lbl33;
    }

    public JogoMemoriaCtrl getControle() {
        return controle;
    }

    /**
     * @param controle the controle to set
     */
    public void setControle(JogoMemoriaCtrl controle) {
        this.controle = controle;
    }

}
