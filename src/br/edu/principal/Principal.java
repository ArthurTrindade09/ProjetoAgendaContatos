package br.edu.principal;

// pacotes importados
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	// função principal do programa java
    public static void main(String[] args) {

    	// Criar listas de Strings
        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();

        // Criar objeto sc do tipo Scanner para ler entrada
        Scanner sc = new Scanner(System.in);

        // Variável que determina se o programa deve ou não continuar
        boolean continuar = true;

        mostraInicializacao();
        
        // loop principal do programa
        while (continuar) {
        	int opcao = SelecionaOpcao(sc);
        	
        	// verificar cada caso da opção numérica do programa
            switch (opcao) {
                case 1-> adicionar(sc, nomes, celulares, emails);
                case 2-> listar(nomes, celulares, emails);
                case 3-> pesquisar(sc, nomes, celulares, emails);
                case 4-> atualizar(sc, nomes, celulares, emails);
                case 5-> excluir(sc, nomes, celulares, emails);
                case 6-> continuar = sair();
                default ->System.out.println("Opção inválida!");
            }
        }
        // fechar processo do objeto Scanner para memória ou seila
        sc.close();
    }
    
    // Mostra cabeçalho;
    public static void mostraInicializacao() {
        System.out.println("+========================+");
        System.out.println("|    AGENDA DE CONTATOS  |");
        System.out.println("|         v1.0.0         |");
        System.out.println("+========================+");
        System.out.println("        Bem-vindo!        ");
    }
    
    // Selecionar um valor numérico para opção
    public static int SelecionaOpcao(Scanner sc) {
    	System.out.println("--------------------------");
    	System.out.println("1 - Adicionar contato");
    	System.out.println("2 - Listar contatos");
    	System.out.println("3 - Procurar contato");
    	System.out.println("4 - Alterar contato");
    	System.out.println("5 - Excluir contato");
    	System.out.println("6 - Sair");
    	System.out.println("--------------------------\n");

    	System.out.print("Escolha uma opção:\n");
    	int opc = sc.nextInt();
    	sc.nextLine();
    	return opc;
    }
    
    // função adicionar contato
    public static void adicionar(Scanner sc, List<String> nomes,List<String> celulares,List<String> emails) {
        System.out.println("=== ADICIONAR CONTATO ===");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o celular: ");
        String celular = sc.nextLine();
        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        nomes.add(nome);
        celulares.add(celular);
        emails.add(email);

        System.out.println("Contato adicionado com sucesso!");
    }
    
    // função listar todos os contatos
    public static void listar(List<String> nomes, List<String> celulares, List<String> emails) {
        System.out.println("=== LISTAR CONTATOS ===");
        if (nomes.size() == 0) {
            System.out.println("Nenhum contato cadastrado!");

        } else {
            for (int i = 0; i < nomes.size(); i++) {

                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));
            }
        }
    }
    
    // função pesquisar contato específico
    public static void pesquisar(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
    	System.out.println("=== PROCURAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Celular: " + celulares.get(i));
                System.out.println("Email: " + emails.get(i));

                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }
    
    // função de atualizar informações de um contato
    public static void atualizar(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
    	System.out.println("=== ALTERAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeProcurado = sc.nextLine();

        int posicao = -1;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeProcurado)) {
                posicao = i;
            }
        }
        if (posicao != -1) {

            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            nomes.set(posicao, novoNome);
            celulares.set(posicao, novoCelular);
            emails.set(posicao, novoEmail);

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }
    
    // função de apagar um contato da lista
    public static void excluir(Scanner sc, List<String> nomes, List<String> celulares, List<String> emails) {
    	System.out.println("=== EXCLUIR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeExcluir = sc.nextLine();

        boolean excluido = false;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
                nomes.remove(i);
                celulares.remove(i);
                emails.remove(i);

                excluido = true;

                System.out.println("Contato excluído com sucesso!");
                break;
            }
        }
        if (!excluido) {
            System.out.println("Contato não encontrado!");
        }
    }
    
    // função para retornar false
    public static boolean sair() {
    	System.out.println("\nSaindo da Agenda de Contatos ...");
    	return false;
    	}
}