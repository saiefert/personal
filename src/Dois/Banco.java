package Dois;

class atualizadorDeContas{
    private double saldoTotal = 0;
    private double selic;

    public void AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public void roda(Conta c){
        
    }
}

public class Banco {

    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new contaCorrente();
        Conta cp = new contaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println("Conta: " + c.getSaldo());
        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta poupança: " + cp.getSaldo());

    }
}
