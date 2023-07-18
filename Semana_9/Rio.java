package Semana_9;

public class Rio extends Salario{
    @Override
    public double calcularDescPs(double salarioBruto){
        return 0.05*salarioBruto;
    }

    @Override
    public double calcularDescVT(double salarioBruto){
        return 0.08*salarioBruto;
    }
}
