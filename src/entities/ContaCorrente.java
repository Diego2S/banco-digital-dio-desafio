package entities;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(String agencia, Long numero, Cliente cliente, Double saldo) {
        super(agencia, numero, cliente, saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{}" + super.toString();
    }
}
