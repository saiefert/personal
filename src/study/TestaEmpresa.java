package study;

import javax.xml.crypto.Data;

public class Funcionario {
    private String nome;
    private int cpf1, cpf2, cpf3, cpf4;
    private long rg;
    private String cargo;
    private int idade;
    private Data dataEntrada;
    private double salario;

    void cpf(int um, int dois, int tres, int quatro) {
        this.cpf1 = um;
        this.cpf2 = dois;
        this.cpf3 = tres;
        this.cpf4 = quatro;
    }

    void imprime() {
        System.out.println("Nome: " + this.nome);
        if (this.cpf1 == 0 && this.cpf2 == 0 && this.cpf2 == 0 && this.cpf4 == 0) {
            System.out.println("Cpf não informado");
        } else {
            System.out.println("CPF: " + this.cpf1 + "." + this.cpf2 + "." + this.cpf3 + "-" + this.cpf4);
        }
        if (this.rg == 0) {
            System.out.println("Rg não informado");
        } else {
            System.out.println("Rg: " + this.rg);
        }
        if (this.cargo == null) {
            System.out.println("Cargo não informado");
        } else {
            System.out.println("Cargo: " + this.cargo);
        }
        if (this.idade == 0) {
            System.out.println("Idade não informada");
        } else {
            System.out.println("Idade: " + this.idade);
        }
        if (this.salario == 0) {
            System.out.println("Salário não informado");
        } else {

            System.out.println("Salário: " + this.salario);
        }
        System.out.println("\n");
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(){
        this.salario = salario;
    }

}

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
            System.out.println(empregado[i].salario);
        }
    }

    void mostraTodasAsInformacoes() {
        for (int i = 0; i < this.init; i++) {
            if (empregado[i] == null) continue;
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
        f1.nome = "Josmar";
        f1.setSalario() = 1600.00;
        f1.idade = 25;
        f1.rg = 123456;
        f1.cargo = "Auxiliar de TI";
        f1.cpf(39, 545, 611, 82);
        empresa.adicionaEmpregado(f1);

        Funcionario f2 = new Funcionario();
        f2.nome = "Saiefert";
        f2.salario = 2300.00;
        empresa.adicionaEmpregado(f2);

        empresa.mostraTodasAsInformacoes();


    }
}




