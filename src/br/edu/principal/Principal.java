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

        Uteis.mostraInicializacao();
        
        // loop principal do programa
        while (continuar) {
        	Uteis.mostraMenu();
        	int opcao = Uteis.SelecionaOpcao(sc);
        	
        	// verificar cada caso da opção numérica do programa
            switch (opcao) {
                case 1-> Agenda.adicionar(sc, nomes, celulares, emails);
                case 2-> Agenda.listar(nomes, celulares, emails);
                case 3-> Agenda.pesquisar(sc, nomes, celulares, emails);
                case 4-> Agenda.atualizar(sc, nomes, celulares, emails);
                case 5-> Agenda.excluir(sc, nomes, celulares, emails);
                case 6-> continuar = Uteis.sair();
                case 7-> Uteis.Sobre();
                default ->System.out.println("Opção inválida!");
            }
        }
        // fechar processo do objeto Scanner para memória ou seila
        sc.close();
    }
}