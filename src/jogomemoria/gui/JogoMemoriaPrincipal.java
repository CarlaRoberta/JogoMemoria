package jogomemoria.gui;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

public class JogoMemoriaPrincipal extends JFrame {
    Tabuleiro tb = new Tabuleiro();
    JogoMemoria_Iniciante jpf =new JogoMemoria_Iniciante();
    JogoMemoria_Intermediario jpi =new JogoMemoria_Intermediario();
    JogoMemoria_Dificil jpd =new JogoMemoria_Dificil();
    private JogoMemoriaCtrl controle;
    
    public JogoMemoriaPrincipal() {
        initComponents();
        controle = new JogoMemoriaCtrl();
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

        jogo.setBackground(new java.awt.Color(255, 255, 255));

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
        String item=(String) cmb_niveis.getSelectedItem();
        int nivelSelect=0;
        
        
         if (item.equals("Facil")){
            nivelSelect = controle.FACIL;
            this.setSize(900, 800);
        }
        if (item.equals("Intermediario")){
            nivelSelect = controle.INTERMEDIARIO;
        }
        if (item.equals("Dificil")){
            nivelSelect = controle.DIFICIL;
        }
        int tempoLimite = (((Integer)spn_tempo.getValue()).intValue());
        sppPrincipal.setRightComponent(tb);
        this.repaint();
        controle.iniciarPartida(nivelSelect, tempoLimite);
        mostrarTabuleiro(true);
    }//GEN-LAST:event_btn_IniciarActionPerformed
 
        
    
