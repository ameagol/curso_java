package br.com.dextraining.conta;

public class Conta {
	
	public double saldo = 1000;
	
	public boolean sacar(double valor){
		
		if(saldo >= valor){
			this.saldo = this.saldo - valor;
			return true;
		}else
			return false;
		
	}
	
	public boolean depositar(double valor){
		
		this.saldo = this.saldo + valor;
		return true;
	}
	
	public double verSaldo(){
		return this.saldo;
	}

}
