package br.dextraining.error;

public class TestarUsuario {

	public static void main(String[] args) throws ErroValidacao {
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		Usuario usuario = new Usuario(null,"joe@uol.com","123");
		try {
			
			gerenciador.adcionar(usuario);
			System.out.println("Usuario Adcionado com Sucesso");
		
		} catch (ErroValidacao e){
			System.out.println("Deu Erro" + e.getMessage());
		} finally{
			System.out.println("Executando Finally - Liberando recursos");
		}
		
		
		
	}
}
