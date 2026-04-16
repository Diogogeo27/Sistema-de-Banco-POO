# 🏦 Sistema Bancário (POO em Java)

Projeto desenvolvido para simular operações bancárias essenciais, aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

---

## 🎯 Objetivos

- Simular um ambiente bancário real  
- Aplicar conceitos de POO:
  - Herança  
  - Abstração  
  - Polimorfismo  
  - Encapsulamento  
- Garantir código organizado, modular e reutilizável  
- Facilitar a expansão futura do sistema  

---

## ⚙️ Funcionalidades

### 👤 Gestão de Clientes
- Cadastro de usuários

### 💳 Contas Bancárias
- Criação de Conta Corrente  
- Criação de Conta Poupança  

### 💰 Operações Financeiras
- Depósito de valores  
- Saque com validação de saldo  
- Transferência entre contas  

### 📊 Consultas
- Verificação de saldo  

### 📜 Histórico (conceito modelado)
- Registro de transações (estrutura prevista para expansão)

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos (POO)

---

## 🧱 Estrutura do Sistema (UML)

O sistema foi modelado com as seguintes entidades principais:

### 👤 Cliente
Representa o usuário do sistema.

**Atributos:**
- nome  
- cpf  

---

### 💳 Conta (Classe Base)
Base para os tipos de conta, contendo a lógica principal.

**Atributos:**
- número  
- saldo  
- cliente  

**Métodos:**
- depositar()  
- sacar()  
- transferir()  
- getSaldo()  

---

### 💰 ContaCorrente
Especialização de Conta.

- Sobrescreve o método `sacar()` (polimorfismo)  
- Pode aplicar taxa no saque  

---

### 🏦 ContaPoupanca
Especialização de Conta.

- Implementa comportamento próprio de saque  

---

### 🏛️ Banco
Responsável por gerenciar o sistema.

- Cadastro de clientes  
- Criação de contas  
- Busca de contas  

---

## 🔗 Relacionamentos

- Um **Cliente** pode possuir várias **Contas**  
- Cada **Conta** pertence a um único **Cliente**  
- **ContaCorrente** e **ContaPoupanca** herdam de **Conta**  

---

## ▶️ Execução do Sistema

O sistema possui um menu interativo no terminal que permite ao usuário realizar operações bancárias de forma simples e sequencial.

### 🧭 Fluxo Geral de Uso

Ao iniciar o programa, o usuário deve seguir a ordem lógica abaixo para utilizar corretamente o sistema:

---

### 1️⃣ Cadastrar Cliente

Antes de qualquer operação, é necessário cadastrar um cliente.

**Passos:**
- Selecionar a opção `1`
- Informar:
  - Nome
  - CPF

**Resultado:**
- Cliente é armazenado no sistema

---

### 2️⃣ Criar Conta Bancária

Após cadastrar o cliente, é possível criar uma conta.

#### 💳 Conta Corrente
- Selecionar a opção `2`
- Informar o CPF do cliente já cadastrado

#### 🏦 Conta Poupança
- Selecionar a opção `3`
- Informar o CPF do cliente já cadastrado

**Resultado:**
- Conta criada com número único
- Associada ao cliente

---

### 3️⃣ Realizar Depósito

Para adicionar saldo à conta:

**Passos:**
- Selecionar a opção `4`
- Informar:
  - Número da conta (ex: 1, 2, 3...)
  - Valor do depósito (ex: 1000 ou 1000.50)

**Observação:**
- O valor deve ser numérico
- Utilizar ponto (.) para casas decimais

---

### 4️⃣ Realizar Saque

Para retirar dinheiro da conta:

**Passos:**
- Selecionar a opção `5`
- Informar:
  - Número da conta
  - Valor do saque

**Validação:**
- O sistema verifica se há saldo suficiente

**Resultado:**
- Saque realizado ou mensagem de erro

---

### 5️⃣ Transferência entre Contas

Permite enviar dinheiro de uma conta para outra.

**Passos:**
- Selecionar a opção `6`
- Informar:
  - Conta de origem
  - Conta de destino
  - Valor da transferência

**Validação:**
- Verifica saldo da conta de origem

---

### 6️⃣ Consultar Saldo

Permite visualizar o saldo atual da conta.

**Passos:**
- Selecionar a opção `7`
- Informar o número da conta

**Resultado:**
- Exibição do saldo atual

---

### ⚠️ Regras Importantes

- O número da conta deve ser um valor inteiro (ex: 1, 2, 3)
- Valores monetários devem usar ponto (.) como separador decimal
- Não utilizar vírgula (,) para valores
- O cliente deve ser cadastrado antes de criar contas

---

### 🔄 Encerramento

- Para sair do sistema, selecionar a opção `0`

---

## 🚀 Possíveis Melhorias Futuras

- Implementar histórico completo de transações  
- Adicionar autenticação de usuário  
- Interface gráfica  
- Persistência de dados (banco de dados)  

---

## 👨‍💻 Autor

- Diogo Geovanni
- Dayvson Henrique
- Miguel Reis
  
Projeto desenvolvido para fins acadêmicos na disciplina de **Programação Orientada a Objetos**.
