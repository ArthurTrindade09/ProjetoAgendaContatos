package br.edu.principal;

import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	public static void adicionar(Scanner sc, List<Contato> contatos) {
    	
		System.out.println("=== ADICIONAR CONTATO ===");
        
		System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o celular: ");
        String celular = sc.nextLine();
        
        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        Contato contato = new Contato();

        contato.nome = nome;
        contato.celular = celular;
        contato.email = email;

        contatos.add(contato);


        System.out.println("Contato adicionado com sucesso!");
    }
	
	public static void listar(List<Contato> contatos) {
    	
		System.out.println("=== LISTAR CONTATOS ===");
       
		if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado!");

        } else {
            
        	for (Contato contato : contatos) {

                System.out.println("--------------------------");
                System.out.println("Nome: " + contato.nome);
                System.out.println("Celular: " + contato.celular);
                System.out.println("Email: " + contato.email);
            }
        }
    }

    public static void pesquisar(Scanner sc, List<Contato> contatos) {
    	
    	System.out.println("=== PROCURAR CONTATO ===");
        
    	System.out.print("Digite o nome do contato: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (Contato contato : contatos) {

            if (contato.nome.equalsIgnoreCase(nomeBusca)) {

                System.out.println("--------------------------");
                System.out.println("Nome: " + contato.nome);
                System.out.println("Celular: " + contato.celular);
                System.out.println("Email: " + contato.email);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void atualizar(Scanner sc, List<Contato> contatos) {
    	
    	System.out.println("=== ALTERAR CONTATO ===");
        
    	System.out.print("Digite o nome do contato: ");
        String nomeProcurado = sc.nextLine();

        Contato contatoEncontrado = null;

        for (Contato contato : contatos) {

            if (contato.nome.equalsIgnoreCase(nomeProcurado)) {
                contatoEncontrado = contato;
            }
        }

        if (contatoEncontrado != null) {

            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            contatoEncontrado.nome = novoNome;
            contatoEncontrado.celular = novoCelular;
            contatoEncontrado.email = novoEmail;

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void excluir(Scanner sc, List<Contato> contatos) {
    	
    	System.out.println("=== EXCLUIR CONTATO ===");
        
    	System.out.print("Digite o nome do contato: ");
        String nomeExcluir = sc.nextLine();

        Contato contatoExcluir = null;

        for (Contato contato : contatos) {

            if (contato.nome.equalsIgnoreCase(nomeExcluir)) {
                contatoExcluir = contato;
            }
        }

        if (contatoExcluir != null) {

            contatos.remove(contatoExcluir);

            System.out.println("Contato excluído com sucesso!");

        } else {

            System.out.println("Contato não encontrado!");
        }

    }
    
}