public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001", "João", 1000, 500);
        cc.sacar(1500);
        cc.exibirInformacoes();

        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 2000);
        cp.sacar(2500);
        cp.exibirInformacoes();

        ContaInvestimento ci = new ContaInvestimento("003", "Carlos", 3000);
        ci.sacar(1000);
        ci.exibirInformacoes();

        ContaSalario cs = new ContaSalario("004", "Ana", 500, 1000);
        cs.sacar(600);
        cs.sacar(100);
        cs.exibirInformacoes();

        ContaInvestimentoAltoRisco cvar = new ContaInvestimentoAltoRisco("005", "Pedro", 15000);
        cvar.sacar(5000);
        cvar.exibirInformacoes();
        cvar.sacar(100);
    }
}
