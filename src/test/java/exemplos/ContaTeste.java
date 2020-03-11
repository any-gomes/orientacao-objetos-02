package exemplos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta c1, c2;

    @BeforeEach //tudo que estiver aqui, vai rodar antes de cada método
    public void beforeEach() {
        c1 = new Conta();
        c1.setNumero(1);
        c1.depositar(1000.0);

        c2 = new Conta();
        c2.setNumero(2);
        c2.depositar(100.0);
    }

    @AfterEach //depois de cada teste
    public void afterEach() {
        c1 = null; //zerar a variável
    }



    @Test
    public void criarObjetoConta() {
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(c1.getNumero());
        assertNotNull(c1.getSaldo());
    }

    @Test
    public void metodoGetSaldo() {
        assertEquals(1000.0, c1.getSaldo());

    }

    @Test
    public void metodoDepositarValorValido() {
        //Depositar - teste
        c1.depositar(300.0);

        //Verificar saldo - verificação do teste
        assertEquals(3300.0, c1.getSaldo());

    }

    @Test
    public void metodoSacarValorValido() {
        c1.sacar(500.0);
        assertEquals(2500.0, c1.getSaldo());

    }

    @Test
    public void metodoTransferirValorValido() {
        c1.transferir(c2, 500.0);
        assertEquals(2500, c1.getSaldo());
        assertEquals(600, c2.getSaldo());
    }

    @Test
    public void metodoSetValorValido(){
        Conta conta = new Conta();
        conta.setNumero(9);
        assertEquals(9, conta.getNumero());
    }

    @Test
    public void metodoDepositarValorInvalido() {
        Conta conta = new Conta();
        conta.setNumero(-2); //lança exceção
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.setNumero(-2));
        assertEquals("Número deve ser maior que zero.", exception.getMessage()); //devolve esse valor de msg
    }



}
