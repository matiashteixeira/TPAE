import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd;
        String frase;

        qtd = entrada.nextInt();
        entrada.nextLine();
        frase = entrada.nextLine();

        String[] frases = frase.split(" ");

        
        entrada.close();
    }
}
