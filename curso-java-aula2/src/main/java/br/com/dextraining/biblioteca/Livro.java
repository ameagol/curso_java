package br.com.dextraining.biblioteca;

import java.util.Date;

public class Livro {
	
	private String autor;
	private String titulo;
	private Date data;
	private String codigo;
	
	public Livro(String titulo){
		
		this.setTitulo(titulo);
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
