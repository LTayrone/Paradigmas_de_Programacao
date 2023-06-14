public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) throws Exception {
        // Implementação específica de ContaPoupanca
        if (this.saldo < valor) {
            throw new Exception("Saldo insuficiente na conta poupança para saque.");
        } else {
            this.saldo -= valor;
        }
    }
}

public class ContaSalario extends Conta {
    public ContaSalario(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) throws Exception {
        // Implementação específica de ContaSalario
        if (this.saldo < valor) {
            throw new Exception("Saldo insuficiente na conta salário para saque.");
        } else {
            this.saldo -= valor;
        }
    }
}
