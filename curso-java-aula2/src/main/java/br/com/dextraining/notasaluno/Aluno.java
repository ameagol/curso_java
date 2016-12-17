package br.com.dextraining.notasaluno;

public class Aluno {

	String nome;
	double notas[];
	
	public Aluno(String nome){
		this.nome = nome;
		this.notas = new double[3];
		
	}
	
	public double getMedia(){
		double media = 0;
		for(double nota: notas){
			media += nota;
		}
		
		return media / 3;
	}
}
