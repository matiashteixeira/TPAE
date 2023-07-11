public abstract class Beneficiario {
    protected String nome;
    protected String cpf;

    public Beneficiario(String cpf, String nome){
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularAposentadoria();

    public String toString(){
        return String.format("\n\nNome: %s\nCpf: %s\nAposentadoria: %.2f",nome,cpf,calcularAposentadoria());
    }
}
