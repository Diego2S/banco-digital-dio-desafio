import entities.Cliente;
import entities.ContaCorrente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1,2,new Cliente(),100.0);
        conta.sacar(107.0);

        System.out.print(conta.getSaldo());

//        for (int i = 1; i <= 5; i++) {
//        }
    }
}