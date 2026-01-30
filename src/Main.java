import entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("123");
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        System.out.println("Cadastre-se");
        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("CPF: ");
        String cpf = sc.next();

        banco.cadastrarCliente(nome, cpf);
        banco.cadastrarCliente("Charlinho", "123.456.789-01");
        banco.cadastrarCliente("Jucelito", "456.123.987-02");

        Cliente acesso = banco.getClientes().get(0);

        while (loop) {

            System.out.println("\nBem-vindo, " + acesso.getNome());
            System.out.println("===== MENU =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Extrato");
            System.out.println("4 - Transferência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Poupança");
                    int tipoDeposito = sc.nextInt();

                    System.out.print("Valor: ");
                    double valorDep = sc.nextDouble();

                    if (tipoDeposito == 1) {
                        acesso.getContaCorrente().depositar(valorDep);
                    } else if (tipoDeposito == 2) {
                        acesso.getContaPoupanca().depositar(valorDep);
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 2:
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Poupança");
                    int tipoSaque = sc.nextInt();

                    System.out.print("Valor: ");
                    double valorSaq = sc.nextDouble();

                    if (tipoSaque == 1) {
                        acesso.getContaCorrente().sacar(valorSaq);
                    } else if (tipoSaque == 2) {
                        acesso.getContaPoupanca().sacar(valorSaq);
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 3:
                    System.out.println("=== EXTRATO ===");
                    System.out.println(acesso.getContaCorrente());
                    System.out.println(acesso.getContaPoupanca());
                    break;

                case 4:
                    System.out.println("=== TRANSFERÊNCIA ===");

                    int i = 1;
                    for (Cliente c : banco.getClientes()) {
                        System.out.println(i + " - " + c.getNome());
                        i++;
                    }

                    System.out.print("Cliente destino: ");
                    int clienteDestino = sc.nextInt();

                    Cliente destino = banco.getClientes().get(clienteDestino - 1);

                    System.out.println("Conta de origem:");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Poupança");
                    int tipoConta = sc.nextInt();

                    System.out.print("Valor: ");
                    double valorTransf = sc.nextDouble();

                    if (tipoConta == 1) {
                        acesso.getContaCorrente()
                                .transferir(destino.getContaCorrente(), valorTransf);
                    } else if (tipoConta == 2) {
                        acesso.getContaPoupanca()
                                .transferir(destino.getContaPoupanca(), valorTransf);
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 0:
                    loop = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
