public class PesssoaJuridica extends Contato{
    private String cnpj;
    private int inscricaoEstadual;

    public PesssoaJuridica(String nome, String endereco, String email, String cnpj, int inscricaoEstadual){
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj(){
        return cnpj;
    }

    @Override
    public String toString(){
        return "\nNome:" + nome + " Endereço:" + endereco + " Email:" + email + " CNPJ:" + cnpj + " Inscrição Estadual:" + inscricaoEstadual; 
    }
    
}
