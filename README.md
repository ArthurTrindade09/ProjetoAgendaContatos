# Gerenciador de Contatos

Este repositório guarda um projeto de aprendizado prático em Java, concebido para demonstrar em tempo real a transição e o amadurecimento dos conceitos de Programação Orientada a Objetos (POO). O software é construído passo a passo: cada nova entrega refina a arquitetura anterior, agregando estruturas de dados mais complexas e recursos modernos.

## Propósito

Desenvolver um sistema completo de gerenciamento de contatos. A jornada começa com um código estruturado rudimentar e avança progressivamente até se transformar em um ecossistema sólido com design orientado a objetos, persistência de arquivos e interface de usuário.

## Linha do Tempo de Desenvolvimento

| Lançamento | Mecanismo de Armazenamento / Recursos | Resumo da Fase |
| :--- | :--- | :--- |
| `v0.0.0` | Variáveis isoladas | Guarda apenas um único registro na memória temporária |
| `v0.1.0` | Vetores (Arrays) | Suporte a múltiplos registros com tamanho limite fixo |
| `v0.2.0` | Interfaces de Coleção (`List` + `ArrayList`) | Armazenamento flexível com dimensionamento automático |
| `v0.3.0` | Interfaces de Coleção (`List` + `ArrayList`) | Implementação da edição de cadastros existentes |
| `v1.0.0` | Interfaces de Coleção (`List` + `ArrayList`) | Divisão do código da classe mãe em subrotinas/métodos |
| `v1.1.0` | Interfaces de Coleção (`List` + `ArrayList`) | Desacoplamento de funções em pacotes/classes de suporte |
| `v1.1.1` | Interfaces de Coleção (`List` + `ArrayList`) | Resolução de falha no encerramento do programa |
| `v2.1.0` | Arquivos físicos (`.txt` via Java I/O) | Gravação permanente de dados em disco com `java.io` |
| `v3.0.0` | Classes e Instâncias | Primeiro contato com POO através da modelagem da classe `Contato` |
| `v3.1.0` | Vetor de Objetos | Migração do `List` para gerenciar instâncias de `Contato` |
| `v3.2.0` | Operações CRUD baseadas em Objetos | Alinhamento do fluxo de persistência e manipulação à coleção de objetos |

## Detalhamento das Iterações

### v0.0.0 — O Marco Zero
O ponto de partida do sistema. Aqui, os atributos de um contato ficam dispersos em variáveis primitivas locais.
* Captura e exibição de dados via terminal;
* Manipulação do fluxo com a ferramenta `Scanner`;
* Tomadas de decisão com blocos condicionais;
* Laços de repetição controlando o fluxo;
* Menu interativo para navegação do usuário;
* Capacidade limitada a um registro por execução.

### v0.1.0 — Estruturando com Vetores
Evolução para comportar múltiplos registros simultâneos no sistema através de arrays.
* Primeiros passos com arrays;
* Capacidade de salvar mais de uma pessoa;
* Localização de registros por índices numéricos;
* Limitação física pelo tamanho pré-definido do vetor;
* Varredura de tabelas usando loops.

### v0.2.0 — Dinamismo com List e ArrayList
Abandono dos vetores estáticos em prol de estruturas de dados dinâmicas da API do Java.
* Emprego da interface `List`;
* Adoção da implementação `ArrayList`;
* Conceituação e uso de Generics;
* Configuração de tipagem com `List<String>`;
* Inserção via método `add()`;
* Leitura de posições com `get()`;
* Exclusão de itens com `remove()`;
* Flexibilidade total de espaço em memória.

### v0.3.0 — Atualização de Registros
Acréscimo do recurso que possibilita modificar as informações de cadastros já salvos.
* Mecanismo de busca e varredura;
* Rastreamento do índice do elemento na lista;
* Substituição de registros usando `set()`;
* Amadurecimento das operações fundamentais do sistema;
* Tratamento direto de strings nas listas.

### v1.0.0 — Organização e Modularização
Fase focada em limpar o escopo principal, fragmentando o algoritmo em blocos menores de código.
* Aprendizado sobre modularização de sistemas;
* Desenvolvimento de funções customizadas;
* Transferência de dados via parâmetros de métodos;
* Isolamento de regras de negócio por contexto;
* Redução drástica do volume de linhas na função `main`;
* Melhor legibilidade do fluxo da agenda.

### v1.1.0 — Arquitetura Multiclasse
Avanço da modularização, distribuindo a lógica interna entre diferentes arquivos de código-fonte.
* Divisão do ecossistema em múltiplas classes;
* Descentralização das rotinas de gerenciamento;
* Criação do componente `Agenda`;
* Criação do componente utilitário `Uteis`;
* Alívio de responsabilidades do inicializador `Principal`;
* Código mais limpo, manutenível e escalável.

### v1.1.1 — Ajuste no Fluxo de Término
Entrega pontual voltada para estabilidade e correção de comportamento.
* Reparo no encerramento desencadeado pela opção "Sair";
* Alinhamento do ciclo de vida da aplicação;
* Preservação integral do design adotado na v1.1.0.

