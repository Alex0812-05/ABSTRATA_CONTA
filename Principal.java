public class Principal {
    public static void main(String[] args) {
    
        //Criação do objeto instanciado pela classe Principal
        ContaBancaria contaPoupanca = new ContaPoupanca(1000);  
        ContaBancaria contaCorrente = new ContaCorrente(1000, 600);  

        //Imprimindo as operações com o uso do System.out.println
        System.out.println("Operações na Conta Poupança:");
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(500);
        contaPoupanca.sacar(100);

        //Imprimindo as operaçõs da conta corrente com os valores dados
        System.out.println("\nOperações na Conta Corrente:");
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
    }
}