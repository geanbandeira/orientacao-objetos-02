package exercicios;

public class Conta {
    private Integer numero;
    private Double saldo;
    private Double limite;

    public void depositar(Double valor) {
        saldo = saldo + valor;
        if (valor <= 0)
            throw new IllegalArgumentException("Valor deve ser positivo");
    }

    public void sacar(Double valor) {
        saldo = saldo - valor;

        if (valor <= 0)
            throw new IllegalArgumentException("Valor deve ser positivo");

        if (saldo < limite - limite)
            throw new IllegalArgumentException("Saldo menor que limite");
    }

    public void transferir(Conta conta, Double valor) {
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;

        if (valor <= 0)
            throw new IllegalArgumentException("Valor deve ser positivo");

        if (saldo < limite - limite)
            throw new IllegalArgumentException("Saldo menor que o limite");
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getLimite() {
        return limite;
    }

    public Integer getNumero() {
        return numero;
    }
}
