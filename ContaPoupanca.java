public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}