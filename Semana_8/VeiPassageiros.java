public class VeiPassageiros implements CalculaLocacao {
    private int capacidade;

    public VeiPassageiros(int capacidade){
        this.capacidade = capacidade;
    }

    @Override
    public double calculaNota(int numDias, double valorDiaria){
        return valorDiaria*numDias*((1+capacidade)/100.0);
    }
}
