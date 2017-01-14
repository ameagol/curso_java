package br.com.dextraining.folhapagamento;

public class Supervisor extends Funcionario {
	
	public Supervisor(String nome,double salario){
		super(nome,salario);
	}
	
	@Override
	public double getPorcentagemAdcional() {
		return 0.10;
	}
}
