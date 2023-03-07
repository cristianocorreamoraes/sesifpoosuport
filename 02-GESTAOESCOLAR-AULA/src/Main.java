import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* DECLARAÇÃO DE INSTANCIAS DE OBJETOS */
		Scanner objetoScanner = new Scanner(System.in);
		Professor objetoProfessor = new Professor();
		Disciplina objetoDisciplina = new Disciplina();	
		Aluno objetoAluno = new Aluno();
		Media objetoMedia = new Media();
		
		/* ENTRADA */
		System.out.println("DIGITE O NOME DO PROFESSOR(A):");
		objetoProfessor.setNomeProfessor(objetoScanner.next());
		
		System.out.println("DIGITE O NOME DO ALUNO(A):");
		objetoAluno.setNomeAluno(objetoScanner.next());
		
		System.out.println("DIGITE A DISCIPLINA:");
		objetoDisciplina.setNomeDisciplna(objetoScanner.next());
		
		System.out.println("DIGITE A 1º NOTA:");
		objetoMedia.setNota1(objetoScanner.nextFloat());
		
		System.out.println("DIGITE A 2º NOTA:");
		objetoMedia.setNota2(objetoScanner.nextFloat());
		
		System.out.println("DIGITE A 3º NOTA:");
		objetoMedia.setNota3(objetoScanner.nextFloat());

		System.out.println("DIGITE A 4º NOTA:");
		objetoMedia.setNota4(objetoScanner.nextFloat());
		
		/* PROCESSAMENTO */
		
		/* SAÍDA */
		System.out.println("NOME DO PROPFESSOR(A): " + objetoProfessor.getNomeProfessor());
		System.out.println("NOME DO ALUNO(A): " + objetoAluno.getNomeAluno());
		System.out.println("DISCIPLINA: " + objetoDisciplina.getNomeDisciplna());
		System.out.println("MÉDIA: " + objetoMedia.calcularMedia());
	}

}
