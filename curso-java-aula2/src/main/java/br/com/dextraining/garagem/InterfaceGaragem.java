package br.com.dextraining.garagem;

import java.util.Scanner;

public class InterfaceGaragem {

	public static void main(String[] args) {
		
		Garagem garagem = new Garagem();
		Scanner scanner = new Scanner (System.in);
		
		int opcao = 0;
		while(opcao != 5){
				
				switch(opcao){
				case 1:
					
					System.out.println("Digite o nome do Modelo");
					String modelo = scanner.next();
					System.out.println("Digite a Placa do veiculo");
					String placa = scanner.next();
					System.out.println("Digite o ano do Veiculo");
					int ano = scanner.nextInt();
					Veiculo veiculo = new Veiculo(modelo,placa,ano);
					
					boolean resultado = garagem.addVeiculo(veiculo);
					
					if(resultado == false ){
						System.out.println("Placa do Veiculo ja Cadastrada");
					}else{
						System.out.println("Veiculo Cadastrado com Sucesso");
					}
				break;
				
				case 2:
					System.out.println("Digite a Placa do Veiculo");
					placa = scanner.next();
					if(garagem.removerVeiculo(placa) == null){
						System.out.println("Carro não Encontrado");
						
					}else{
						System.out.println("Carro de placa " + placa + " Vendido");
					}
					
					

				break;
				
				case 3:
					System.out.println("Digite a Placa do Livro a ser localizado");
					System.out.println(garagem.buscarVeiculo(scanner.next()));
				break;
			
				case 4:
					System.out.println("Listando Veiculos");
					garagem.listarVeiculos();
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
			System.out.println("1 - Cadastrar Veiculo");
			System.out.println("2 - Vender (remover por placa)");
			System.out.println("3 - Buscar Veiculo (placa)");
			System.out.println("4 - Listar Veiculos");
			System.out.println("5 - Sair");
			System.out.println();
			return scanner.nextInt();
		}
}	
