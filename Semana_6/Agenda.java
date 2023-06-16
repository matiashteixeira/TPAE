import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaContatos;


    public Agenda(){
        listaContatos = new ArrayList<>();
    }

    public void adiciona(String nome, String endereco, String email, String cpf, String estadoCivil){
        listaContatos.add(new PessoaFisica(nome, endereco, email, cpf, estadoCivil));
    }

    public void adiciona(String nome, String endereco, String email, String cnpj, int inscricaoEstadual){
        listaContatos.add(new PesssoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual));
    }

    private Contato buscarContato(String info){
        for (Contato contato : listaContatos){
            if(contato instanceof PessoaFisica){
                PessoaFisica pessoa = (PessoaFisica) contato;
                if(pessoa.getCpf().equals(info)){
                    return contato;
                }
            }else if(contato instanceof PesssoaJuridica){
                PesssoaJuridica pessoa = (PesssoaJuridica) contato;
                if(pessoa.getCnpj().equals(info)){
                    return contato;
                }
            }
        }
        return null;
    }

    public boolean removeContato(String info){
        if(buscarContato(info) != null){
            listaContatos.remove(buscarContato(info));
            return true;
        }
        return false;
    }


    public void imprimeContato(){
        for (Contato contato : listaContatos) {
            if(contato instanceof PessoaFisica){
                PessoaFisica pessoa = (PessoaFisica) contato;
                System.out.println(pessoa);
            }else{
                PesssoaJuridica pesssoa = (PesssoaJuridica) contato;
                System.out.println(pesssoa);
            }
        }
    }

    
    
}
