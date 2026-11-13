package br.edu.modelo;

public class Contato {
	
	private String nome;
    private String celular;
    private String email;
    
    public Contato() {

	}
	
    public Contato(String nome, String celular, String email) {
		this.nome = nome;
		this.celular = celular;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		System.out.println("---------------------------------");
		return "Nome: " + nome + "\nCelular: " + celular + "\nEmail: " + email;
	}
}
