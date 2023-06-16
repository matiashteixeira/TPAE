import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulador {
    private Queue<Cliente> filaClientes;
    private ArrayList<Atendente> listaAtendentes;
    private int numAtendentes;
    private int duracaoSimulacao;

    public Simulador(int numAtendentes, int duracaoSimulacao){
        filaClientes = new LinkedList<Cliente>();
        listaAtendentes = new ArrayList<Atendente>();
        this.numAtendentes = numAtendentes;
        this.duracaoSimulacao = duracaoSimulacao;
    }

    private void criaFilaClientes(){
        Random e = new Random();
        int tempoChegada = e.nextInt(4);
        int duracaoAtendimento = e.nextInt(7)+1;

        while (tempoChegada + duracaoAtendimento <= duracaoSimulacao) {
            filaClientes.add(new Cliente(tempoChegada, duracaoAtendimento));
            duracaoAtendimento = e.nextInt(7)+1;
            tempoChegada += e.nextInt(4);
        }
    }

    private void criaListaAtendentes(){
        for (int i = 0; i < numAtendentes; i++) {
            listaAtendentes.add(new Atendente());
        }
    }

    public void simular(){
        criaFilaClientes();
        criaListaAtendentes();
        for (int i = 0; i < duracaoSimulacao; i++) {
            for (Atendente atendente : listaAtendentes) {
                if(atendente.estaDisponivel(i)){
                    if(filaClientes.size() > 0){
                        if(filaClientes.peek().getTempoChegada() <= i){
                            atendente.atenderCliente(filaClientes.poll().getDuracaoAtendimento(), i);
                        }
                    }
                }
            }
            System.out.printf("O tamanho da fila de clientes em %d é %d%n",i,filaClientes.size());
        }
    }


}



