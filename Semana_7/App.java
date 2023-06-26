public class App {
    public static void main(String[] args) {
    FolhaPagamento fp = new FolhaPagamento();
    Beneficiario ben;
    //Cadastro de beneficiários
    ben = new IniciativaPrivada("123.456.789-0","Tamara",90);
    fp.cadastrarBeneficiario(ben);
    ben = new ServicoPublico("987.654.321-0","Chico",12000.0);
    fp.cadastrarBeneficiario(ben);
    ben = new ForcasArmadas("234.567.890-1","Bento",15000.0);
    fp.cadastrarBeneficiario(ben);
    ben = new ForcasArmadas("126.838.716-1","Mateus",500.0);
    fp.cadastrarBeneficiario(ben);
    ben = new ForcasArmadas("456.784.810-30","Maria",5000.0);
    fp.cadastrarBeneficiario(ben);
    ben = new ForcasArmadas("254.267.220-41","Duda",2000.0);
    fp.cadastrarBeneficiario(ben);
    //Geração da folha de pagamentos
    fp.gerarFolhaPagamento();
    }
    }