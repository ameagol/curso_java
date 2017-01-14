package br.dextraining.error;

public class GerenciadorUsuario {

	public void adcionar(Usuario usuario) throws ErroValidacao{
		if(usuario.getSenha() == null){
			throw new ErroValidacao("O campo senha é obrigatorio");
		}
		
		if(usuario.getMail() == null){

			throw new ErroValidacao("O campo mail é obrigatorio");
		}
		
		if(usuario.getNome() == null){
			throw new ErroValidacao("O campo nome é obrigatorio");
			
		}
		
	}
	
	public void validar(Usuario usuario) throws ErroConexao{
		
		if(usuario.getMail() != "admin@dextra.com.br" || usuario.getSenha() != "Admin1234"){
			throw new ErroConexao("Usuario ou Senha de Admins Invalidos");
		}
		
	}
}
