package entities;

public abstract class Conta {
    private String agencia;
    private Long numero;
    private Cliente cliente;
    private Double saldo;

    public Conta() {
    }

    public Conta(String agencia, Long numero, Cliente cliente, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
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

    public String getAgencia() {
        return agencia;
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
}
