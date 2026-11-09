# 📇 Agenda de Contatos

**Aplicação em Java focada no gerenciamento de contatos, desenvolvida de forma incremental para consolidar os conceitos da disciplina de Programação Orientada a Objetos (POO).** 

O projeto evolui gradativamente, partindo de estruturas de dados básicas até alcançar boas práticas de arquitetura, padrões de projeto, persistência de dados e interfaces.

> **Versão Atual:** `V4.1.0` — DAO Orientado a Objetos  
> **Próxima Evolução:** `V5.0.0` — Introdução ao padrão MVC  

---

## 🎯 Objetivo

Construir um sistema completo de CRUD (Create, Read, Update, Delete) para contatos, aplicando na prática a evolução dos conceitos de POO, separação de responsabilidades e persistência em arquivos.

---

## 🚀 Funcionalidades

- **Gerenciamento Completo (CRUD):** Cadastrar, listar, pesquisar, atualizar e remover contatos.
- **Persistência Automática:** Salva a lista em um arquivo de texto (`contatos.txt`) e recupera os dados de forma transparente ao iniciar o sistema.
- **Tratamento de Falhas:** Tratamento de exceções estruturado para garantir que erros de gravação não quebrem a execução do programa.
- **Sobre o Sistema:** Tela informativa com detalhes do software.

### 📝 Estrutura de um Contato
Cada registro armazena estritamente:
* `Nome`
* `Celular`
* `E-mail`

---

## 🛠️ Tecnologias e Conceitos

### Stack Técnica
* **Linguagem:** Java
* **Coleções:** Collections Framework (`List` e `ArrayList`)
* **Versionamento:** Git & GitHub

### Conceitos de POO Aplicados (V4.1.0)
* Encapsulamento e modificadores de acesso
* Construtores e a palavra-chave `this`
* Métodos de instância vs. Métodos estáticos
* Separação de responsabilidades e padrão DAO (Data Access Object)
* Manipulação de arquivos e Streams de I/O

---

## 📂 Arquitetura do Projeto

O código está organizado em camadas dentro do diretório `src/br/edu/`:

```text
AgendaContatos/
├── src/
│   └── br/edu/
│       ├── principal/   # Inicialização do sistema (Principal.java)
│       ├── modelo/      # Classe de domínio (Contato.java)
│       ├── servico/     # Regras de negócio e operações (Agenda.java)
│       ├── dao/         # Persistência de dados (ContatoDAO.java)
│       └── uteis/       # Funções auxiliares (Uteis.java)
├── contatos.txt         # Base de dados (gerada automaticamente)
└── README.md
```

### 🧩 Divisão de Responsabilidades

| Classe | Camada / Papel | Responsabilidade Principal |
| :--- | :--- | :--- |
| `Principal` | Controle / Visão | Coordena o fluxo do menu e execução do programa. |
| `Contato` | Modelo (`Domain`) | Modela a entidade de contato e seus atributos. |
| `Agenda` | Serviço (`Business`) | Centraliza as regras de negócio e a lógica do CRUD. |
| `ContatoDAO`| Dados (`Data/DAO`) | Gerencia a leitura e escrita no arquivo físico. |
| `Uteis` | Utilitários | Fornece funções de suporte reutilizáveis. |

---

## 💾 Detalhes da Versão Atual (`V4.1.0`)

A principal evolução desta versão foi a **refatoração do padrão DAO**. Os métodos de persistência deixaram de ser estáticos e passaram a ser métodos de instância, exigindo a criação de um objeto via construtor.

### Mudanças Chave:
* Criação do atributo privado `caminhoArquivo` no DAO.
* O arquivo de destino agora é definido dinamicamente no construtor da classe.
* O método `salvarContatos()` passou a retornar um `boolean`, permitindo melhor controle de sucesso da operação.
* Refinamento do método `toString()` da classe `Contato` para exibição limpa no terminal.

### Exemplo Prático de Uso:
```java
// Inicialização da lista e do mecanismo de persistência
List<Contato> contatos = new ArrayList<>();
ContatoDAO dao = new ContatoDAO("contatos.txt");

// Carregamento inicial de dados
dao.carregarContatos(contatos);

// Persistência com feedback de sucesso
boolean sucesso = dao.salvarContatos(contatos);
```

### Formato do Banco de Dados (`contatos.txt`)
Os dados utilizam o ponto e vírgula (`;`) como delimitador:
```text
Maria;85999999999;maria@email.com
João;85988888888;joao@email.com
```

---

## ⏳ Histórico de Evolução

<details>
<summary>Clique para expandir o histórico de versões</summary>

| Versão | Fase | Principais Implementações |
| :---: | :--- | :--- |
| **V0.0.0** | Estrutural | Variáveis simples e cadastro de um único contato. |
| **V0.1.0** | Estrutural | Uso de arrays estáticos para múltiplos contatos. |
| **V0.2.0** | Estrutural | Migração para as coleções dinâmicas `List` e `ArrayList`. |
| **V0.3.0** | Estrutural | Implementação das operações básicas do CRUD. |
| **V1.0.0** | Modular | Organização do código estruturado em métodos. |
| **V1.1.x** | Modular | Divisão em classes e correções no fluxo de saída do menu. |
| **V2.x.x** | Arquivos | Introdução à manipulação e escrita de arquivos TXT. |
| **V3.0.0** | POO | Transição do paradigma estruturado para Classes e Objetos. |
| **V3.1.0** | POO | Tipagem da lista para objetos: `ArrayList<Contato>`. |
| **V3.2.x** | POO | Adaptação do CRUD para operar diretamente com objetos e encapsulamento. |
| **V4.0.0** | Arquitetura | Divisão estruturada em pacotes e introdução do padrão DAO (estático). |
| **V4.1.0** | Atual | DAO totalmente orientado a objetos (métodos de instância e construtores). |

</details>

---

## 🔧 Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** (versão 8 ou superior) instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos de código.
3. Abra a pasta raiz do projeto na sua IDE de preferência (Eclipse, IntelliJ, VS Code, NetBeans).
4. Navegue até o arquivo `src/br/edu/principal/Principal.java`.
5. Execute o método `main`.
6. Interaja com o sistema através do menu interativo no console/terminal.
