public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.02;
        double total = valor + taxa;
        if (total <= saldo) {
            saldo -= total;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}
