package br.dextraining.error;

public class TestarAdmin {
	public static void main(String[] args) throws ErroConexao {
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		Usuario usuario = new Usuario(null,"joe@uol.com","123");
		try {
			
			gerenciador.validar(usuario);
			System.out.println("Usuario Adcionado com Sucesso");
		
		} catch (ErroConexao e){
			System.out.println("Deu Erro" + e.getMessage());
		} finally{
			System.out.println("Executando Finally - Liberando recursos");
		}
		
		
		
	}
}


