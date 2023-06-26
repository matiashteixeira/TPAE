public class ForcasArmadas extends Beneficiario implements ContribuinteINSS {
    private double ultimoSalario;
    
    public ForcasArmadas(String cpf, String nome,double ultimoSalario){
        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public double contribuicaoINSS(){
        return ultimoSalario*0.11;
    }

    @Override
    public double calcularAposentadoria(){
        return ultimoSalario*0.9;
    }

    @Override
    public String toString(){
        return String.format("%s \nContribuição INSS: %.2f",super.toString(),contribuicaoINSS());    
    }
}
