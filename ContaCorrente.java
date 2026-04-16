public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 2.0;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }
}