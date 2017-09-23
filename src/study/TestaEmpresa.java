package study;


import java.util.Scanner;

public class TestaEmpresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empresa empresa = new Empresa(5);


        Funcionario f1 = new Funcionario();
        System.out.println("Informe os dados do Funcionário: ");
        System.out.print("Informe o seu nome: ");
        f1.setNome(sc.next());
        System.out.print("Informe seu CPF: ");
        f1.setCpf(sc.next());
        System.out.print("Informe seu RG: ");
        f1.setRg(sc.nextLong());
        System.out.print("Informe o Salário: ");
        f1.setSalario(sc.nextDouble());
        System.out.print("Informe a idade: ");
        f1.setIdade(sc.nextInt());
        System.out.print("Informe o cargo: ");
        f1.setCargo(sc.next());
        empresa.adicionaEmpregado(f1);

        Funcionario f2 = new Funcionario();
        empresa.adicionaEmpregado(f2);

        empresa.mostraTodasAsInformacoes();

       }
}





