import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		//Criação do objeto Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Declaração de variáveis
		String nomeAluno, disciplina;
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("##### BEM VINDO AO SISTEMA DE CALCULO DE MÉDIA ####");
		
		/*
		 ENTRADA DE DADOS:
		 RECEBIMENTO DOS DADOS DE NOME DO ALUNO(A), DISCIPLINA E NOTAS DE 1 A 4.
		*/
		System.out.println("DIGITE O NOME DO ALUNO(A): ");
		nomeAluno = scanner.next();
		
		System.out.println("DIGITE O NOME DA DISCIPLINA: ");
		disciplina = scanner.next();
		
		System.out.println("DIGITE A PRIMEIRA NOTA: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("DIGITE A SEGUNDA NOTA: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("DIGITE A TERCEIRA NOTA: ");
		nota3 = scanner.nextDouble();
		
		System.out.println("DIGITE A QUARTA NOTA: ");
		nota4 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("NOME: " + nomeAluno + " MÉDIA : " + media);
		System.out.println("##### OBRIGADO POR USAR O SISTEMA DE CALCULO DE MÉDIA ####");
		
	}

}
