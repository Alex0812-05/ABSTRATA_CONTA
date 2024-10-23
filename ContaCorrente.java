class ContaCorrente extends ContaBancaria {
   
    //Criando atributos de taxa para a classe ContaCorrente
    public static final double TAXA_SAQUE = 0.20;
    public static final double TAXA_DEPOSITO = 0.10;
    public static final double TAXA_CONSULTA = 0.05;
    public double limite;

    // Construção da classe conta corrente, utilizando os atributos saldo inicial e limite
    public ContaCorrente(double saldoInicial, double limite) {
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    //Implementando o método sacar com taxa
    @Override
    public void sacar(double valor) {
        if (valor + TAXA_SAQUE > saldo + limite) {
            System.out.println("Saldo insuficiente, mesmo com limite.");
        } else {
            saldo -= (valor + TAXA_SAQUE);
            System.out.println("Saque realizado com sucesso. Taxa de saque: " + TAXA_SAQUE);
        }
    }

    //Implementando o método deposito com a taxa
    @Override
    public void depositar(double valor) {
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso. Taxa de depósito: " + TAXA_DEPOSITO);
    }

    //Implementando o método consultar saldo com taxa
    @Override
    public void consultarSaldo() {
        saldo -= TAXA_CONSULTA;
        System.out.println("Saldo atual: " + saldo + ". Taxa de consulta: " + TAXA_CONSULTA);
    }
}
