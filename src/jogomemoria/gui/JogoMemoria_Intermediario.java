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
import jogomemoria.gui.msc.Sound;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author Aluno
 */
public class JogoMemoria_Intermediario extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;

    PecaTabuleiro ptSel1; //1ª Peca de tabuleiro selecionada em cada jogada
    PecaTabuleiro ptSel2; //2ª Peca de tabuleiro selecionada em cada jogada
    int pecasSelecionadas = 0; //Qtde de pecas de tabuleiro selecionadas num dado momento

    public JogoMemoria_Intermediario(JogoMemoriaCtrl ctrl) {
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

        if (inicioJogo || pctb[0][4].isVirado()) {
            idImg = pctb[0][4].getIdImagem();
            ImageIcon img04 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl04()).setIcon(img04);
        } else {
            (getLbl04()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][5].isVirado()) {
            idImg = pctb[0][5].getIdImagem();
            ImageIcon img05 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl05()).setIcon(img05);
        } else {
            (getLbl05()).setIcon(imgDuvida);
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

        if (inicioJogo || pctb[1][4].isVirado()) {
            idImg = pctb[1][4].getIdImagem();
            ImageIcon img14 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl14()).setIcon(img14);
        } else {
            (getLbl14()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][5].isVirado()) {
            idImg = pctb[1][5].getIdImagem();
            ImageIcon img15 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl15()).setIcon(img15);
        } else {
            (getLbl15()).setIcon(imgDuvida);
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

        if (inicioJogo || pctb[2][4].isVirado()) {
            idImg = pctb[2][4].getIdImagem();
            ImageIcon img24 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl24()).setIcon(img24);
        } else {
            (getLbl24()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][5].isVirado()) {
            idImg = pctb[2][5].getIdImagem();
            ImageIcon img25 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl25()).setIcon(img25);
        } else {
            (getLbl25()).setIcon(imgDuvida);
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

        if (inicioJogo || pctb[3][4].isVirado()) {
            idImg = pctb[3][4].getIdImagem();
            ImageIcon img34 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl34()).setIcon(img34);
        } else {
            (getLbl34()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][5].isVirado()) {
            idImg = pctb[3][5].getIdImagem();
            ImageIcon img35 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl35()).setIcon(img35);
        } else {
            (getLbl35()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][0].isVirado()) {
            idImg = pctb[4][0].getIdImagem();
            ImageIcon img40 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl40()).setIcon(img40);
        } else {
            (getLbl40()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][1].isVirado()) {
            idImg = pctb[4][1].getIdImagem();
            ImageIcon img41 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl41()).setIcon(img41);
        } else {
            (getLbl41()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][2].isVirado()) {
            idImg = pctb[4][2].getIdImagem();
            ImageIcon img42 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl42()).setIcon(img42);
        } else {
            (getLbl42()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][3].isVirado()) {
            idImg = pctb[4][3].getIdImagem();
            ImageIcon img43 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl43()).setIcon(img43);
        } else {
            (getLbl43()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][4].isVirado()) {
            idImg = pctb[4][4].getIdImagem();
            ImageIcon img44 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl44()).setIcon(img44);
        } else {
            (getLbl44()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][5].isVirado()) {
            idImg = pctb[4][5].getIdImagem();
            ImageIcon img45 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl45()).setIcon(img45);
        } else {
            (getLbl45()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][0].isVirado()) {
            idImg = pctb[5][0].getIdImagem();
            ImageIcon img50 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl50()).setIcon(img50);
        } else {
            (getLbl50()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][1].isVirado()) {
            idImg = pctb[5][1].getIdImagem();
            ImageIcon img51 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl51()).setIcon(img51);
        } else {
            (getLbl51()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][2].isVirado()) {
            idImg = pctb[5][2].getIdImagem();
            ImageIcon img52 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl52()).setIcon(img52);
        } else {
            (getLbl52()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][3].isVirado()) {
            idImg = pctb[5][3].getIdImagem();
            ImageIcon img53 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl53()).setIcon(img53);
        } else {
            (getLbl53()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][4].isVirado()) {
            idImg = pctb[5][4].getIdImagem();
            ImageIcon img54 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl54()).setIcon(img54);
        } else {
            (getLbl54()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][5].isVirado()) {
            idImg = pctb[5][5].getIdImagem();
            ImageIcon img55 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/jm" + idImg + ".jpg"));
            (getLbl55()).setIcon(img55);
        } else {
            (getLbl55()).setIcon(imgDuvida);
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
                Sound.CERTO.play();
                JOptionPane.showMessageDialog(this, "Muito bem!!!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_ERRADA) {
                Sound.ERRO.play();
                JOptionPane.showMessageDialog(this, "Puts não deu. tente de novo!!!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_INVALIDA) {
                Sound.ERRO.play();
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
        lbl04 = new javax.swing.JLabel();
        lbl05 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.GridLayout(6, 6));

        lbl00.setBackground(new java.awt.Color(204, 204, 255));
        lbl00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl00MouseEntered(evt);
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

        lbl04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl04MouseClicked(evt);
            }
        });
        add(lbl04);

        lbl05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl05MouseClicked(evt);
            }
        });
        add(lbl05);

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

        lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl14MouseClicked(evt);
            }
        });
        add(lbl14);

        lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl15MouseClicked(evt);
            }
        });
        add(lbl15);

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

        lbl24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl24MouseClicked(evt);
            }
        });
        add(lbl24);

        lbl25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl25MouseEntered(evt);
            }
        });
        add(lbl25);

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

        lbl34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl34MouseClicked(evt);
            }
        });
        add(lbl34);

        lbl35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl35MouseClicked(evt);
            }
        });
        add(lbl35);

        lbl40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl40MouseClicked(evt);
            }
        });
        add(lbl40);

        lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl41MouseClicked(evt);
            }
        });
        add(lbl41);

        lbl42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl42MouseClicked(evt);
            }
        });
        add(lbl42);

        lbl43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl43MouseClicked(evt);
            }
        });
        add(lbl43);

        lbl44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl44MouseClicked(evt);
            }
        });
        add(lbl44);

        lbl45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl45MouseClicked(evt);
            }
        });
        add(lbl45);

        lbl50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl50MouseClicked(evt);
            }
        });
        add(lbl50);

        lbl51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl51MouseClicked(evt);
            }
        });
        add(lbl51);

        lbl52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl52MouseClicked(evt);
            }
        });
        add(lbl52);

        lbl53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl53MouseClicked(evt);
            }
        });
        add(lbl53);

        lbl54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl54MouseClicked(evt);
            }
        });
        add(lbl54);

        lbl55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"))); // NOI18N
        lbl55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl55MouseClicked(evt);
            }
        });
        add(lbl55);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl00MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl00MouseEntered
        tentarJogada(0, 0, lbl00);
    }//GEN-LAST:event_lbl00MouseEntered

    private void lbl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseClicked
        tentarJogada(0, 1, lbl01);
    }//GEN-LAST:event_lbl01MouseClicked

    private void lbl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseClicked
        tentarJogada(0, 2, lbl02);
    }//GEN-LAST:event_lbl02MouseClicked

    private void lbl03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl03MouseClicked
        tentarJogada(0, 3, lbl03);
    }//GEN-LAST:event_lbl03MouseClicked

    private void lbl04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl04MouseClicked
        tentarJogada(0, 4, lbl04);
    }//GEN-LAST:event_lbl04MouseClicked

    private void lbl05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl05MouseClicked
        tentarJogada(0, 5, lbl05);
    }//GEN-LAST:event_lbl05MouseClicked

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

    private void lbl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl14MouseClicked
        tentarJogada(1, 4, lbl14);
    }//GEN-LAST:event_lbl14MouseClicked

    private void lbl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl15MouseClicked
        tentarJogada(1, 5, lbl15);
    }//GEN-LAST:event_lbl15MouseClicked

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

    private void lbl24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl24MouseClicked
        tentarJogada(2, 4, lbl24);
    }//GEN-LAST:event_lbl24MouseClicked

    private void lbl25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl25MouseEntered
        tentarJogada(2, 5, lbl25);
    }//GEN-LAST:event_lbl25MouseEntered

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

    private void lbl34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl34MouseClicked
        tentarJogada(3, 4, lbl34);
    }//GEN-LAST:event_lbl34MouseClicked

    private void lbl35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl35MouseClicked
        tentarJogada(3, 5, lbl35);
    }//GEN-LAST:event_lbl35MouseClicked

    private void lbl40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl40MouseClicked
        tentarJogada(4, 0, lbl40);
    }//GEN-LAST:event_lbl40MouseClicked

    private void lbl41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl41MouseClicked
        tentarJogada(4, 1, lbl41);
    }//GEN-LAST:event_lbl41MouseClicked

    private void lbl42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl42MouseClicked
        tentarJogada(4, 2, lbl42);
    }//GEN-LAST:event_lbl42MouseClicked

    private void lbl43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl43MouseClicked
        tentarJogada(4, 3, lbl43);
    }//GEN-LAST:event_lbl43MouseClicked

    private void lbl44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl44MouseClicked
        tentarJogada(4, 4, lbl44);
    }//GEN-LAST:event_lbl44MouseClicked

    private void lbl45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl45MouseClicked
        tentarJogada(4, 5, lbl45);
    }//GEN-LAST:event_lbl45MouseClicked

    private void lbl50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl50MouseClicked
        tentarJogada(5, 0, lbl50);
    }//GEN-LAST:event_lbl50MouseClicked

    private void lbl51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl51MouseClicked
        tentarJogada(5, 1, lbl51);
    }//GEN-LAST:event_lbl51MouseClicked

    private void lbl52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl52MouseClicked
        tentarJogada(5, 2, lbl52);
    }//GEN-LAST:event_lbl52MouseClicked

    private void lbl53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl53MouseClicked
        tentarJogada(5, 3, lbl53);
    }//GEN-LAST:event_lbl53MouseClicked

    private void lbl54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl54MouseClicked
        tentarJogada(5, 4, lbl54);
    }//GEN-LAST:event_lbl54MouseClicked

    private void lbl55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl55MouseClicked
        tentarJogada(5, 5, lbl55);
    }//GEN-LAST:event_lbl55MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl03;
    private javax.swing.JLabel lbl04;
    private javax.swing.JLabel lbl05;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
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
     * @return the lbl04
     */
    public javax.swing.JLabel getLbl04() {
        return lbl04;
    }

    /**
     * @param lbl04 the lbl04 to set
     */
    public void setLbl04(javax.swing.JLabel lbl04) {
        this.lbl04 = lbl04;
    }

    /**
     * @return the lbl05
     */
    public javax.swing.JLabel getLbl05() {
        return lbl05;
    }

    /**
     * @param lbl05 the lbl05 to set
     */
    public void setLbl05(javax.swing.JLabel lbl05) {
        this.lbl05 = lbl05;
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
     * @return the lbl14
     */
    public javax.swing.JLabel getLbl14() {
        return lbl14;
    }

    /**
     * @param lbl14 the lbl14 to set
     */
    public void setLbl14(javax.swing.JLabel lbl14) {
        this.lbl14 = lbl14;
    }

    /**
     * @return the lbl15
     */
    public javax.swing.JLabel getLbl15() {
        return lbl15;
    }

    /**
     * @param lbl15 the lbl15 to set
     */
    public void setLbl15(javax.swing.JLabel lbl15) {
        this.lbl15 = lbl15;
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
     * @return the lbl24
     */
    public javax.swing.JLabel getLbl24() {
        return lbl24;
    }

    /**
     * @param lbl24 the lbl24 to set
     */
    public void setLbl24(javax.swing.JLabel lbl24) {
        this.lbl24 = lbl24;
    }

    /**
     * @return the lbl25
     */
    public javax.swing.JLabel getLbl25() {
        return lbl25;
    }

    /**
     * @param lbl25 the lbl25 to set
     */
    public void setLbl25(javax.swing.JLabel lbl25) {
        this.lbl25 = lbl25;
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

    /**
     * @return the lbl34
     */
    public javax.swing.JLabel getLbl34() {
        return lbl34;
    }

    /**
     * @param lbl34 the lbl34 to set
     */
    public void setLbl34(javax.swing.JLabel lbl34) {
        this.lbl34 = lbl34;
    }

    /**
     * @return the lbl35
     */
    public javax.swing.JLabel getLbl35() {
        return lbl35;
    }

    /**
     * @param lbl35 the lbl35 to set
     */
    public void setLbl35(javax.swing.JLabel lbl35) {
        this.lbl35 = lbl35;
    }

    /**
     * @return the lbl40
     */
    public javax.swing.JLabel getLbl40() {
        return lbl40;
    }

    /**
     * @param lbl40 the lbl40 to set
     */
    public void setLbl40(javax.swing.JLabel lbl40) {
        this.lbl40 = lbl40;
    }

    /**
     * @return the lbl41
     */
    public javax.swing.JLabel getLbl41() {
        return lbl41;
    }

    /**
     * @param lbl41 the lbl41 to set
     */
    public void setLbl41(javax.swing.JLabel lbl41) {
        this.lbl41 = lbl41;
    }

    /**
     * @return the lbl42
     */
    public javax.swing.JLabel getLbl42() {
        return lbl42;
    }

    /**
     * @param lbl42 the lbl42 to set
     */
    public void setLbl42(javax.swing.JLabel lbl42) {
        this.lbl42 = lbl42;
    }

    /**
     * @return the lbl43
     */
    public javax.swing.JLabel getLbl43() {
        return lbl43;
    }

    /**
     * @param lbl43 the lbl43 to set
     */
    public void setLbl43(javax.swing.JLabel lbl43) {
        this.lbl43 = lbl43;
    }

    /**
     * @return the lbl44
     */
    public javax.swing.JLabel getLbl44() {
        return lbl44;
    }

    /**
     * @param lbl44 the lbl44 to set
     */
    public void setLbl44(javax.swing.JLabel lbl44) {
        this.lbl44 = lbl44;
    }

    /**
     * @return the lbl45
     */
    public javax.swing.JLabel getLbl45() {
        return lbl45;
    }

    /**
     * @param lbl45 the lbl45 to set
     */
    public void setLbl45(javax.swing.JLabel lbl45) {
        this.lbl45 = lbl45;
    }

    /**
     * @return the lbl50
     */
    public javax.swing.JLabel getLbl50() {
        return lbl50;
    }

    /**
     * @param lbl50 the lbl50 to set
     */
    public void setLbl50(javax.swing.JLabel lbl50) {
        this.lbl50 = lbl50;
    }

    /**
     * @return the lbl51
     */
    public javax.swing.JLabel getLbl51() {
        return lbl51;
    }

    /**
     * @param lbl51 the lbl51 to set
     */
    public void setLbl51(javax.swing.JLabel lbl51) {
        this.lbl51 = lbl51;
    }

    /**
     * @return the lbl52
     */
    public javax.swing.JLabel getLbl52() {
        return lbl52;
    }

    /**
     * @param lbl52 the lbl52 to set
     */
    public void setLbl52(javax.swing.JLabel lbl52) {
        this.lbl52 = lbl52;
    }

    /**
     * @return the lbl53
     */
    public javax.swing.JLabel getLbl53() {
        return lbl53;
    }

    /**
     * @param lbl53 the lbl53 to set
     */
    public void setLbl53(javax.swing.JLabel lbl53) {
        this.lbl53 = lbl53;
    }

    /**
     * @return the lbl54
     */
    public javax.swing.JLabel getLbl54() {
        return lbl54;
    }

    /**
     * @param lbl54 the lbl54 to set
     */
    public void setLbl54(javax.swing.JLabel lbl54) {
        this.lbl54 = lbl54;
    }

    /**
     * @return the lbl55
     */
    public javax.swing.JLabel getLbl55() {
        return lbl55;
    }

    /**
     * @param lbl55 the lbl55 to set
     */
    public void setLbl55(javax.swing.JLabel lbl55) {
        this.lbl55 = lbl55;
    }

    public void setControle(JogoMemoriaCtrl controle) {
        this.controle = controle;
    }
}
