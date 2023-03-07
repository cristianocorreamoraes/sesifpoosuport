import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner objetoScanner = new Scanner(System.in);
		
		Professor objetoProfessor = new Professor();
		Aluno objetoAluno = new Aluno();
		Disciplina objetoDisciplina = new Disciplina();
		Media objetoMedia = new Media();
		
		System.out.println("########## BEM VINDO AO PROGRAMA DE GESTÃO ESCOLAR ##########");
		
		System.out.println("INFORME O NOME DO PROFESSOR");
		String nomeProfessor = objetoScanner.next();
		objetoProfessor.setNomeProfessor(nomeProfessor);
		
		System.out.println("INFORME O NOME DO ALUNO");
		String nomeAluno = objetoScanner.next();
		objetoAluno.setNomeAluno(nomeAluno);
		
		System.out.println("INFORME A DISCIPLINA");
		String nomeDisciplina = objetoScanner.next();
		objetoDisciplina.setNomeDisciplina(nomeDisciplina);
		
		System.out.println("INFORME A 1º NOTA");
		objetoMedia.setNota1(objetoScanner.nextFloat());
		
		System.out.println("INFORME A 2º NOTA");
		objetoMedia.setNota2(objetoScanner.nextFloat());
		
		System.out.println("INFORME A 3º NOTA");
		objetoMedia.setNota3(objetoScanner.nextFloat());
		
		System.out.println("INFORME A 4º NOTA");
		objetoMedia.setNota4(objetoScanner.nextFloat());
		
		System.out.println("NOME DO PROFESSOR: " + objetoProfessor.getNomeProfessor());
		System.out.println("NOME DO ALUNO: " + objetoAluno.getNomeAluno());
		System.out.println("DISCIPLINA: " + objetoDisciplina.getNomeDisciplina());
		System.out.println("MÉDIA DO ALUNO: " + objetoMedia.calcularMedia());
		
		System.out.println("########## OBRIGADO POR USAR PROGRAMA DE GESTÃO ESCOLAR ##########");
		
	}

}
