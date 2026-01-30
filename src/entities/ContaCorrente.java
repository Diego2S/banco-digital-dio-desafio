package entities;

public class ContaCorrente extends Conta {


    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente, Double saldo) {
        super( cliente, saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{}" + super.toString();
    }
}
