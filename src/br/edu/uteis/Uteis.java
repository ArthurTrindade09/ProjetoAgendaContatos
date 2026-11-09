package br.edu.uteis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uteis {
	public static void mostraInicializacao() {
    	System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS   ");
        System.out.println("          v4.1.0          ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }
    
    public static void mostraMenu() {
    	System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("6 - Sair");
        System.out.println("7 - Sobre");
    }
    
    public static int selecionaOpcao(Scanner sc) {
    	System.out.println("");
    	System.out.print("Escolha uma opção: ");
        int opc = sc.nextInt();
        sc.nextLine();
        return opc;
    }

    //public static boolean sair() {
    //	System.out.println("Saindo da Agenda de Contatos...");
    //    return false;
    //}
    
    public static void sair() {
    	System.out.println("Saindo da Agenda de Contatos...");
    }
    
    public static void sobre() {
    	JOptionPane.showMessageDialog(null, 
    			"Desenvolvido por Roger M. Sarmento!");
    }
}








