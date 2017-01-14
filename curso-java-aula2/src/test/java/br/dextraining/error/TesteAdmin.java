package br.dextraining.error;

import org.junit.Assert;
import org.junit.Test;

public class TesteAdmin {
	
	GerenciadorUsuario gerenciador = new GerenciadorUsuario();
	
	Usuario usuario = new Usuario("uol","admin@dextra.com.br", "Admin1234");
	
	@Test(expected = ErroConexao.class)
	public void testarValidarUsuarioEsenha(){
		gerenciador.validar(usuario);
	}
	
		@Test()
		public void testarAdcionarSemNome(){
			gerenciador.validar(usuario);
		}
		@Test
		public void testarAdcionarSemEmail(){
				
			}
		@Test
		public void testarAdcionarSemSenha(){
			
		}
		
		

}
