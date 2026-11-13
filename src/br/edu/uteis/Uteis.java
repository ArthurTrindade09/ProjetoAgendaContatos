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
    
    
    public static void sair() {
    	System.out.println("Saindo da Agenda de Contatos...");
    }
    
    public static void sobre() {
    	JOptionPane.showMessageDialog(null, 
    			"Desenvolvido por Roger M. Sarmento!");
    }
}









