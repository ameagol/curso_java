package br.com.dextraining.folhapagamento;

public class Secretaria extends Funcionario {
	
	public Secretaria(String nome,double salario){
		super(nome,salario);
	}
	
	@Override
	public double getPorcentagemAdcional() {
		return 0;
	}
}
