import java.util.Scanner;

/**
 * Menu
 */
public class Menu {
    private Scanner entrada;

    public Menu(){
        entrada = new Scanner(System.in);
    }

    public void executar(){
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(entrada.nextLine());
            escolherAcao(opcao);

        } while (opcao != 4);
    }

    private void exibirMenu(){
        System.out.printf("\n\n#### LOCADORA DE VEICULOS ####\n\n");
        System.out.println("1 - Gerar nota para veículo de passeio");
        System.out.println("2 - Gerar nota para veículo de carga");
        System.out.println("3 - Gerar nota para veículo de passageiros");
        System.out.println("4 - Sair");
    }

    private void escolherAcao(int opcao){
        switch (opcao) {
            case 1:
                calculaPasseio();
                break;
        
            case 2:
                calculaCarga();
                break;

            case 3:
                calculaPassageiro();
        }
    }
    
    private void calculaPasseio(){
        Locacao veiculo = new Locacao(new VeiPasseio());
        gerarNota(veiculo.calculaValorNota(lerDias(), lerDiaria()));
    }

    private void calculaCarga(){
        Locacao veiculo = new Locacao(new VeiCarga(lerCabine()));
        gerarNota(veiculo.calculaValorNota(lerDias(), lerDiaria()));
    }

    private void calculaPassageiro(){
        Locacao veiculo = new Locacao(new VeiPassageiros(lerCapacidade()));
        gerarNota(veiculo.calculaValorNota(lerDias(), lerDiaria()));
    }

    private int lerCapacidade(){
        System.out.print("Entre com a capacidade do veículo: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private int lerDias(){
        System.out.print("Entre com a quantidade de dias: ");
        return Integer.parseInt(entrada.nextLine());
    }

    private double lerDiaria(){
        System.out.print("Entre com o valor da diária: ");
        return Double.parseDouble(entrada.nextLine());
    }

    private boolean lerCabine(){
        System.out.print("Digite o tipo de cabine (simples ou dupla): ");
        return (entrada.nextLine().equals("simples")) ? true : false;
    }

    private void gerarNota(double valor){
        System.out.println("===================== Nota Fiscal =============================");
        System.out.printf("\n=  Valor a ser pago: R$%.2f                                  \n",valor);
        System.out.println("===============================================================");
    }
}