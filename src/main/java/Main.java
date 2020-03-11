import exemplos.Conta;
import exemplos.Quadrado;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1;
        c1.saldo = 1000.0;

        Conta c2 = new Conta();
        c2.numero = 2;
        c2.saldo = 2500.0;

        c1.depositar(300.0);
        System.out.println(c1.saldo);


    }
}
