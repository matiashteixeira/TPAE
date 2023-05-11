import java.util.Random;

public class Questao {

    private String enunciado;
    private int gabarito;
    private int idQuestao;
    private static int contId;


    public Questao(){
        Random numero = new Random();

        int num1 = numero.nextInt(10); 
        int num2 = numero.nextInt(10); 

        gabarito = num1*num2;
        enunciado = "Quanto e " + num1 + " * " + num2 + " ?";

        contId++;
        idQuestao = contId;
    }

    public String getEnunciado(){
        return enunciado;
    }

    public boolean verificaResposta(int resposta){
        if(resposta == gabarito){
            return true;
        }
        
        return false;
    }

    public int getId(){
        return idQuestao;
    }

}