### v2.1.0 — Armazenamento em Disco (TXT)
Introdução do conceito de ciclo de vida persistente. Os dados agora sobrevivem ao fechamento do programa, sendo salvos em um arquivo físico.
* Aprendizado prático sobre persistência local;
* Implementação do módulo `Persistencia`;
* Manipulação de fluxos de leitura/escrita com o pacote `java.io`;
* Exportação de dados para mídia física;
* Importação automática de registros na inicialização;
* Sincronização automática dos dados ao encerrar a execução;
* Criação e uso do arquivo físico `contatos.txt`.

A formatação adotada no arquivo segue o padrão delimitado por ponto e vírgula:
```text
nome;celular;email
```

### v3.0.0 — Transição para o Paradigma de Objetos
Início da quebra de paradigma, migrando o estilo procedural para a **Programação Orientada a Objetos (POO)**. O modelo ganha a classe `Contato`, permitindo tratar cada pessoa como uma entidade única que encapsula seu próprio estado.
* Mudança de mentalidade para o ecossistema OO;
* Estudo comparativo: Procedural versus Orientado a Objetos;
* Abstração e mapeamento da entidade real `Contato`;
* Codificação da estrutura da classe `Contato`;
* Definição das propriedades `nome`, `celular` e `email`;
* Processo de instanciação de objetos na memória;
* Uso prático da palavra-chave `new`;
* Manipulação direta dos campos de uma instância;
* Geração de múltiplos elementos baseados na mesma planta (classe);
* Noções iniciais sobre identidade, referência e estado de objetos.

### v3.1.0 — Agrupamento de Objetos
Refinamento da coleção de dados para gerenciar diretamente as instâncias criadas, substituindo arrays primitivos. As estruturas `List` e `ArrayList` agora gerenciam instâncias de `Contato` em vez de apenas texto bruto.
* Reciclagem de conceitos: `List`, `ArrayList` e parâmetros parametrizados (Generics);
* Declaração da coleção especializada `List<Contato>`;
* Inserção de referências de objetos usando `add()`;
* Resgate de instâncias através de `get()`;
* Varredura da lista utilizando a sintaxe simplificada do `for-each`;
* Coleta de informações lendo as propriedades internas dos objetos guardados;
* Compreensão de ponteiros e referências dentro de coleções de dados;
* Substituição de listas paralelas independentes por um único agrupamento unificado;
* Tratamento de cada elemento como uma entidade rica e autossuficiente na lista.

### v3.2.0 — Operações Unificadas em POO
Ajuste final de todas as funcionalidades de manipulação para operar exclusivamente sobre a entidade `Contato`. As antigas três estruturas isoladas de texto (para nomes, telefones e e-mails) foram completamente eliminadas, dando lugar a uma única coleção do tipo `List<Contato>`.
* Repaginação do método de inserção;
* Repaginação da exibição geral de registros;
* Repaginação dos filtros de busca;
* Repaginação do fluxo de edição;
* Repaginação da rotina de deleção;
* Unificação do ecossistema em torno de `List<Contato>`;
* Geração de uma nova instância de `Contato` a cada inclusão efetuada;
* Uso generalizado de loops `for-each` para navegação;
* Consultas baseadas nos atributos internos de cada objeto;
* Alteração direta nos estados das instâncias localizadas;
* Localização e exclusão baseadas em referências de memória;
* Extinção definitiva das listas paralelas;
* Atualização do motor de persistência para ler e salvar a coleção `List<Contato>`;
* Recomposição e montagem dos objetos `Contato` durante o parsing do arquivo texto;
* Manutenção do layout de gravação original `nome;celular;email` no arquivo `contatos.txt`.

A espinha dorsal do programa agora adota:
```java
List<Contato> contatos = new ArrayList<>();
```

O ciclo de criação de um novo registro funciona da seguinte forma:
```java
Contato contato = new Contato();
contato.nome = nome;
contato.celular = celular;
contato.email = email;
contatos.add(contato);
```

As ações da interface interagem compartilhando este mesmo contêiner:
```java
Agenda.adicionar(sc, contatos);
Agenda.listar(contatos);
Agenda.pesquisar(sc, contatos);
Agenda.atualizar(sc, contatos);
Agenda.excluir(sc, contatos);
```

O ecossistema de arquivos também consome essa estrutura diretamente:
```java
Persistencia.carregarContatos(contatos);
Persistencia.salvarContatos(contatos);
```

## Desenho Arquitetural Atual

O esqueleto do projeto distribui as obrigações nas seguintes peças de software:
```text
Principal
│
└── List<Contato>
│
├── Agenda
│   ├── adicionar()
│   ├── listar()
│   ├── pesquisar()
│   ├── atualizar()
│   └── excluir()
│
└── Persistencia
    ├── carregarContatos()
    └── salvarContatos()
```

O modelo abaixo mapeia a estrutura de dados de cada pessoa cadastrada:
```java
public class Contato {
    public String nome;
    public String celular;
    public String email;
}
```

> **Nota de Design:** Os modificadores de acesso dos atributos foram mantidos como `public` de forma deliberada nesta etapa pedagógica. O conceito de restrição de acesso e encapsulamento será abordado na sequência do curso.

#### let's go gambling!

<img src="image-1.png" alt="apostas são monocromáticas" width="120" height="80" />

<img src="image-2.png" alt="benda" width="120" height="80" />

<img src="image-3.png" alt="lets go gambling" width="120" height="80" />

⬆️"Oh dang it!"⬆️
