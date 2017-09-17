package study;

class Funcionario {
    String nome;
    String cpf;
    int idade;
    int dia, mes, ano;
    double salario;

    void data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
        System.out.println("\n");
    }

    void aumentoSalarial(double aumento) {
        this.salario = this.salario + (this.salario * aumento / 100);
    }
}

public class fodao {

    public static void main(String[] args) {



        Funcionario josmar = new Funcionario();
        josmar.nome = "Josmar Saiefert";
        josmar.cpf = "03954561182";
        josmar.idade = 25;
        josmar.salario = 1600.00;
        josmar.data(17, 9, 2017);
        josmar.aumentoSalarial(4.5);

        josmar.mostrar();

        Funcionario dionizia = new Funcionario();
        dionizia.nome = "Dionizia Romeiro";
        dionizia.cpf = "9999999";
        dionizia.idade = 37;
        dionizia.salario = 1700.00;
        dionizia.data(17, 9, 2017);
        dionizia.aumentoSalarial(4.5);


    }

}
