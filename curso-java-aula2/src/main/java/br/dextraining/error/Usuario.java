package br.dextraining.error;

public class Usuario {
	
	private String senha;
	private String mail;
	private String nome;
	
	public Usuario(String nome,String mail,String senha){
		super();
		this.nome = nome;
		this.mail = mail;
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
