package challenge1;

public class ContaPoupanca extends ContaBancaria {

    private TipoConta tipo;

    public ContaPoupanca(double saldo) {
        super(saldo);
        this.tipo = TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {

        double valorFinal = valor - (valor * 0.01);

        saldo += valorFinal;
    }

    public TipoConta getTipo() {
        return tipo;
    }
}