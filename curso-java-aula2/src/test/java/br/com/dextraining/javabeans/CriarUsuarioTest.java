package br.com.dextraining.javabeans;

import org.junit.Assert;
import org.junit.Test;

public class CriarUsuarioTest {

	@Test
	public void testarComSenhaValidaNumero(){
		String senhaValida = "123456789a";
		String senhaInvalida = "aabcsbcdbd";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Ricardo");
		usuario.setEmail("ricaprado@yahoo.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
	
	@Test
	public void testarComSenhaValidaLetras(){
		String senhaValida = "123456789a";
		String senhaInvalida = "1234567";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Ricardo");
		usuario.setEmail("ricaprado@yahoo.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
	
	@Test
	public void testarComSenhaValidaTamanho(){
		String senhaValida = "12345abc";
		String senhaInvalida = "123ab";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Ricardo");
		usuario.setEmail("ricaprado@yahoo.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
}
