# 🏦 Sistema Bancário (POO em Java)

Projeto desenvolvido para simular operações bancárias essenciais, aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)**, incluindo controle de acesso por senha para operações sensíveis.

---

## 🎯 Objetivos

- Simular um ambiente bancário real  
- Aplicar conceitos de POO:
  - Herança  
  - Abstração  
  - Polimorfismo  
  - Encapsulamento  
- Garantir código organizado, modular e reutilizável  
- Implementar validação de segurança nas operações  
- Facilitar a expansão futura do sistema  

---

## ⚙️ Funcionalidades

### 👤 Gestão de Clientes
- Cadastro de usuários com:
  - Nome  
  - CPF  
  - Senha  

---

### 💳 Contas Bancárias
- Criação de Conta Corrente  
- Criação de Conta Poupança  
- Associação entre cliente e conta  

---

### 💰 Operações Financeiras

#### Depósito
- Inserção de valores na conta

#### Saque 🔐
- Validação de saldo  
- Exige autenticação por senha  

#### Transferência 🔐
- Transferência entre contas  
- Exige autenticação da conta de origem  
- Validação de saldo  

---

### 📊 Consultas
- Verificação de saldo da conta  

---

### 🔐 Segurança Implementada
- Cada cliente possui uma senha  
- Operações sensíveis (saque e transferência) exigem autenticação  
- A validação é feita através de método encapsulado na classe Cliente  

---

### 📜 Histórico (conceito modelado)
- Estrutura preparada para registro de transações futuras  

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos (POO)

---

## 🧱 Estrutura do Sistema (UML)

O sistema foi modelado com as seguintes entidades principais:

---

### 👤 Cliente
Representa o usuário do sistema.

**Atributos:**
- nome  
- cpf  
- senha  

**Métodos:**
- autenticar(senha)  

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
- Aplica taxa no saque  

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

O sistema possui um menu interativo no terminal que permite ao usuário realizar operações bancárias de forma sequencial.

---

## 🧭 Fluxo Geral de Uso

### 1️⃣ Cadastrar Cliente
- Selecionar opção `1`  
- Informar:
  - Nome  
  - CPF  
  - Senha  

---

### 2️⃣ Criar Conta Bancária

#### Conta Corrente
- Opção `2`  
- Informar CPF  

#### Conta Poupança
- Opção `3`  
- Informar CPF  

---

### 3️⃣ Realizar Depósito
- Opção `4`  
- Informar:
  - Número da conta  
  - Valor  

---

### 4️⃣ Realizar Saque 🔐
- Opção `5`  
- Informar:
  - Número da conta  
  - Senha  
  - Valor  

---

### 5️⃣ Transferência 🔐
- Opção `6`  
- Informar:
  - Conta origem  
  - Conta destino  
  - Senha da conta origem  
  - Valor  

---

### 6️⃣ Consultar Saldo
- Opção `7`  
- Informar número da conta  

---

## ⚠️ Regras Importantes

- O número da conta deve ser inteiro (ex: 1, 2, 3)  
- Valores monetários usam ponto (.) como separador decimal  
- Não utilizar vírgula (,)  
- O cliente deve ser cadastrado antes de criar contas  
- Operações sensíveis exigem senha válida  

---

## 🔄 Encerramento

- Para sair do sistema, selecionar a opção `0`

---

## 🚀 Possíveis Melhorias Futuras

- Implementar histórico completo de transações  
- Sistema de login antes de acessar o menu  
- Bloqueio após múltiplas tentativas de senha  
- Interface gráfica  
- Persistência em banco de dados  

---

## 👨‍💻 Autor

- Diogo Geovanni  
- Dayvson Henrique  
- Miguel Reis  

Projeto desenvolvido para fins acadêmicos na disciplina de **Programação Orientada a Objetos**.
