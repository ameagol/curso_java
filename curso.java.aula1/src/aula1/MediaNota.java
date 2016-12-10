package aula1;

import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		

		//Nao tem necessdade de instanciar multiplos scanners
		System.out.println("Digite o seu Nome");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.next();

		System.out.println("Digite sua 1a Nota");
		Scanner scanner1 = new Scanner(System.in);
		
		float nota = scanner1.nextInt();

		System.out.println("Digite sua 2a Nota");
		Scanner scanner2 = new Scanner(System.in);
		float nota2 = scanner2.nextInt();
		
		System.out.println("Digite sua 3a Nota");
		Scanner scanner3 = new Scanner(System.in);
		float nota3 = scanner3.nextInt();
		
		float media = (nota + nota2 + nota3) / 3;
		String resultado; //= media > 7 ? "Aprovado" : "Reprovado";
		
		if(media >= 7){
			 resultado = "Aprovado";
		}else if (media < 7 && media >= 4){
			 resultado = "Exame";
		}else{
			 resultado = "Reprovado";
		}
		
		System.out.println("A Media do Aluno "+ nome + " eh: " + media);
		System.out.println("Seu status eh:" + resultado);
		
		scanner.close();
		scanner1.close();
		scanner2.close();
		scanner3.close();
		
	}

}
