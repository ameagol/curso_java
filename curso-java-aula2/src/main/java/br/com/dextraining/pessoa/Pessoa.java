package br.com.dextraining.pessoa;

public class Pessoa {

	String nome;
	int rg;
	int cpf;
	
	public Pessoa(String nome, int rg,int cpf){
		
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}

	//Usando mesmo nome ja existente no Java
	public String toString(){
		return this.nome + " " + this.rg + " " + this.cpf;
	}
}
