package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {


    protected String agencia;
    protected List<Cliente> clientes;


    public Banco(String agencia) {
        this.agencia = agencia;
        this.clientes = new ArrayList<>();

    }

    public void cadastrarCliente(String nome, String cpf){
        Cliente novoCliente = new Cliente(cpf, nome);
        clientes.add(novoCliente);
    }


    public String getAgencia() {
        return agencia;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }



}
