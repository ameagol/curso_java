package br.com.dextraining.folhapagamento;

public abstract class  Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome,double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
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
		this.salario = salario;
	}

	public double getSalarioComBonificacao(){
		return salario * (1 + getPorcentagemAdcional());
	}
	
	protected abstract double getPorcentagemAdcional();

}
