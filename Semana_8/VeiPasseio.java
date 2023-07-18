public class VeiPasseio implements CalculaLocacao {

    @Override
    public double calculaNota(int numDias, double valorDiaria){
        return numDias*valorDiaria;
    }
}
