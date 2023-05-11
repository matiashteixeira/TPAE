public class Correcao {
    private int questao;
    private boolean situacao;
    private int numTentativas;

    public Correcao(int questao, boolean situacao, int numTentativas){
        this.questao = questao;
        this.situacao = situacao;
        this.numTentativas = numTentativas;
    }

    public int getQuestao(){
        return questao;
    }

    public int getNumTentativas(){
        return numTentativas;
    }

    public boolean getSituacao(){
        return situacao;
    }
}
