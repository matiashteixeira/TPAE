import java.util.Scanner;

public class Sig {
    private Disciplina d1;

    public Sig(){}

    public void executar(){
        int opcao;
        Scanner entrada = new Scanner(System.in);
        exibirMenu();
        opcao = entrada.nextInt();

        while(opcao != 4){
            executarOpcao(opcao);
            exibirMenu();
            opcao = entrada.nextInt();
        }
        entrada.close();
    }

    private void exibirMenu(){
        System.out.printf("%n### MENU ###%n");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opcao:");
    }

    private void cadastrarDisciplina(){
        System.out.println("Digite o código da disciplina: ");
        Scanner entrada = new Scanner(System.in);
        d1 = new Disciplina(entrada.nextLine());
    }

    private void cadastrarAluno(){
        System.out.println("Digite o nome do aluno: ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        System.out.println("Digite a nota do aluno: ");
        int nota = entrada.nextInt();
        System.out.println("Digite a quantidade de faltas do aluno: ");
        int faltas = entrada.nextInt();

        Aluno aluno = new Aluno(nome, nota, faltas);
        d1.adicionarAluno(aluno);
    }

    private void exibirDiario(){
        d1.ordenarDiario();

        System.out.printf("%-10s %-12s %-8s %-10s %n","Nome","Nota","Faltas","Situacao");

        for (Aluno a : d1.getListaAlunos()){
            System.out.printf("%-10s %-12s %-8s %-10s %n",a.getNome(),a.getNota(),a.getFaltas(),a.getSituacao());
        }
    }

    private void executarOpcao(int opcao){
        switch (opcao){
            case 1:
                cadastrarDisciplina();
                break;

            case 2:
                cadastrarAluno();
                break;
            
            case 3:
                exibirDiario();
                break;
        }
    }   
}