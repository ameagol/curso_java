package br.com.dextraining.notasaluno;

import java.util.Scanner;

public class CalculaMediaTurma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de Alunos");
		int quantidadAlunos = scanner.nextInt();
		Aluno alunos[] = new Aluno[quantidadAlunos];
		
		for(int indiceAtual = 0; indiceAtual< quantidadAlunos; indiceAtual++){
			
			System.out.println("Digite o Nome do Aluno No:"+ indiceAtual);
			
			Aluno aluno = new Aluno(scanner.next());
			alunos[indiceAtual] = aluno;
			
			for(int indiceNota = 0;indiceNota < 3;indiceNota++){
				
				System.out.println("Digite a "+ indiceNota +" Nota");
				
				aluno.notas[indiceNota] = scanner.nextInt();
				
			}
			
		}
		
		for(int i = 0;i < alunos.length; i++){
			System.out.print("Aluno:" + alunos[i].nome + " Notas: ");
					
			for(int j = 0; j < alunos[i].notas.length ; j++){
				
				System.out.print(alunos[i].notas[j] + " ");
			}
			
			System.out.println( " Media:" + alunos[i].getMedia());
			System.out.println();
		}
		
		scanner.close();
		

	}

}
