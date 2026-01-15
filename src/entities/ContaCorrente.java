package entities;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(String agencia, Long numero, Cliente cliente, Double saldo) {
        super(agencia, numero, cliente, saldo);
    }
}
