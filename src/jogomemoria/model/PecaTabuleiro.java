package jogomemoria.model;

public class PecaTabuleiro {

    private int numero;//numero de imagens
    private int idImagem;// cada imagens 
    private int linha;//linha do tabuleiro
    private int coluna;//linha da coluna
    private boolean virado;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * @param numero the coluna to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the imagem
     */
    public int getIdImagem() {
        return idImagem;
    }
    
    /**
     * @param idImagem the coluna to set
     */
    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /**
     * @return the virado
     */
    public boolean isVirado() {
        return virado;
    }

    /**
     * @param virado the virado to set
     */
    public void setVirado(boolean virado) {
        this.virado = virado;
    }

}
