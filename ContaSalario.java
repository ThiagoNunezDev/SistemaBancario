public class ContaSalario extends ContaCorrente {
    private int saquesGratuitos;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratuitos = 1;
    }

    @Override
    public void sacar(double valor) {
        if (saquesGratuitos > 0) {
            super.sacar(valor);
            saquesGratuitos--;
        } else {
            super.sacar(valor + 5);
        }
    }

    public void novoMes() {
        saquesGratuitos = 1;
    }
}
