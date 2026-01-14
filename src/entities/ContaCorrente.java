package entities;

public class ContaCorrente {
    private Integer agencia;
    private Integer numero;
    private Cliente cliente;
    private Double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(Integer agencia, Integer numero, Cliente cliente, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(Double valor){
        try {
            if (valor>this.saldo){
                throw new IllegalArgumentException("Saldo insuficiente");
            }
            this.saldo -= valor;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }
}
