import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1,2,
                new Cliente("11","23"),1000.0);

        ContaPoupanca conta2 = new ContaPoupanca(2,3,
                new Cliente("45","ss"),0.0);

        conta.depositar(1000.0);
        conta.transferir(conta2,5000.0);



        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());



//        for (int i = 1; i <= 5; i++) {
//        }
    }
}