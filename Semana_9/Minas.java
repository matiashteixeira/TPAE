package Semana_9;

public class Minas extends Salario{
    @Override
    public double calcularDescPs(double salarioBruto){
        return 0.02*salarioBruto;
    }

    @Override
    public double calcularDescVT(double salarioBruto){
        return 0.06*salarioBruto;
    }
}
