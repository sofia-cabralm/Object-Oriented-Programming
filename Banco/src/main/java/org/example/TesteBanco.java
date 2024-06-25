package org.example;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Conta conta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Cliente: ");
        conta.cliente = scanner.next();
        System.out.println("Conta de");

        System.out.println("Sacando R$ 250,00");
        conta.sacar(250.00);

        System.out.println("Depositando R$ 320,50");
        conta.depositar(320.50);

        System.out.println("Sacando R$ 120");
        conta.sacar(120.00);

        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
    }
}