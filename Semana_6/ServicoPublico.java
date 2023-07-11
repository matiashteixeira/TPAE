public class ServicoPublico extends Beneficiario implements ContribuinteINSS {
    private double mediaSalarial;
    
    public ServicoPublico(String cpf, String nome,double mediaSalarial){
        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public double contribuicaoINSS(){
        return mediaSalarial*0.14;
    }

    @Override
    public double calcularAposentadoria(){
        return mediaSalarial*0.8;
    }

    @Override
    public String toString(){
        return String.format("%s \nContribuição INSS: %.2f",super.toString(),contribuicaoINSS());
    }
}
