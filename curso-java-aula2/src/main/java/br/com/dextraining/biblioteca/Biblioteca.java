package br.com.dextraining.biblioteca;

public class Biblioteca {

	private Livro livro;
	private int codigo;
	Livro biblioteca[] = new Livro[5];

	
	public boolean addLivro(Livro livro) {
		this.livro = livro;
		for(int i = 0;i < biblioteca.length;i++){
			
			if(biblioteca[i] == null){
				biblioteca[i] = this.livro;
				return true;
			}
		}
		
		return false;
	}

	public String buscaLivro(int codigo) {
		this.codigo = codigo;
		return biblioteca[this.codigo].getTitulo();
		
	}

	public void removerLivro(int codigo) {
		this.codigo = codigo;
		
		biblioteca[this.codigo] = null;
		
		for(int i = this.codigo;i < biblioteca.length -1;i++){
				biblioteca[i] = biblioteca[i + 1];
		}
		
	}

	public void listarLivros() {
		for(int i = 0;i < biblioteca.length;i++){
			if(biblioteca[i] != null){
			System.out.println(i + " - " +biblioteca[i].getTitulo());
			}else{
				System.out.println(i + " - null");	
			}
		}
		
	}
	
	

}
