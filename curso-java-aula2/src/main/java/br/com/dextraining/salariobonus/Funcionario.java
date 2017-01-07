package br.com.dextraining.salariobonus;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		
		if(salario > this.salario){
			this.salario = salario;
		}else{
			throw new IllegalArgumentException("Salario não pode ser reduzido");
		}
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		this.porcentagemBonificacao = porcentagemBonificacao;
		
		double novoSalario = this.salario + (this.salario * (porcentagemBonificacao / 100));
		salario = novoSalario;
		
	}
	
	
}
