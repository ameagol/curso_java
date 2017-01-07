package br.com.dextraining.notasaluno;

public class Aluno {

	private String nome;
	private double notas[];
	
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
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
