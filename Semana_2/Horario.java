package Semana_2;
import java.util.Scanner;

public class Horario {
    int hora, minuto, segundo;

    Horario(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    Horario(int segundo){
        minuto = segundo/60;
        this.segundo = segundo%60;
        hora = minuto/60;
        minuto = hora%60;
    }

    void exibir(){
        Scanner entrada = new Scanner(System.in);

        System.out.printf("%n%02dh:%02dm:%02ds %n", hora,minuto,segundo);

        entrada.close();
    }
}
