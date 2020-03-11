package exemplos;

public class Conta {
    private Integer numero;
    private Double saldo = 0.0;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) throws IllegalAccessException {
        if(numero <= 0){
            throw new IllegalAccessException("Número deve ser maior que zero.");
        }
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) {

        saldo += valor;
    }

    public void sacar(Double valor) {
        if(valor <= saldo){
            saldo -= valor;
        }
    }

    public void transferir(Conta conta, Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            conta.saldo = conta.saldo + valor;
        }
    }
}

