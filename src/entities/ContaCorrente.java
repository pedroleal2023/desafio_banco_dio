package entities;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public static final double TAXA_JUROS = 0.010;

    @Override
    public void aplicarJuros() {
        double juros = saldo * TAXA_JUROS;
        saldo += juros;
        System.out.println(String.format("Juros aplicados na Conta Corrente: %.2f", juros));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}

