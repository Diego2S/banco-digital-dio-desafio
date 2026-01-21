package entities;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    public ContaPoupanca(String agencia, Long numero, Cliente cliente, Double saldo) {
        super(agencia, numero, cliente, saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{}"+ super.toString();
    }
}
