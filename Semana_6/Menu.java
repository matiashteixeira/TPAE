import java.util.Scanner;

public class Menu {
    private Scanner entrada;
    private Agenda agenda;

    public Menu(){
        entrada = new Scanner(System.in);
        agenda = new Agenda();
    }


    public void executar(){
        exibirMenu();
        System.out.println("Digite uma opção:");
        int opcao = Integer.parseInt(entrada.nextLine());

        while(opcao != 5){
            escolheOpcao(opcao);
            exibirMenu();
            System.out.println("Digite uma opção:");
            opcao = Integer.parseInt(entrada.nextLine());
            
        }
        entrada.close();

    }

    private void exibirMenu(){
        System.out.printf("%n%n=======Menu de Opções=======%n");
        System.out.println("1 - Cadastrar uma pessoa física");
        System.out.println("2 - Cadastrar uma pessoa jurídica");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Imprimir dados da agenda");
        System.out.println("5 - Sair");
    }

    private void escolheOpcao(int opcao){
        switch (opcao) {
            case 1:
                cadastraFisica();
                break;
        
            case 2:
                cadastraJuridica();
                break;

            case 3:
                removeContato();
                break;

            case 4:
                agenda.imprimeContato();
                break;
        }
    }

    private void removeContato(){
        System.out.print("Digite o CPF ou CNPJ que deseja remover: ");
        if(agenda.removeContato(entrada.nextLine())){
            System.out.println("Contato removido com sucesso!");
        }else{
            System.out.println("Contato não existe na agenda!");
        }
    }

    private void cadastraFisica(){
        agenda.adiciona(setNome(), setEndereco(), setEmail(), setCpf(), setEstadoCivil());
    }

    private void cadastraJuridica(){
        agenda.adiciona(setNome(), setEndereco(), setEmail(), setCnpj(), setInscricaoEstadual());
    }

    private String setNome(){
        System.out.print("Digite o nome do contato: ");
        return entrada.nextLine();
    }

    private String setEndereco(){
        System.out.print("Digite o endereco do contato: ");
        return entrada.nextLine();
    }

    private String setEmail(){
        System.out.print("Digite o email do contato: ");
        return entrada.nextLine();
    }

    private String setCpf(){
        System.out.print("Digite o CPF do contato: ");
        return entrada.nextLine();
    }

    private String setEstadoCivil(){
        System.out.print("Digite o estado civil do contato: ");
        return entrada.nextLine();
    }

    private String setCnpj(){
        System.out.print("Digite o CNPJ do contato: ");
        return entrada.nextLine();
    }

    private String setInscricaoEstadual(){
        System.out.print("Digite a Inscrição Estadual do contato: ");
        return entrada.nextLine();
    }

}
