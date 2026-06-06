package challenge1;

public abstract class ContaBancaria implements Conta {

    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public abstract void depositar(double valor);
}