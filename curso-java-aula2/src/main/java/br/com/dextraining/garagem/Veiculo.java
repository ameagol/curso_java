package br.com.dextraining.garagem;

import java.util.Comparator;

public class Veiculo implements Comparator<Veiculo>{

	private String placa;
	private String modelo;
	private int ano;
	
	public Veiculo(String modelo,String placa,int ano){
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString(){
		return modelo + " " + placa + " " + ano;
	}


	public int compare(Veiculo o1, Veiculo o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
