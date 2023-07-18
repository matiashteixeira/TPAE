public class VeiCarga implements CalculaLocacao{
    private boolean cabine;

    public VeiCarga(boolean cabine){
        this.cabine = cabine;
    }

    @Override
    public double calculaNota(int numDias, double valorDiaria){
        return (cabine) ? 1.2*valorDiaria*numDias : 1.5*valorDiaria*numDias;
    }
}
