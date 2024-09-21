package entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    private static final double TAXA_JUROS = 0.005;



    @Override
    public void aplicarJuros(){
        double juros = saldo * TAXA_JUROS;
        saldo += juros;
        System.out.println(String.format("Juros aplicados na Conta Poupança: %.2f", juros));
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
    }
}

