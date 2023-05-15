/**** IMPORTAÇÃO DE PACOTES ****/
import java.util.ArrayList;
import java.util.Scanner;

public class Media {

	/**** DECLARAÇÃO DE ATRIBUTOS ****/
	String[] alunos = {"Ana", "João", "Maria", "Carlos"};
	float[] notas = new float[4];
	ArrayList<float[]> notasAluno = new ArrayList<>(); 
	Scanner objScanner =new Scanner(System.in);

	public void listarAlunos() {
		
		//System.out.println("1º aluno(a): " + alunos[0]);
		//System.out.println("2º aluno(a): " + alunos[1]);
		//System.out.println("3º aluno(a): " + alunos[2]);
		//System.out.println("4º aluno(a): " + alunos[3]);

		/**** PERCORREA O ARRAY DE ALUNOS PARA O RECEBIMENTO DE NOTAS ****/
		for(int indice = 0; indice < alunos.length; indice++) {
			
			//System.out.println((indice + 1) + "º ALUNO(A):" + alunos[indice]);
			
			/**** INFORMA O NOME DO ALUNO QUE ESTÁ RECEBENDO AS NOTAS NO MOMENTO ****/
			System.out.println("NOTAS DO ALUNO(A): " + alunos[indice]);
		
			/**** RECEBE QUATRO NOTAS POR ALUNO ****/
			int cont = 0;
			while(cont < 4) {
				
				System.out.println("DIGITE A " + (cont + 1) + "º NOTA");
				notas[cont] = objScanner.nextFloat();
				cont++;
			}
			
			/**** ADICONA UMA SERIE DE 4 NOTAS DE UM ALUNO AO ARRAYLIST ****/
			notasAluno.add(notas.clone());
			
		}
		
		/**** EXIBE O O NOME A AS NOTAS POR ALUNO ****/
		for (int i = 0; i < notasAluno.size(); i++) {
			
			float[] notas =  notasAluno.get(i);
			
			System.out.println("NOTAS DO ALUNO(A): " + alunos[i]);
			
			for (int j = 0; j < notas.length; j++) {
				System.out.println("NOTA: " + notas[j]);
				
			}
			
		}
			
	}
	
}
