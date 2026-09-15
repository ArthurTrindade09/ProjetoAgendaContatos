package br.edu.principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
    public static int SelecionaOpcao(Scanner sc) {
    	System.out.println("--------------------------");
    	System.out.println("1 - Adicionar contato");
    	System.out.println("2 - Listar contatos");
    	System.out.println("3 - Procurar contato");
    	System.out.println("4 - Alterar contato");
    	System.out.println("5 - Excluir contato");
    	System.out.println("6 - Sair");
    	System.out.println("7 - Sobre");
    	System.out.println("--------------------------\n");

    	System.out.print("Escolha uma opção:\n");
    	int opc = sc.nextInt();
    	sc.nextLine();
    	return opc;
    }
    
    // função para retornar false
    public static void sair(boolean continuar) {
    		continuar = false;
    	}
    public static void Sobre() {
    	JOptionPane.showMessageDialog(null, "Desenvolvido por RMS!");
    }
}
