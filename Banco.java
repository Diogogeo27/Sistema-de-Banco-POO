import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Conta> contas = new ArrayList<>();
    private int numeroConta = 1;

    // ✅ MÉTODO QUE FALTAVA
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente cadastrarCliente(String nome, String cpf) {
        Cliente c = new Cliente(nome, cpf);
        clientes.add(c);
        return c;
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta c = new ContaCorrente(numeroConta++, cliente);
        contas.add(c);
        return c;
    }

    public Conta criarContaPoupanca(Cliente cliente) {
        Conta c = new ContaPoupanca(numeroConta++, cliente);
        contas.add(c);
        return c;
    }

    public Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }
}
