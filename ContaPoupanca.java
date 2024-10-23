class ContaPoupanca extends ContaBancaria {
    
    //Criação de atributos da classe ContaPoupanca com o uso das respectivas taxas
    public static final double TAXA_SAQUE = 0.10;
    public static final double TAXA_DEPOSITO = 0.05;
    public static final double TAXA_CONSULTA = 0.02;

    // Construtor da classe ContaPoupança usando o saldo inicial
    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    //Criação do método sacar com o uso da taxa
    @Override
    public void sacar(double valor) {
        if (valor + TAXA_SAQUE > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= (valor + TAXA_SAQUE);
            System.out.println("Saque realizado com sucesso. Taxa de saque: " + TAXA_SAQUE);
        }
    }

    //Criação do método depositar com o uso da taxa de depósito
    @Override
    public void depositar(double valor) {
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso. Taxa de depósito: " + TAXA_DEPOSITO);
    }

    //Criação do método consultar saldo com o uso da taxa de consulta
    @Override
    public void consultarSaldo() {
        saldo -= TAXA_CONSULTA;
        System.out.println("Saldo atual: " + saldo + ". Taxa de consulta: " + TAXA_CONSULTA);
    }
}
