package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private Long conta;
    private double saldo;

    public ContaBancaria(Long conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
