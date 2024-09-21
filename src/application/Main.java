package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.aplicarJuros();
        poupanca.aplicarJuros();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
