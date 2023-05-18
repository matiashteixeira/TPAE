public class Aluno {
    private String nome;
    private int nota;
    private int faltas;

    public Aluno(String nome,int nota, int faltas){
        this.nome = nome;
        this.nota = nota;
        this.faltas = faltas;
    }

    public String getNome(){
        return nome;
    }
    
    public int getNota(){
        return nota;
    }

    public int getFaltas(){
        return faltas;
    }

    public String getSituacao(){
        if(nota < 60 || faltas >= 19)
            return "Reprovado";

        return "Aprovado";
    }
}
