import entities.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("123");

        banco.cadastrarCliente("Charlinho","123.456.789-01");
        banco.cadastrarCliente("Jucelito","456.123.987-02");

        Cliente[] clientes = banco.getClientes().toArray(new Cliente[0]);

        banco.criarContaCorrente(clientes[0]);
        banco.criarContaPoupanca(clientes[1]);

        List<ContaCorrente> ccs = banco.getContaCorrentes();
        List<ContaPoupanca> cps = banco.getContaPoupancas();

        for(ContaCorrente c: ccs){
            System.out.println(c);
        }
        for(ContaPoupanca c: cps){
            System.out.println(c);
        }





    }
}