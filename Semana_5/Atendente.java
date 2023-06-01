public class Atendente {
    private int tempoProximoAtendimento;

    public void atenderCliente(int duracaoAtendimento, int temposimulacao){
        tempoProximoAtendimento = duracaoAtendimento + temposimulacao;
    }

    public boolean estaDisponivel(int tempoSimulacao){
        return tempoProximoAtendimento <= tempoSimulacao;
    }
}
