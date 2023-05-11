import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        float pedro, joao;
        int meses = 0;

        Scanner entrada = new Scanner(System.in);

        joao = entrada.nextFloat();
        pedro = entrada.nextFloat();


        while(pedro > joao){
            pedro = pedro*1.005f;
            joao = joao*1.025f;
            meses++;
        }
        System.out.printf("São necessarios %d meses para que o saldo de joão iguale ou ultrapasse o de Pedro", meses);

        entrada.close();
    }
}