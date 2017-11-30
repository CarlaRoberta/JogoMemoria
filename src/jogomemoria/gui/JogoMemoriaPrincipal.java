package jogomemoria.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

public class JogoMemoriaPrincipal extends JFrame {

    Tabuleiro tb = new Tabuleiro();
    JogoMemoria_Iniciante jpf;
    JogoMemoria_Intermediario jpi;
    JogoMemoria_Dificil jpd;
    private JogoMemoriaCtrl controle;

    public JogoMemoriaPrincipal() {
        initComponents();
        controle = new JogoMemoriaCtrl();
        jpf = new JogoMemoria_Iniciante(controle);
        jpi = new JogoMemoria_Intermediario(controle);
        jpd = new JogoMemoria_Dificil(controle);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        sppPrincipal = new javax.swing.JSplitPane();
        pnl_Principal = new javax.swing.JPanel();
        lbl_Tempo = new javax.swing.JLabel();
        spn_tempo = new javax.swing.JSpinner();
        btn_Iniciar = new javax.swing.JButton();
        cmb_niveis = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        pnl_principal2 = new javax.swing.JPanel();
        jogo = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lbl_subtitulo = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sppPrincipal.setDividerLocation(45);
        sppPrincipal.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnl_Principal.setToolTipText("");
        pnl_Principal.setFocusable(false);
        pnl_Principal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lbl_Tempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Tempo.setText("Tempo Limite:");

        btn_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Iniciar.setText("Iniciar");
        btn_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarActionPerformed(evt);
            }
        });

        cmb_niveis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facil", "Intermediario", "Dificil" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Niveis");

        javax.swing.GroupLayout pnl_PrincipalLayout = new javax.swing.GroupLayout(pnl_Principal);
        pnl_Principal.setLayout(pnl_PrincipalLayout);
        pnl_PrincipalLayout.setHorizontalGroup(
            pnl_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Tempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spn_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_niveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Iniciar))
        );
        pnl_PrincipalLayout.setVerticalGroup(
            pnl_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Tempo)
                    .addComponent(spn_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Iniciar)
                    .addComponent(cmb_niveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sppPrincipal.setLeftComponent(pnl_Principal);

        jogo.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/logoo.jpg"))); // NOI18N

        lbl_subtitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_subtitulo.setText("Personagens da Disney");

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(51, 153, 255));
        lbl_titulo.setText("Jogo da Memória");

        javax.swing.GroupLayout jogoLayout = new javax.swing.GroupLayout(jogo);
        jogo.setLayout(jogoLayout);
        jogoLayout.setHorizontalGroup(
            jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogoLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(84, 84, 84))
            .addGroup(jogoLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_subtitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogoLayout.setVerticalGroup(
            jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(lbl_subtitulo)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jogo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jogo.setLayer(lbl_subtitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jogo.setLayer(lbl_titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnl_principal2Layout = new javax.swing.GroupLayout(pnl_principal2);
        pnl_principal2.setLayout(pnl_principal2Layout);
        pnl_principal2Layout.setHorizontalGroup(
            pnl_principal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogo)
        );
        pnl_principal2Layout.setVerticalGroup(
            pnl_principal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principal2Layout.createSequentialGroup()
                .addComponent(jogo)
                .addContainerGap())
        );

        sppPrincipal.setRightComponent(pnl_principal2);

        getContentPane().add(sppPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarActionPerformed
        String item = (String) cmb_niveis.getSelectedItem();
        int nivelSelect = 0;

        if (item.equals("Facil")) {
            nivelSelect = controle.FACIL;
            this.setSize(900, 800);
        }
        if (item.equals("Intermediario")) {
            nivelSelect = controle.INTERMEDIARIO;
        }
        if (item.equals("Dificil")) {
            nivelSelect = controle.DIFICIL;
        }
        int tempoLimite = (((Integer) spn_tempo.getValue()).intValue());
        sppPrincipal.setRightComponent(tb);
        this.repaint();
        controle.iniciarPartida(nivelSelect, tempoLimite);
        mostrarTabuleiro(true);
        int resp = JOptionPane.showConfirmDialog(this, "Pronto para Iniciar????", "Confirme inicio", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            mostrarTabuleiro(false);
        }

    }//GEN-LAST:event_btn_IniciarActionPerformed

    public void mostrarTabuleiro(boolean inicioJogo) {

        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;
        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/interrog.jpg"));

        int nivel = controle.getNivelAtual();
        if (controle.FACIL == nivel) {
            tb.getsppTabuleiro().setLeftComponent(jpf);
            jpf.mostrar(inicioJogo);
        }
        if (controle.INTERMEDIARIO == nivel) {
            tb.getsppTabuleiro().setLeftComponent(jpi);
            jpi.mostrar(inicioJogo);
        }
        if (controle.DIFICIL == nivel) {
            tb.getsppTabuleiro().setLeftComponent(jpd);
            jpd.mostrar(inicioJogo);
        }

        sppPrincipal.setRightComponent(tb);
        this.repaint();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoMemoriaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Iniciar;
    private javax.swing.JComboBox cmb_niveis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDesktopPane jogo;
    private javax.swing.JLabel lbl_Tempo;
    private javax.swing.JLabel lbl_subtitulo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_Principal;
    private javax.swing.JPanel pnl_principal2;
    private javax.swing.JSpinner spn_tempo;
    private javax.swing.JSplitPane sppPrincipal;
    // End of variables declaration//GEN-END:variables
}
