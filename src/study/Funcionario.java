package study;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private double salario;
    public  static int incrementCodigo = 1;

    public Funcionario(){
        this.codigo = incrementCodigo;
        incrementCodigo++;
    }

    public void setAumento(double aumento){
        this.salario = salario + (salario * (aumento/100));
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void mostra(){
        System.out.println("Código: " + codigo + "\nNome: " + getNome() + "\nSalário: " + getSalario() + "\nCPF: " + getCpf() + "\n");
    }

}

