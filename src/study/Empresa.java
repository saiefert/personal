package study;

public class Empresa {
    Funcionario[] empregado;
    private String nome;
    private String cnpj;
    private int init = 0;

    public Empresa(int qtdEmpregados){
        this.empregado = new Funcionario[qtdEmpregados];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void adicionaEmpregado(Funcionario f) {
        this.empregado[this.init] = f;
        this.init++;
    }

   public Funcionario getFuncionario(int posicao){
        return this.empregado[posicao];
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
            if (empregado[i] == null) continue;
            System.out.println("Empregado na posição " + i + ": ");
            this.empregado[i].imprime();
        }
    }
}
