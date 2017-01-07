package br.com.dextraining.salariobonus;

public class ValorBonus {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Ricardo");
		funcionario.setSalario(400.0);
		funcionario.setCargo("Programador");	
		funcionario.setPorcentagemBonificacao(100);
		
		System.out.println("Valor do Bonus eh:" + funcionario.getPorcentagemBonificacao());
		System.out.println("Valor do Salario novo eh:" + funcionario.getSalario());
		
	}
	
	
}
