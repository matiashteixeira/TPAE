import java.util.Scanner;

public class Prova {
    private Questao[] questao;
    private Correcao[] correcao;

    public Prova(){
        questao = new Questao[5];
        for (int i = 0; i < questao.length; i++) {
            questao[i] = new Questao();
        }
        correcao = new Correcao[5];
    }

    public void aplicar(){
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < questao.length; i++) {

            int cont = 1;
        
            System.out.printf("%nQuestao %d: ", questao[i].getId());
            System.out.printf("%n%s ", questao[i].getEnunciado());
            int resposta = entrada.nextInt();

            while(cont <= 1 && !questao[i].verificaResposta(resposta)){
                System.out.println("Voce ganhou mais uma chance! Digite outra resposta para a questao:");
                resposta = entrada.nextInt();
                cont++;
            }
            
            if(!questao[i].verificaResposta(resposta)){
                System.out.printf("%nVocê tentou 2 vezes e errou a questão.%n");
            }else {
                System.out.printf("%nVocê tentou %d vez(es) e acertou a questão.%n",cont);
            } 
            correcao[i] = new Correcao(questao[i].getId(), questao[i].verificaResposta(resposta), cont);
        }

        entrada.close();
    }

    public void gerarRelatorio(){
        System.out.print("Questao  Situacao  Numero de tentativas");
        String status;  
        for (int i = 0; i < correcao.length; i++) {
            if(correcao[i].getSituacao()){
                status = "acertou";
            }else{
                status = "errou";
            }
            System.out.printf("%n%7d %8s %6d",correcao[i].getQuestao(),status,correcao[i].getNumTentativas());
        }
    }
}
