import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Beneficiario> listaBeneficiarios;

    public FolhaPagamento(){
        listaBeneficiarios = new ArrayList<>();
    }

    public void cadastrarBeneficiario(Beneficiario ben){
        listaBeneficiarios.add(ben);
    }

    public void gerarFolhaPagamento(){
        for (Beneficiario beneficiario : listaBeneficiarios) {
            System.out.println(beneficiario);
        }
    }
}
