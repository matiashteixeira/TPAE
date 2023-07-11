package Semana_9;

public abstract class Salario {
    private final double SALARIO_MINIMO = 1000;

    public final double calcularSalarioLiquido(double salarioBruto){
        return salarioBruto - calcularDescINSS(salarioBruto) - calcularDescIRRF(salarioBruto) - calcularDescVT(salarioBruto) - calcularDescPs(salarioBruto);
    }

    private double calcularDescINSS(double salarioBruto){
        double descINSS = 0;
        if(salarioBruto == SALARIO_MINIMO)
            descINSS = salarioBruto * 0.07;
        else if(salarioBruto < 2 * SALARIO_MINIMO)
            descINSS = salarioBruto * 0.1;
        else if(salarioBruto < 3 * SALARIO_MINIMO)
            descINSS = salarioBruto * 0.12;
        else if(salarioBruto < 4 * SALARIO_MINIMO)
            descINSS = salarioBruto * 0.14;
        else
            descINSS = salarioBruto * 0.2;
        return descINSS;
    }

    private double calcularDescIRRF(double salarioBruto){
        double descIRRF = 0;
        if(salarioBruto == SALARIO_MINIMO)
            descIRRF = 0;
        else if(salarioBruto < 2 * SALARIO_MINIMO)
            descIRRF = salarioBruto * 0.075;
        else if(salarioBruto < 3 * SALARIO_MINIMO)
            descIRRF = salarioBruto * 0.15;
        else if(salarioBruto < 4 * SALARIO_MINIMO)
            descIRRF = salarioBruto * 0.225;
        else
            descIRRF = salarioBruto * 0.275;
        return descIRRF;
    }

    protected abstract double calcularDescVT(double salarioBruto);

    protected abstract double calcularDescPs(double salarioBruto);
}


