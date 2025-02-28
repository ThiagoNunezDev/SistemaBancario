public class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double SALDO_MINIMO = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo < SALDO_MINIMO) {
            System.out.println("Saldo mínimo para saque não atingido (R$ 10.000,00).");
            return;
        }

        double taxa = valor * 0.05;
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa de 5%.");
        }
    }
}
