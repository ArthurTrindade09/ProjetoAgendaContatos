package br.edu.principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

// Classe responsável por fazer operações úteis dentro do programa
public class Uteis {
    // Mostra cabeçalho;
    public static void mostraInicializacao() {
        System.out.println("+========================+");
        System.out.println("|    AGENDA DE CONTATOS  |");
        System.out.println("|         v1.1.0         |");
        System.out.println("+========================+");
        System.out.println("        Bem-vindo!        ");
    }
    
    // Selecionar um valor numérico para opção
    public static void mostraMenu() {
    	System.out.println("--------------------------");
    	System.out.println("1 - Adicionar contato");
    	System.out.println("2 - Listar contatos");
    	System.out.println("3 - Procurar contato");
    	System.out.println("4 - Alterar contato");
    	System.out.println("5 - Excluir contato");
    	System.out.println("6 - Sair");
    	System.out.println("7 - Sobre");
    	System.out.println("--------------------------\n");
    }
    	
    public static int SelecionaOpcao(Scanner sc) {
    	System.out.print("Escolha uma opção:\n");
    	int opc = sc.nextInt();
    	sc.nextLine();
    	return opc;
    }
    
    // função para retornar false
    public static boolean sair() {
    		System.out.println("\nSaindo da Agenda de Contatos ... FIM!");
    		return false;
    	}
    
    // Pop-up com JFrame, JLabels, Jtitle
    public static void Sobre() {
    	JOptionPane.showMessageDialog(null, "Plok!");
    }
}
