package Semana_9;

public class App {
    public static void main(String[] args) {
        Salario minas = new Minas();
        Salario rio = new Rio();

        System.out.print("Minas: ");
        System.out.println(minas.calcularSalarioLiquido(3000));
        System.out.print("Rio: ");
        System.out.println(rio.calcularSalarioLiquido(3000));
    }
}
