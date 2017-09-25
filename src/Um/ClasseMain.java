package Um;

public class ClasseMain {
    public static void main(String[] args) {

        Empresa empresa = new Empresa(5);

        Funcionario f1 = new Funcionario();
        f1.setNome("Josmar");
        f1.setCpf("03954561182");
        f1.setSalario(1600);
        f1.setAumento(4.5);
        empresa.adicionaFuncionario(f1);

        Funcionario f2 = new Funcionario();
        f2.setNome("Dionicia");
        f2.setCpf("10238172123");
        f2.setSalario(1700);
        f2.setAumento(4.5);
        empresa.adicionaFuncionario(f2);

        Funcionario f3 = new Funcionario();
        f3.setNome("Ro");
        f3.setCpf("87398274");
        f3.setSalario(1200.00);
        f3.setAumento(4.5);
        empresa.adicionaFuncionario(f3);

        empresa.mostraArray();

    }

}
