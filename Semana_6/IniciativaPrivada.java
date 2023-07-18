public class IniciativaPrivada extends Beneficiario {
    private int tempoAtiva;
    private static final double TETOINSS = 75.0749;

    public IniciativaPrivada(String cpf, String nome,int tempoAtiva){
        super(cpf, nome);
        this.tempoAtiva = tempoAtiva;
    }

    @Override
    public double calcularAposentadoria(){
        return tempoAtiva*TETOINSS;
    }
}
