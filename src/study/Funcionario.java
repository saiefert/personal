package study;

public class Funcionario {
    private String nome;
    int cpf1, cpf2, cpf3, cpf4;
    private long rg;
    private String cargo;
    private int idade;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getRg() {
        return rg;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public Double getSalario(){
        return salario;
    }

    public void cpf(int um, int dois, int tres, int quatro) {
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
            System.out.println("Rg: " + getRg());
        }
        if (this.cargo == null) {
            System.out.println("Cargo não informado");
        } else {
            System.out.println("Cargo: " + getCargo());
        }
        if (this.idade == 0) {
            System.out.println("Idade não informada");
        } else {
            System.out.println("Idade: " + getIdade());
        }
        if (this.salario == 0) {
            System.out.println("Salário não informado");
        } else {

            System.out.println("Salário: " + getSalario());
        }
        System.out.println("\n");
    }
}
