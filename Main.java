import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar Cliente");
            System.out.println("2 - Criar Conta Corrente");
            System.out.println("3 - Criar Conta Poupança");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("6 - Transferir");
            System.out.println("7 - Consultar Saldo");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    banco.cadastrarCliente(nome, cpf);
                    System.out.println("Cliente cadastrado!");
                    break;

                case 2:
                    System.out.print("CPF do cliente: ");
                    String cpfCC = sc.next();
                    Cliente clienteCC = null;

                    for (Cliente c : banco.getClientes()) {
                        if (c.getCpf().equals(cpfCC)) {
                            clienteCC = c;
                        }
                    }

                    if (clienteCC != null) {
                        Conta cc = banco.criarContaCorrente(clienteCC);
                        System.out.println("Conta Corrente criada! Nº: " + cc.getNumero());
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("CPF do cliente: ");
                    String cpfCP = sc.next();
                    Cliente clienteCP = null;

                    for (Cliente c : banco.getClientes()) {
                        if (c.getCpf().equals(cpfCP)) {
                            clienteCP = c;
                        }
                    }

                    if (clienteCP != null) {
                        Conta cp = banco.criarContaPoupanca(clienteCP);
                        System.out.println("Conta Poupança criada! Nº: " + cp.getNumero());
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Número da conta: ");
                    int numDep = sc.nextInt();
                    Conta contaDep = banco.buscarConta(numDep);

                    if (contaDep != null) {
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        contaDep.depositar(valor);
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    int numSaq = sc.nextInt();
                    Conta contaSaq = banco.buscarConta(numSaq);

                    if (contaSaq != null) {
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();

                        if (contaSaq.sacar(valor)) {
                            System.out.println("Saque realizado!");
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 6:
                    System.out.print("Conta origem: ");
                    int origem = sc.nextInt();
                    System.out.print("Conta destino: ");
                    int destino = sc.nextInt();

                    Conta c1 = banco.buscarConta(origem);
                    Conta c2 = banco.buscarConta(destino);

                    if (c1 != null && c2 != null) {
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();

                        if (c1.transferir(c2, valor)) {
                            System.out.println("Transferência realizada!");
                        } else {
                            System.out.println("Erro na transferência!");
                        }
                    } else {
                        System.out.println("Conta inválida!");
                    }
                    break;

                case 7:
                    System.out.print("Número da conta: ");
                    int num = sc.nextInt();
                    Conta conta = banco.buscarConta(num);

                    if (conta != null) {
                        System.out.println("Saldo: " + conta.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}