package study;

class Empresa {
    Funcionario[] empregado;
    String nome;
    String cnpj;
    int init = 0;

    void adicionaEmpregado(Funcionario f) {
        this.empregado[this.init] = f;
        this.init++;
    }

    void mostraEmpregados() {
        for (int i = 0; i < empregado.length; i++) {
            if (empregado[i] == null) continue;
            System.out.print("Empregado na posição " + i + ": ");
            System.out.println(empregado[i].getSalario());
        }
    }

    void mostraTodasAsInformacoes() {
        for (int i = 0; i < this.init; i++) {
            if(empregado[i] == null)continue;
            System.out.println("Empregado na posição " + i + ": ");
            this.empregado[i].imprime();
        }
    }
}

public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.empregado = new Funcionario[10];


        Funcionario f1 = new Funcionario();
        f1.setNome("Josmar");
        f1.setSalario(1600.00);
        f1.setIdade(25);
        f1.setRg(11233545);
        f1.setCargo("Auxiliar de TI");
        f1.cpf(39, 545, 611, 82);
        empresa.adicionaEmpregado(f1);

        Funcionario f2 = new Funcionario();
        f2.setNome("Jorge");
        f2.setSalario(4200.00);
        empresa.adicionaEmpregado(f2);

        empresa.mostraTodasAsInformacoes();


    }
}




