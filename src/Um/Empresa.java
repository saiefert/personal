package Um;

public class Empresa {
    Funcionario[] empregados;
    private String nome;
    private String cnpj;
    int increment = 0;

    public Empresa(int quantidadeFuncionarios) {

        this.empregados = new Funcionario[quantidadeFuncionarios];
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        empregados[increment] = funcionario;
        increment++;
    }

    public void mostraArray() {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) continue;
            empregados[i].mostra();
        }
    }

}

