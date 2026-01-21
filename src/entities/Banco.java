package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    //simulator
    private static Long idContaCorrente = 1L;
    private static Long idContaPoupanca = 1L;

    protected String agencia;
    protected List<Cliente> clientes;
    protected List<ContaCorrente> contaCorrentes;
    protected List<ContaPoupanca> contaPoupancas;

    public Banco(String agencia) {
        this.agencia = agencia;
        this.clientes = new ArrayList<>();
        this.contaCorrentes = new ArrayList<>();
        this.contaPoupancas = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String cpf){
        Cliente novoCliente = new Cliente(cpf, nome);
        clientes.add(novoCliente);

    }

    public void criarContaCorrente(Cliente cliente){
        ContaCorrente contaCorrente = new ContaCorrente(this.agencia,this.idContaCorrente,cliente,0.0);
        this.contaCorrentes.add(contaCorrente);
        this.idContaCorrente++;
    }

    public void criarContaPoupanca(Cliente cliente){
        ContaPoupanca contaPoupanca = new ContaPoupanca(this.agencia,this.idContaPoupanca,cliente,0.0);
        this.contaPoupancas.add(contaPoupanca);
        this.idContaPoupanca++;
    }

    public String getAgencia() {
        return agencia;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<ContaCorrente> getContaCorrentes() {
        return contaCorrentes;
    }

    public List<ContaPoupanca> getContaPoupancas() {
        return contaPoupancas;
    }
}
