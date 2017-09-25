package Dois;

public class Conta {

    protected double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valorDeposita) {
        this.saldo += valorDeposita;
    }

    public void saca(double valorSacado) {
        this.saldo -= valorSacado;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }

    void mostra(){
        System.out.println(getSaldo());
    }

}


