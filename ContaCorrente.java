public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteChequeEspecial;
        if (valor <= saldoDisponivel) {
            saldo -= valor;
        } else {
            System.out.println("Saldo e cheque especial insuficientes.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite Cheque Especial: R$ " + limiteChequeEspecial);
    }
}
