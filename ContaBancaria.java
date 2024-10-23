    abstract class ContaBancaria {
        
        //Atributo para a classe ContaBancaria
        public double saldo;

        // Métodos para os atributos saque, deposito e cunsultor de saldo
        public abstract void sacar(double valor);
        public abstract void depositar(double valor);
        public abstract void consultarSaldo();
    }

    