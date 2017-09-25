package Dois;

public class contaCorrente extends Conta {

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
}
