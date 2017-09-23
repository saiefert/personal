package study;


public class Funcionario {
    private String nome;
    private String cpf;
    private long rg;
    private String cargo;
    private int idade;
    private int codigo;
    private double salario;

    private static int identificador = 1;

    public Funcionario(){
        this.codigo = identificador;
        this.identificador++;
    }

    public int getIdentificador(){
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public long getRg() {
        return this.rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    void imprime() {
        System.out.println("\nCódigo do funcionário: " + getIdentificador());
        System.out.println("Nome: " + this.nome);
        if (this.cpf == null) {
            System.out.println("Cpf não informado");
        } else {
            System.out.println("CPF: " + this.cpf);
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
