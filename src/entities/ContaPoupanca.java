package entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(  Cliente cliente, Double saldo) {
        super(cliente, saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{}"+ super.toString();
    }
}
