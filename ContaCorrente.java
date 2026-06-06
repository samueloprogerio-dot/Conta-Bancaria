package challenge1;

public class ContaCorrente extends ContaBancaria {

    private TipoConta tipo;

    public ContaCorrente(double saldo) {
        super(saldo);
        this.tipo = TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public TipoConta getTipo() {
        return tipo;
    }
}