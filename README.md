🏦 Sistema Bancário (Aplicativo Banco)
Projeto desenvolvido para simular operações bancárias essenciais, focando na aplicação de conceitos fundamentais de Programação Orientada a Objetos (POO).

🎯 Objetivos
Simular um ambiente bancário real.
Aplicar conceitos de POO (Herança, Abstração, Polimorfismo e Encapsulamento).
Garantir código organizado, modular e reutilizável.
Facilitar a expansão futura do sistema.

✨ Funcionalidades
Gestão de Clientes: Cadastro completo de usuários.
Contas: Criação de Contas Corrente e Poupança.
Operações Financeiras: Depósito, saque (com validação) e transferências.
Consultas: Verificação de saldo e histórico detalhado de transações.
Investimento: Aplicação de rendimento automático para contas poupança.

🛠️ Tecnologias Utilizadas
Linguagem: Java
Paradigma: Programação Orientada a Objetos (POO)

🏗️ Estrutura do Sistema (UML)
O sistema foi modelado com as seguintes entidades principais:

👤 Classe: Cliente
Representa o usuário e detentor das contas.
Atributos: nome, cpf, senha.
Métodos: autenticar().

💳 Classe: Conta (Abstrata)
Base para os tipos de conta, contendo a lógica central de movimentação.
Atributos: numero, saldo, cliente.
Métodos: depositar(), sacar(), transferir(), consultarSaldo().

📑 Especializações de Conta
ContaCorrente: Inclui atributo de limite e sobrescreve o método de saque.
ContaPoupanca: Inclui taxaRendimento e o método aplicarRendimento().

📜 Histórico e Transações
Transacao: Registra tipo, valor e data de cada operação.
Historico: Armazena e lista a coleção de transações de uma conta.

🔗 Relacionamentos
Um Cliente pode possuir várias Contas.
Cada Conta possui um Histórico exclusivo.
Um Histórico contém várias Transações.
ContaCorrente e ContaPoupanca herdam de Conta.