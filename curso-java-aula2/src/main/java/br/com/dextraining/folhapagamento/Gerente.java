package br.com.dextraining.folhapagamento;

public class Gerente extends Funcionario{
	
	public Gerente(String nome,double salario){
		super(nome,salario);
	}
	
	@Override
	public double getPorcentagemAdcional() {
		return 0.15;
	}

}
