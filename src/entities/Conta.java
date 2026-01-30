package entities;

public abstract class Conta {

    private static Long numero = 1L;
    private Cliente cliente;
    private Double saldo;

    public Conta() {
    }

    public Conta(Cliente cliente, Double saldo) {
        this.numero += 1L;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Long getNumero() {
        return numero;
    }

    public void sacar(Double valor){
        if (valor>this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void transferir(Conta conta,Double valor){
        try {
            this.sacar(valor);
            conta.depositar(valor);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
