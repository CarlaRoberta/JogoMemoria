
package jogomemoria.control;

import java.security.Timestamp;

public class JogoMemoriaCtrl {
    public static final  int NIVEL_FACIL=1;//Constante para os niveis
    public static final  int NIVEL_INTERMEDIARIO=2;//Constante para os niveis
    public static final  int NIVEL_DIFICIL=3;//Constante para os niveis
    public static final  int MAX_PECAS_PARTIDAS=18;//Constante para o números de peças da partida
    public static final  int MAX_PECAS_DISPONIVEIS=20;//Constante para o números de peças(imagem)para a partida
    public static final  int QTDE_PECAS_FACIL=16;//Constante para o números de peças do nivel facil
    public static final  int QTDE_PECAS_INTERMEDIARIO=36;//Constante para o números de peças do nivel intermediario
    public static final  int QTDE_PECAS_DIFICIL=54;//Constante para o números de peças do nivel dificil
    
    private boolean jogoIniciado;//quando se inicia/ou parado
    private Timestamp inicioJogo;//quando começa
    private int tempoLimite;//tempo para execulção do jogo
    private int tabRecords[][]={{0,0,0},
                                {0,0,0},
                                {0,0,0}};
    private int pontuacaoAtual;//determina pontuação atual do jogador 
    private int nivelAtual;//nivel atual do jogador
    private int acertosPartida;//número de acertos na partida
    private int [] pecasPartida;// vetor de peças sorteadas para a partida atual
    private int [] pecasDisponiveis;//vetor de todas as peças que estão disponiveirs para a partida
    private int qtdPecasPartida;//quantidade de peças da partida -- tamanho logico do vetor peças partida
    
    public int tempoConsumido(){
    return 0;
    }
    public void iniciaJogo(int nivel){}
    public void sortearPecasJogos(){}
}
