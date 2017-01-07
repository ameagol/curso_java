package br.com.dextraining.biblioteca;

import java.util.Scanner;

public class InterfaceBiblioteca {

	public static void main(String[] args) {
		
	Biblioteca biblioteca = new Biblioteca();
	Scanner scanner = new Scanner (System.in);
	
	int opcao = 0;
	while(opcao != 5){
			
			switch(opcao){
			case 1:
				
				System.out.println("Digite o nome do Livro");
				Livro livro = new Livro(scanner.next());
				boolean resultado = biblioteca.addLivro(livro);
				if(resultado == false ){
					System.out.println("Livro Ja Existe Na posição");
				}else{
					System.out.println("Livro Cadastrado com Sucesso");
				}
			break;
			
			case 2:
				System.out.println("Digite o codigo do Livro");
				int posicao = scanner.nextInt();
				System.out.println("Livro Cadastrado na posição " + posicao + ": " + biblioteca.buscaLivro(posicao));
			break;
			
			case 3:
				System.out.println("Digite o codigo do Livro a ser Removido");
				biblioteca.removerLivro(scanner.nextInt());
			break;
			
			case 4:
				System.out.println("Listando Livros");
				biblioteca.listarLivros();
			break;
			
			case 5:
				System.exit(2);
			break;
			}
			

			opcao = mostrarMenu(scanner);
			
		}
	

	scanner.close();
		
	}
	
	public static int mostrarMenu(Scanner scanner) {
		System.out.println("1 - Add Livro");
		System.out.println("2 - Buscar Livro");
		System.out.println("3 - Remover Livro");
		System.out.println("4 - Listar Livros");
		System.out.println("5 - Sair");
		System.out.println();
		return scanner.nextInt();
	}
}