    public void mostrarTabuleiro(boolean inicioJogo){
        PecaTabuleiro pctb[][] =  controle.getTabuleiro();
        int idImg;
        ImageIcon imgDuvida = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/interrog.jpg"));
        
        int nivel = controle.getNivelAtual();
        if(controle.FACIL == nivel){
            
            if (inicioJogo || pctb[0][0].isVirado()){
                idImg = pctb[0][0].getIdImagem();
                ImageIcon img00 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl00()).setIcon(img00);
            }else{
                (jpf.getLbl00()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[0][1].isVirado()){
                idImg = pctb[0][1].getIdImagem();
                ImageIcon img01 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl01()).setIcon(img01);
            }else{
                (jpf.getLbl01()).setIcon(imgDuvida);
            }
            
              if (inicioJogo || pctb[0][2].isVirado()){
                idImg = pctb[0][2].getIdImagem();
                ImageIcon img02 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl02()).setIcon(img02);
            }else{
                (jpf.getLbl02()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[0][3].isVirado()){
                idImg = pctb[0][3].getIdImagem();
                ImageIcon img03 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl03()).setIcon(img03);
            }else{
                (jpf.getLbl03()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][0].isVirado()){
                idImg = pctb[1][0].getIdImagem();
                ImageIcon img10 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl10()).setIcon(img10);
            }else{
                (jpf.getLbl10()).setIcon(imgDuvida);
            }
              if (inicioJogo || pctb[1][1].isVirado()){
                idImg = pctb[1][1].getIdImagem();
                ImageIcon img11 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl11()).setIcon(img11);
            }else{
                (jpf.getLbl11()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][2].isVirado()){
                idImg = pctb[1][2].getIdImagem();
                ImageIcon img12 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl12()).setIcon(img12);
            }else{
                (jpf.getLbl12()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][3].isVirado()){
                idImg = pctb[1][3].getIdImagem();
                ImageIcon img13 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl13()).setIcon(img13);
            }else{
                (jpf.getLbl13()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[2][0].isVirado()) {
                idImg = pctb[2][0].getIdImagem();
                ImageIcon img20 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl20()).setIcon(img20);
            } else {
                (jpf.getLbl20()).setIcon(imgDuvida);
            }
            
              if (inicioJogo || pctb[2][1].isVirado()) {
                idImg = pctb[2][1].getIdImagem();
                ImageIcon img21 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl21()).setIcon(img21);
            } else {
                (jpf.getLbl21()).setIcon(imgDuvida);
            }
             
            if (inicioJogo || pctb[2][2].isVirado()) {
                idImg = pctb[2][2].getIdImagem();
                ImageIcon img22 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl22()).setIcon(img22);
            } else {
                (jpf.getLbl22()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[2][3].isVirado()) {
                idImg = pctb[2][3].getIdImagem();
                ImageIcon img23 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl23()).setIcon(img23);
            } else {
                (jpf.getLbl23()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][0].isVirado()) {
                idImg = pctb[3][0].getIdImagem();
                ImageIcon img30 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl30()).setIcon(img30);
            } else {
                (jpf.getLbl30()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][1].isVirado()) {
                idImg = pctb[3][1].getIdImagem();
                ImageIcon img31 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl31()).setIcon(img31);
            } else {
                (jpf.getLbl31()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][2].isVirado()) {
                idImg = pctb[3][2].getIdImagem();
                ImageIcon img32 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl32()).setIcon(img32);
            } else {
                (jpf.getLbl32()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][3].isVirado()) {
                idImg = pctb[3][3].getIdImagem();
                ImageIcon img33 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpf.getLbl33()).setIcon(img33);
            } else {
                (jpf.getLbl33()).setIcon(imgDuvida);
            }
            
            
            tb.getsppTabuleiro().setLeftComponent(jpf);            
        }
        if(controle.INTERMEDIARIO == nivel){
             if (inicioJogo || pctb[0][0].isVirado()){
                idImg = pctb[0][0].getIdImagem();
                ImageIcon img00 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl00()).setIcon(img00);
            }else{
                (jpi.getLbl00()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[0][1].isVirado()){
                idImg = pctb[0][1].getIdImagem();
                ImageIcon img01 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl01()).setIcon(img01);
            }else{
                (jpi.getLbl01()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[0][2].isVirado()){
                idImg = pctb[0][2].getIdImagem();
                ImageIcon img02 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl02()).setIcon(img02);
            }else{
                (jpi.getLbl02()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[0][3].isVirado()){
                idImg = pctb[0][3].getIdImagem();
                ImageIcon img03 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl03()).setIcon(img03);
            }else{
                (jpi.getLbl03()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[0][4].isVirado()){
                idImg = pctb[0][4].getIdImagem();
                ImageIcon img04 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl04()).setIcon(img04);
            }else{
                (jpi.getLbl04()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[0][5].isVirado()){
                idImg = pctb[0][5].getIdImagem();
                ImageIcon img05 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl05()).setIcon(img05);
            }else{
                (jpi.getLbl05()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[1][0].isVirado()){
                idImg = pctb[1][0].getIdImagem();
                ImageIcon img10 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl10()).setIcon(img10);
            }else{
                (jpi.getLbl10()).setIcon(imgDuvida);
            }
              if (inicioJogo || pctb[1][1].isVirado()){
                idImg = pctb[1][1].getIdImagem();
                ImageIcon img11 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl11()).setIcon(img11);
            }else{
                (jpi.getLbl11()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][2].isVirado()){
                idImg = pctb[1][2].getIdImagem();
                ImageIcon img12 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl12()).setIcon(img12);
            }else{
                (jpi.getLbl12()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][3].isVirado()){
                idImg = pctb[1][3].getIdImagem();
                ImageIcon img13 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl13()).setIcon(img13);
            }else{
                (jpi.getLbl13()).setIcon(imgDuvida);
            }
             
            if (inicioJogo || pctb[1][4].isVirado()){
                idImg = pctb[1][4].getIdImagem();
                ImageIcon img14 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl14()).setIcon(img14);
            }else{
                (jpi.getLbl14()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[1][5].isVirado()){
                idImg = pctb[1][5].getIdImagem();
                ImageIcon img15 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl15()).setIcon(img15);
            }else{
                (jpi.getLbl15()).setIcon(imgDuvida);
            }
            
               if (inicioJogo || pctb[2][0].isVirado()) {
                idImg = pctb[2][0].getIdImagem();
                ImageIcon img20 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl20()).setIcon(img20);
            } else {
                (jpi.getLbl20()).setIcon(imgDuvida);
            }
            
              if (inicioJogo || pctb[2][1].isVirado()) {
                idImg = pctb[2][1].getIdImagem();
                ImageIcon img21 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl21()).setIcon(img21);
            } else {
                (jpi.getLbl21()).setIcon(imgDuvida);
            }
             
            if (inicioJogo || pctb[2][2].isVirado()) {
                idImg = pctb[2][2].getIdImagem();
                ImageIcon img22 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl22()).setIcon(img22);
            } else {
                (jpi.getLbl22()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[2][3].isVirado()) {
                idImg = pctb[2][3].getIdImagem();
                ImageIcon img23 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl23()).setIcon(img23);
            } else {
                (jpi.getLbl23()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[2][4].isVirado()) {
                idImg = pctb[2][4].getIdImagem();
                ImageIcon img24 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl24()).setIcon(img24);
            } else {
                (jpi.getLbl24()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[2][5].isVirado()) {
                idImg = pctb[2][5].getIdImagem();
                ImageIcon img25 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl25()).setIcon(img25);
            } else {
                (jpi.getLbl25()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[3][0].isVirado()) {
                idImg = pctb[3][0].getIdImagem();
                ImageIcon img30 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl30()).setIcon(img30);
            } else {
                (jpi.getLbl30()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][1].isVirado()) {
                idImg = pctb[3][1].getIdImagem();
                ImageIcon img31 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl31()).setIcon(img31);
            } else {
                (jpi.getLbl31()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][2].isVirado()) {
                idImg = pctb[3][2].getIdImagem();
                ImageIcon img32 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl32()).setIcon(img32);
            } else {
                (jpi.getLbl32()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][3].isVirado()) {
                idImg = pctb[3][3].getIdImagem();
                ImageIcon img33 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl33()).setIcon(img33);
            } else {
                (jpi.getLbl33()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][4].isVirado()) {
                idImg = pctb[3][4].getIdImagem();
                ImageIcon img34 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl34()).setIcon(img34);
            } else {
                (jpi.getLbl34()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][5].isVirado()) {
                idImg = pctb[3][5].getIdImagem();
                ImageIcon img35 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl35()).setIcon(img35);
            } else {
                (jpi.getLbl35()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][0].isVirado()) {
                idImg = pctb[4][0].getIdImagem();
                ImageIcon img40 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl40()).setIcon(img40);
            } else {
                (jpi.getLbl40()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][1].isVirado()) {
                idImg = pctb[4][1].getIdImagem();
                ImageIcon img41 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl41()).setIcon(img41);
            } else {
                (jpi.getLbl41()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][2].isVirado()) {
                idImg = pctb[4][2].getIdImagem();
                ImageIcon img42 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl42()).setIcon(img42);
            } else {
                (jpi.getLbl42()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][3].isVirado()) {
                idImg = pctb[4][3].getIdImagem();
                ImageIcon img43 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl43()).setIcon(img43);
            } else {
                (jpi.getLbl43()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][4].isVirado()) {
                idImg = pctb[4][4].getIdImagem();
                ImageIcon img44 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl44()).setIcon(img44);
            } else {
                (jpi.getLbl44()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][5].isVirado()) {
                idImg = pctb[4][5].getIdImagem();
                ImageIcon img45 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl45()).setIcon(img45);
            } else {
                (jpi.getLbl45()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][0].isVirado()) {
                idImg = pctb[5][0].getIdImagem();
                ImageIcon img50 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl50()).setIcon(img50);
            } else {
                (jpi.getLbl50()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][1].isVirado()) {
                idImg = pctb[5][1].getIdImagem();
                ImageIcon img51 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl51()).setIcon(img51);
            } else {
                (jpi.getLbl51()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][2].isVirado()) {
                idImg = pctb[5][2].getIdImagem();
                ImageIcon img52 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl52()).setIcon(img52);
            } else {
                (jpi.getLbl52()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][3].isVirado()) {
                idImg = pctb[5][3].getIdImagem();
                ImageIcon img53 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl53()).setIcon(img53);
            } else {
                (jpi.getLbl53()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][4].isVirado()) {
                idImg = pctb[5][4].getIdImagem();
                ImageIcon img54 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl54()).setIcon(img54);
            } else {
                (jpi.getLbl54()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][5].isVirado()) {
                idImg = pctb[5][5].getIdImagem();
                ImageIcon img55 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpi.getLbl55()).setIcon(img55);
            } else {
                (jpi.getLbl55()).setIcon(imgDuvida);
            }
            
            tb.getsppTabuleiro().setLeftComponent(jpi);
        }
        if(controle.DIFICIL == nivel){
             if (inicioJogo || pctb[0][0].isVirado()){
                idImg = pctb[0][0].getIdImagem();
                ImageIcon img00 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl00()).setIcon(img00);
            }else{
                (jpd.getLbl00()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[0][1].isVirado()){
                idImg = pctb[0][1].getIdImagem();
                ImageIcon img01 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl01()).setIcon(img01);
            }else{
                (jpd.getLbl01()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[0][2].isVirado()){
                idImg = pctb[0][2].getIdImagem();
                ImageIcon img02 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl02()).setIcon(img02);
            }else{
                (jpd.getLbl02()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[0][3].isVirado()){
                idImg = pctb[0][3].getIdImagem();
                ImageIcon img03 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl03()).setIcon(img03);
            }else{
                (jpd.getLbl03()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[0][4].isVirado()){
                idImg = pctb[0][4].getIdImagem();
                ImageIcon img04 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl04()).setIcon(img04);
            }else{
                (jpd.getLbl04()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[0][5].isVirado()){
                idImg = pctb[0][5].getIdImagem();
                ImageIcon img05 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl05()).setIcon(img05);
            }else{
                (jpd.getLbl05()).setIcon(imgDuvida);
            }
            
              if (inicioJogo || pctb[1][0].isVirado()){
                idImg = pctb[1][0].getIdImagem();
                ImageIcon img10 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl10()).setIcon(img10);
            }else{
                (jpd.getLbl10()).setIcon(imgDuvida);
            }
              if (inicioJogo || pctb[1][1].isVirado()){
                idImg = pctb[1][1].getIdImagem();
                ImageIcon img11 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl11()).setIcon(img11);
            }else{
                (jpd.getLbl11()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][2].isVirado()){
                idImg = pctb[1][2].getIdImagem();
                ImageIcon img12 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl12()).setIcon(img12);
            }else{
                (jpd.getLbl12()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[1][3].isVirado()){
                idImg = pctb[1][3].getIdImagem();
                ImageIcon img13 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl13()).setIcon(img13);
            }else{
                (jpd.getLbl13()).setIcon(imgDuvida);
            }
             
            if (inicioJogo || pctb[1][4].isVirado()){
                idImg = pctb[1][4].getIdImagem();
                ImageIcon img14 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl14()).setIcon(img14);
            }else{
                (jpd.getLbl14()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[1][5].isVirado()){
                idImg = pctb[1][5].getIdImagem();
                ImageIcon img15 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl15()).setIcon(img15);
            }else{
                (jpd.getLbl15()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[2][0].isVirado()) {
                idImg = pctb[2][0].getIdImagem();
                ImageIcon img20 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl20()).setIcon(img20);
            } else {
                (jpd.getLbl20()).setIcon(imgDuvida);
            }
            
              if (inicioJogo || pctb[2][1].isVirado()) {
                idImg = pctb[2][1].getIdImagem();
                ImageIcon img21 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl21()).setIcon(img21);
            } else {
                (jpd.getLbl21()).setIcon(imgDuvida);
            }
             
            if (inicioJogo || pctb[2][2].isVirado()) {
                idImg = pctb[2][2].getIdImagem();
                ImageIcon img22 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl22()).setIcon(img22);
            } else {
                (jpd.getLbl22()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[2][3].isVirado()) {
                idImg = pctb[2][3].getIdImagem();
                ImageIcon img23 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl23()).setIcon(img23);
            } else {
                (jpd.getLbl23()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[2][4].isVirado()) {
                idImg = pctb[2][4].getIdImagem();
                ImageIcon img24 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl24()).setIcon(img24);
            } else {
                (jpd.getLbl24()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[2][5].isVirado()) {
                idImg = pctb[2][5].getIdImagem();
                ImageIcon img25 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl25()).setIcon(img25);
            } else {
                (jpd.getLbl25()).setIcon(imgDuvida);
            }
             
             if (inicioJogo || pctb[3][0].isVirado()) {
                idImg = pctb[3][0].getIdImagem();
                ImageIcon img30 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl30()).setIcon(img30);
            } else {
                (jpd.getLbl30()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][1].isVirado()) {
                idImg = pctb[3][1].getIdImagem();
                ImageIcon img31 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl31()).setIcon(img31);
            } else {
                (jpd.getLbl31()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][2].isVirado()) {
                idImg = pctb[3][2].getIdImagem();
                ImageIcon img32 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl32()).setIcon(img32);
            } else {
                (jpd.getLbl32()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][3].isVirado()) {
                idImg = pctb[3][3].getIdImagem();
                ImageIcon img33 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl33()).setIcon(img33);
            } else {
                (jpd.getLbl33()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][4].isVirado()) {
                idImg = pctb[3][4].getIdImagem();
                ImageIcon img34 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl34()).setIcon(img34);
            } else {
                (jpd.getLbl34()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[3][5].isVirado()) {
                idImg = pctb[3][5].getIdImagem();
                ImageIcon img35 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl35()).setIcon(img35);
            } else {
                (jpd.getLbl35()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[4][0].isVirado()) {
                idImg = pctb[4][0].getIdImagem();
                ImageIcon img40 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl40()).setIcon(img40);
            } else {
                (jpd.getLbl40()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][1].isVirado()) {
                idImg = pctb[4][1].getIdImagem();
                ImageIcon img41 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl41()).setIcon(img41);
            } else {
                (jpd.getLbl41()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][2].isVirado()) {
                idImg = pctb[4][2].getIdImagem();
                ImageIcon img42 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl42()).setIcon(img42);
            } else {
                (jpd.getLbl42()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][3].isVirado()) {
                idImg = pctb[4][3].getIdImagem();
                ImageIcon img43 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl43()).setIcon(img43);
            } else {
                (jpd.getLbl43()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][4].isVirado()) {
                idImg = pctb[4][4].getIdImagem();
                ImageIcon img44 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl44()).setIcon(img44);
            } else {
                (jpd.getLbl44()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[4][5].isVirado()) {
                idImg = pctb[4][5].getIdImagem();
                ImageIcon img45 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl45()).setIcon(img45);
            } else {
                (jpd.getLbl45()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][0].isVirado()) {
                idImg = pctb[5][0].getIdImagem();
                ImageIcon img50 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl50()).setIcon(img50);
            } else {
                (jpd.getLbl50()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][1].isVirado()) {
                idImg = pctb[5][1].getIdImagem();
                ImageIcon img51 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl51()).setIcon(img51);
            } else {
                (jpd.getLbl51()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][2].isVirado()) {
                idImg = pctb[5][2].getIdImagem();
                ImageIcon img52 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl52()).setIcon(img52);
            } else {
                (jpd.getLbl52()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][3].isVirado()) {
                idImg = pctb[5][3].getIdImagem();
                ImageIcon img53 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl53()).setIcon(img53);
            } else {
                (jpd.getLbl53()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][4].isVirado()) {
                idImg = pctb[5][4].getIdImagem();
                ImageIcon img54 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl54()).setIcon(img54);
            } else {
                (jpd.getLbl54()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[5][5].isVirado()) {
                idImg = pctb[5][5].getIdImagem();
                ImageIcon img55 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl55()).setIcon(img55);
            } else {
                (jpd.getLbl55()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[6][0].isVirado()) {
                idImg = pctb[6][0].getIdImagem();
                ImageIcon img60 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl60()).setIcon(img60);
            } else {
                (jpd.getLbl60()).setIcon(imgDuvida);
            }
             
           
            if (inicioJogo || pctb[6][1].isVirado()) {
                idImg = pctb[6][1].getIdImagem();
                ImageIcon img61 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl61()).setIcon(img61);
            } else {
                (jpd.getLbl61()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[6][2].isVirado()) {
                idImg = pctb[6][2].getIdImagem();
                ImageIcon img62 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl62()).setIcon(img62);
            } else {
                (jpd.getLbl62()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[6][3].isVirado()) {
                idImg = pctb[6][3].getIdImagem();
                ImageIcon img63 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl63()).setIcon(img63);
            } else {
                (jpd.getLbl63()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[6][4].isVirado()) {
                idImg = pctb[6][4].getIdImagem();
                ImageIcon img64 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl64()).setIcon(img64);
            } else {
                (jpd.getLbl64()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[6][5].isVirado()) {
                idImg = pctb[6][5].getIdImagem();
                ImageIcon img65 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl65()).setIcon(img65);
            } else {
                (jpd.getLbl65()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[7][0].isVirado()) {
                idImg = pctb[7][0].getIdImagem();
                ImageIcon img70 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl70()).setIcon(img70);
            } else {
                (jpd.getLbl70()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[7][1].isVirado()) {
                idImg = pctb[7][1].getIdImagem();
                ImageIcon img71 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl71()).setIcon(img71);
            } else {
                (jpd.getLbl71()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[7][2].isVirado()) {
                idImg = pctb[7][2].getIdImagem();
                ImageIcon img72 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl72()).setIcon(img72);
            } else {
                (jpd.getLbl72()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[7][3].isVirado()) {
                idImg = pctb[7][3].getIdImagem();
                ImageIcon img73 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl73()).setIcon(img73);
            } else {
                (jpd.getLbl73()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[7][4].isVirado()) {
                idImg = pctb[7][4].getIdImagem();
                ImageIcon img74 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl74()).setIcon(img74);
            } else {
                (jpd.getLbl74()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[7][5].isVirado()) {
                idImg = pctb[7][5].getIdImagem();
                ImageIcon img75 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl75()).setIcon(img75);
            } else {
                (jpd.getLbl75()).setIcon(imgDuvida);
            }
            
             if (inicioJogo || pctb[8][0].isVirado()) {
                idImg = pctb[8][0].getIdImagem();
                ImageIcon img80 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl80()).setIcon(img80);
            } else {
                (jpd.getLbl80()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[8][1].isVirado()) {
                idImg = pctb[8][1].getIdImagem();
                ImageIcon img81 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl81()).setIcon(img81);
            } else {
                (jpd.getLbl81()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[8][2].isVirado()) {
                idImg = pctb[8][2].getIdImagem();
                ImageIcon img82 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl82()).setIcon(img82);
            } else {
                (jpd.getLbl82()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[8][3].isVirado()) {
                idImg = pctb[8][3].getIdImagem();
                ImageIcon img83 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl83()).setIcon(img83);
            } else {
                (jpd.getLbl83()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[8][4].isVirado()) {
                idImg = pctb[8][4].getIdImagem();
                ImageIcon img84 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl84()).setIcon(img84);
            } else {
                (jpd.getLbl84()).setIcon(imgDuvida);
            }
            
            if (inicioJogo || pctb[8][5].isVirado()) {
                idImg = pctb[8][5].getIdImagem();
                ImageIcon img85 = new ImageIcon (getClass().getResource("/jogomemoria/gui/img/jm"+idImg+".jpg"));
                (jpd.getLbl85()).setIcon(img85);
            } else {
                (jpd.getLbl85()).setIcon(imgDuvida);
            }
            
             
             
            tb.getsppTabuleiro().setLeftComponent(jpd);
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
