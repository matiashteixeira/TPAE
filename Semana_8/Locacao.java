public class Locacao {
    private CalculaLocacao veiculo;

    public Locacao(CalculaLocacao veiculo){
        this.veiculo = veiculo;
    }

    public double calculaValorNota(int numDias, double valorDiaria){
        return veiculo.calculaNota(numDias,valorDiaria);
    }
}
