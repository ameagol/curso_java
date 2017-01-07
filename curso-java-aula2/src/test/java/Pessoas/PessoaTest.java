package Pessoas;

import org.junit.Test;

import br.com.dextraining.pessoas.PessoaFisica;
import br.com.dextraining.pessoas.PessoaJuridica;

public class PessoaTest {

	@Test
	public void testarCriacaoPessoaFisica(){
		PessoaFisica pessoafisica = new PessoaFisica();
		
		pessoafisica.setNome("Ricardo");
		pessoafisica.setCpf("21321791828");
	}
	
	@Test
	public void testarCriacaoPessoaJuridica(){
		PessoaJuridica pessoajuridica = new PessoaJuridica();
		pessoajuridica.setCnpj("1010101010");
		pessoajuridica.setRazaoSocial("Dextra");
	}
	
	@Test
	public void testarCriacaoPessoa(){
		
	}
}
