package br.edu.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.edu.modelo.Contato;

public class ContatoDAO {
	
	private String caminhoArquivo;

	public ContatoDAO(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

	public boolean salvarContatos(List<Contato> contatos) {

	    try (PrintWriter pw = new PrintWriter(new FileWriter(caminhoArquivo))) {

	        for (Contato contato : contatos) {

	            String linha = contato.getNome() + ";"
	                         + contato.getCelular() + ";"
	                         + contato.getEmail();

	            pw.println(linha);
	        }

	        System.out.println("Contatos salvos com sucesso!");
	        return true;

	    } catch (IOException e) {

	        System.out.println("Erro ao salvar os contatos!");
	        System.out.println("Motivo: " + e.getMessage());
	        return false;
	    }
	}
	
	public void carregarContatos(List<Contato> contatos) {

	    File arquivo = new File(caminhoArquivo);

	    if (!arquivo.exists()) return;

	    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

	        String linha;

	        while ((linha = br.readLine()) != null) {

	        	// Mantém colunas vazias para não estourar o índice do array
                String[] dados = linha.split(";", -1);

                // 1. Verifica se a estrutura tem exatamente 3 colunas
                // 2. Garante que nenhuma das 3 colunas está vazia ou cheia de espaços
                if (dados.length == 3 
                        && !dados[0].trim().isEmpty() 
                        && !dados[1].trim().isEmpty() 
                        && !dados[2].trim().isEmpty()) {

                    // Remove espaços sobressalentes nas pontas antes de salvar
                    Contato contato = new Contato(
                        dados[0].trim(), 
                        dados[1].trim(), 
                        dados[2].trim()
                    );
                    contatos.add(contato);

	            } else {
	            	// Agora qualquer linha como ";;", "Joao;;", ou "Joao;123" vai cair aqui
                    System.out.println("Registro inválido ignorado: " + linha);
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("Erro ao carregar os contatos!");
	        System.out.println("Motivo: " + e.getMessage());
	    }
	}

}
