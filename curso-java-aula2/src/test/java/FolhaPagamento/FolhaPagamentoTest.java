package FolhaPagamento;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.dextraining.folhapagamento.FolhaPagamento;
import br.com.dextraining.folhapagamento.Gerente;


public class FolhaPagamentoTest {
	
	private FolhaPagamento folhaPagamento;
	private Gerente	gerente;
	
	@Before
	public void init(){
		folhaPagamento = new FolhaPagamento();
		gerente = new Gerente("Ricardo",100);
	}
	
	@Test
	public void testarSemFuncionas(){
		double total = folhaPagamento.calcular();
		
		Assert.assertEquals(Double.valueOf(0), Double.valueOf(total));
	}
	
	@Test
	public void testarGerente(){
		double total = gerente.getSalarioComBonificacao();
		
		Assert.assertEquals(Double.valueOf(115), Double.valueOf(total));
	}

}
