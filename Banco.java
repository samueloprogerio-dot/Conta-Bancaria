package challenge1;

public class Banco {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000);

        ContaPoupanca cp = new ContaPoupanca(1000);

        System.out.println("=== SALDO INICIAL ===");

        System.out.println("Conta Corrente: " + cc.consultarSaldo());

        System.out.println("Conta Poupança: " + cp.consultarSaldo());

        System.out.println();

        cc.depositar(500);

        cp.depositar(500);

        System.out.println("=== APÓS DEPÓSITO ===");

        System.out.println("Conta Corrente: " + cc.consultarSaldo());

        System.out.println("Tipo: " + cc.getTipo());

        System.out.println();

        System.out.println("Conta Poupança: " + cp.consultarSaldo());

        System.out.println("Tipo: " + cp.getTipo());
    }
}