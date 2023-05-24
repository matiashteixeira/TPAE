import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Disciplina {
    private String codigo;
    private ArrayList<Aluno> listaAlunos;

    public Disciplina(String codigo){
        this.codigo = codigo;
        listaAlunos = new ArrayList<>();
    }

    public String getCodigo(){
        return codigo;
    }

    public List<Aluno> getListaAlunos(){
        return Collections.unmodifiableList(listaAlunos);
    }

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void ordenarDiario(){
        listaAlunos.sort(getComparador());
    }

    private Comparator<Aluno> getComparador(){
        Comparator<Aluno> comparador = new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2){
                return o2.getNota()-o1.getNota();
            }    
        };
        return comparador;
    } 
    
}
