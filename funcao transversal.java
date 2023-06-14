aspect VerificacaoSaldoAspect {
    pointcut chamadaSaque(Conta conta, double valor): execution(* Conta.sacar(double)) && target(conta) && args(valor);

    before(Conta conta, double valor): chamadaSaque(conta, valor) {
        if(conta.getSaldo() < valor) {
            // Você pode usar um Logger aqui para gerar um log de erro
            System.out.println("Saldo insuficiente na conta para sacar " + valor);
        }
    }
}
