package org.example;
public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Não é possível realizar o saque. \n Valor maior do que o Saldo disponível!");
        }
    }

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

}
