import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int codigo, qtd, precoUnitario;
        float precoFinal, desconto;

        System.out.print("Digite o codigo do produto: ");
        codigo = entrada.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        qtd = entrada.nextInt();
        System.out.println();

        if(codigo <= 10)
            precoUnitario = 10;

        else if(codigo <= 20)
            precoUnitario = 15;

        else if(codigo <= 30)
            precoUnitario = 20;
        
        else
            precoUnitario = 30;

        precoFinal = precoUnitario*qtd;

        System.out.printf("Preco unitario: %d%nValor Bruto: %.2f %n", precoUnitario, precoFinal);

        if(precoFinal <= 250){
            desconto = precoFinal*0.05f;
            precoFinal -= desconto;
            System.out.printf("Desconto: %.2f %nValor final: %.2f", desconto, precoFinal);

        } else if(precoFinal <= 500){
            desconto = precoFinal*0.1f;
            precoFinal -= desconto;
            System.out.printf("Desconto: %.2f %nValor final: %.2f", desconto, precoFinal);
        }
        else{
            desconto = precoFinal*0.15f;
            precoFinal -= desconto;
            System.out.printf("Desconto: %.2f %nValor final: %.2f", desconto, precoFinal);
        }
        


        entrada.close();
    }


}