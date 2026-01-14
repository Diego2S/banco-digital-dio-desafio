import entities.Cliente;
import entities.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1,2,new Cliente(),1000.0);
        Conta conta2 = new Conta(2,3,new Cliente(),0.0);
        conta.depositar(1000.0);
        conta.transferir(conta2,5000.0);



        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());



//        for (int i = 1; i <= 5; i++) {
//        }
    }
}