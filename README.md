# Agenda de Contatos

Projeto didático desenvolvido em Java para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos.

O sistema é desenvolvido de forma incremental. Cada versão introduz novos conceitos, estruturas e melhorias sobre a versão anterior.

## Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo gradualmente para uma aplicação organizada com conceitos de Programação Orientada a Objetos, interface gráfica e persistência de dados.

## Evolução do projeto

| Versão | Armazenamento | Descrição |
|---|---|---|
| v0.0.0 | Variáveis simples | Permite armazenar apenas um contato |
| v0.1.0 | Arrays | Permite vários contatos com capacidade fixa |
| v0.2.0 | List + ArrayList | Permite vários contatos com tamanho dinâmico |
| v0.3.0 | List + ArrayList | Adiciona a opção de alteração de contatos cadastrados |

### v0.0.0 — Programação Procedural Básica

Primeira versão da Agenda.

Principais características:

- uma única classe `Principal`;
- todo o código dentro do método `main()`;
- armazenamento de apenas um contato;
- variáveis `nome`, `celular` e `email`;
- menu em console;
- uso de `Scanner`;
- uso de `if-else`;
- uso de `switch-case`;
- uso de `while`;
- funcionalidades:
  - adicionar contato;
  - listar contato;
  - procurar contato;
  - excluir contato;
  - sair.

Nesta versão, um novo contato substitui o contato armazenado anteriormente.

### v0.1.0 — Arrays e Capacidade Fixa

Segunda versão da Agenda.

Principais características:

- uso de arrays simples (`String[]`) para cada atributo;
- controle de capacidade máxima pré-definida;
- manipulação através de índices e estrutura `for`;
- busca sequencial nos arrays;
- remoção de elementos com reorganização física do array (deslocamento de itens).

### v0.2.0 — Armazenamento Dinâmico com ArrayList

Terceira versão da Agenda.

Principais características:

- uso da API de Coleções do Java (`List` e `ArrayList`);
- uso de Generics (`<String>`);
- alocação e redimensionamento dinâmico;
- métodos da API (`add`, `get`, `remove`, `size`, `indexOf`, etc.);
- iteração com `for-each`;
- simplificação das operações de inserção, busca e remoção.

### v0.3.0

Nesta versão, a Agenda de Contatos recebeu a implementação da funcionalidade de **alteração de contatos**.

### Principais características e conceitos

- Nova opção no menu: **Alterar contato**
- Busca do contato a ser alterado
- Atualização dos dados nas listas (`List` / `ArrayList`) utilizando o método `set()`
- Reutilização da lógica de validação/busca para localização do registro antes da modificação

## V1.0.0 - Modularização das funcionalidades

Nesta versão, o projeto Agenda de Contatos foi reorganizado por meio da criação de métodos.

### Principais alterações

- Modularização do código procedural.
- Criação do método `adicionar()`.
- Criação do método `listar()`.
- Criação do método `pesquisar()`.
- Criação do método `atualizar()`.
- Criação do método `excluir()`.
- Simplificação do `switch-case`.
- Uso de parâmetros para compartilhar os dados entre os métodos.
- Organização das responsabilidades do método `main()`.

### Armazenamento

Os contatos continuam sendo armazenados em três listas do tipo `List<String>`:

- nomes;
- celulares;
- e-mails.

### Conceitos trabalhados

- métodos;
- parâmetros;
- argumentos;
- retorno;
- `void`;
- escopo de variáveis;
- modularização;
- refatoração.

> A versão v1.0.0 mantém as funcionalidades da v0.3.0, alterando principalmente a organização interna do código.

## Versão atual
 **V.1.1.0 - Modularização das funcionalidades em arquivos separados (Uteis e Agenda)**

  **V.1.1.1 - Modularização das funcionalidades em arquivos separados (Uteis e Agenda e Correção de Bug)**

### Próximas versões

O projeto continuará evoluindo.
<!-- - `v0.1.0` — armazenamento com Arrays; -->
<!-- - `v0.2.0` — armazenamento com List e ArrayList; -->
<!-- - `v0.3.0` — funcionalidade de alterar contato; -->
- `v1.0.0` - Modularização das funcionalidades
- `v1.1.0` - Modularização das funcionalidades em arquivos separados
- `v1.1.1` - Modularização das funcionalidades em arquivos separados (correção de bug no SAIR)

## Controle de versões

As versões estáveis do projeto são identificadas por tags Git.

Exemplo:

```text
- V0
  - V0.0.0
  - V0.1.0
  - V0.2.0
  - V0.3.0
- V1
  - V1.0.0
  - V1.1.0