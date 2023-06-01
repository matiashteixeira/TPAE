import java.util.HashMap;
import java.util.Scanner;


public class Sig {
    private HashMap<String,Disciplina> disciplinas;
    private Scanner entrada;

    public Sig(){
        entrada = new Scanner(System.in);
        disciplinas = new HashMap<>();
    }

    private void limparTerminal() {
        // Verifica se o sistema operacional é Windows
        boolean windows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        try {
            if (windows) {
                // Se for Windows, utiliza o comando "cls" para limpar o terminal
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Se for outro sistema operacional, utiliza o comando "clear" para limpar o
                // terminal
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void executar(){
        int opcao;
        
        exibirMenu();
        opcao = Integer.parseInt(entrada.nextLine());

        while(opcao != 5){
            executarOpcao(opcao);
            exibirMenu();
            opcao = Integer.parseInt(entrada.nextLine());
        }
        entrada.close();
    }

    private void exibirMenu(){
        System.out.printf("%n### MENU ###%n");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Mostrar código das disciplinas cadastradas");
        System.out.println("5. Sair");
        System.out.println("Escolha uma opcao:");
    }

    private void cadastrarDisciplina(){
        System.out.println("Digite o código da disciplina: ");
        String codigo = entrada.nextLine();
        if(!disciplinaCadastrada(codigo)){
            disciplinas.put(codigo,new Disciplina(codigo));
            System.out.println("Disciplina cadastrada com sucesso!");
        } else
            System.out.println("Disciplina ja casdastrada!");
        limparTerminal();
    }

    private boolean disciplinaCadastrada(String codigo){
        Disciplina disciplina;
        disciplina = disciplinas.get(codigo);
        
        if(disciplina != null) return true;

        return false;
    }

    private void cadastrarAluno(){
        Disciplina disciplina = buscarDisciplina(lerCodigo());

        if(disciplina != null){
            System.out.println("Digite o nome do aluno: ");
            String nome = entrada.nextLine();
            System.out.println("Digite a nota do aluno: ");
            int nota = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite a quantidade de faltas do aluno: ");
            int faltas = Integer.parseInt(entrada.nextLine());
            disciplina.adicionarAluno(new Aluno(nome, nota, faltas));
            limparTerminal();
        } else
            System.out.println("Disciplina não cadastrada");
        
    }

    private void exibirDiario(){
        Disciplina disciplina = buscarDisciplina(lerCodigo());

        if(disciplina != null){
            disciplina.ordenarDiario();

            System.out.printf("%-10s %-12s %-8s %-10s %n","Nome","Nota","Faltas","Situacao");

            for (Aluno a : disciplina.getListaAlunos())
                System.out.printf("%-10s %-12s %-8s %-10s %n",a.getNome(),a.getNota(),a.getFaltas(),a.getSituacao());
        } else
            System.out.println("Disciplina não cadastrada!");
            
    }

    private void exibirDisciplinas(){
        System.out.println("As disciplinas cadastradas são:");
    
        for (String codigo : disciplinas.keySet()) 
            System.out.print(codigo + " ");
        
            System.out.println();
    }

    private Disciplina buscarDisciplina(String codigo){
        return disciplinas.get(codigo);
    }

    private String lerCodigo(){
        System.out.println("Digite o código da disciplina: ");
        return entrada.nextLine();
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
            
            case 4:
                exibirDisciplinas();
            break;
        }
    }   
}

