package study;

class Funcionario {
    String nome;
    int cpf1, cpf2, cpf3, cpf4;
    long rg;
    String cargo;
    int idade;
    double salario;

    void cpf(int um, int dois, int tres, int quatro){
        this.cpf1 = um;
        this.cpf2 = dois;
        this.cpf3 = tres;
        this.cpf4 = quatro;
    }

    void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf1 + "." + this.cpf2 + "." + this.cpf3 + "-" + this.cpf4);
        System.out.println("Rg: " + this.rg);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: " + this.salario);
    }


}

class Empresa{
    Funcionario[] colaboradores;
    String nome;
    String cnpj;
    int vazio = 0;

    void adicionar(Funcionario f){
        this.colaboradores[this.vazio] = f;
        this.vazio++;
    }

    void mostraEmpregados(){
        for(int i = 0; i < this.colaboradores.length; i++){

            System.out.print("\nFuncionario da Posição: " + i);
            System.out.print("\nR$:  " + this.colaboradores[i].salario);
            if(this.colaboradores == null) continue;

        }
    }
}

public class TestaEmpresa {
    public static void main(String[] args) {

        Empresa google = new Empresa();
        google.colaboradores = new Funcionario[5];

        Funcionario f1 = new Funcionario();
        f1.nome = "Josmar";
        f1.salario = 1600.00;
        f1.idade = 25;
        f1.rg = 123456;
        f1.cargo = "Auxiliar de TI";
        f1.cpf(39,545,611,82);
        google.adicionar(f1);
        google.colaboradores[0].imprime();

        Funcionario f2 = new Funcionario();
        f2.nome = "Saiefert";
        f2.salario = 2300.00;
        google.adicionar(f2);
        google.colaboradores[1].imprime();


        google.mostraEmpregados();
    }
}



