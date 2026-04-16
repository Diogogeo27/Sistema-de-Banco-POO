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

O sistema possui um **menu interativo no terminal**, permitindo:

1. Cadastrar cliente  
2. Criar conta corrente  
3. Criar conta poupança  
4. Depositar  
5. Sacar  
6. Transferir  
7. Consultar saldo  

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
- Miguel
Projeto desenvolvido para fins acadêmicos na disciplina de **Programação Orientada a Objetos**.
