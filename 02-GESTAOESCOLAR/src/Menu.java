import java.util.Scanner;

public class Menu {
	
	Professor objetoProfessor;
	Aluno objetoAluno;
	Disciplina objetoDisciplina;
	Media objetoMedia;
	
	public void exibirMenu() {
		
		int opcao = 0;
		Scanner objetoScanner = new Scanner(System.in);
		
		while(opcao != 6){
			
			System.out.println("ESCOLHA UMA OPÇÃO PELO NUMERO:");
			System.out.println("1-CADASTRAR PROFESSOR");
			System.out.println("2-CADASTRAR ALUNO");
			System.out.println("3-CADASTRAR DISCIPLINA");
			System.out.println("4-LANÇA NOTAS");
			System.out.println("5-EXIBIR RESULTADOS");
			System.out.println("6-SAIR");
			
			opcao = objetoScanner.nextInt();
		
			switch (opcao) {
			
				case 1:
					
					if(objetoProfessor == null){
						System.out.println("INFORME O NOME DO PROFESSOR:");
						String nomeProfessor = objetoScanner.next();
						objetoProfessor = new Professor();
						objetoProfessor.setNomeProfessor(nomeProfessor);
					}else {
						System.out.println("O PROFESSOR JÁ FOI CADASTRADO!");	
					}
					
					break;
							
				case 2:
					if(objetoAluno == null){
						System.out.println("INFORME O NOME DO ALUNO:");
						String nomeAluno = objetoScanner.next();
						objetoAluno = new Aluno();
						objetoAluno.setNomeAluno(nomeAluno);
					}else {
						System.out.println("O ALUNO JÁ FOI CADASTRADO!");	
					}
					break;
							
				case 3:
					if(objetoDisciplina == null){
						System.out.println("INFORME A DISCIPLINA:");
						String nomeDisciplina = objetoScanner.next();
						objetoDisciplina = new Disciplina();
						objetoDisciplina.setNomeDisciplina(nomeDisciplina);
					}else {
						System.out.println("A DISCIPLINA JÁ FOI CADASTRADA!");	
					}
					break;
					
				case 4:
					
					if(objetoMedia == null) {
						objetoMedia = new Media();
					}
					
					System.out.println("INFORME A 1º NOTA:");
					objetoMedia.setNota1(objetoScanner.nextFloat());
					
					System.out.println("INFORME A 2º NOTA:");
					objetoMedia.setNota2(objetoScanner.nextFloat());
					
					System.out.println("INFORME A 3º NOTA:");
					objetoMedia.setNota3(objetoScanner.nextFloat());
					
					System.out.println("INFORME A 4º NOTA:");
					objetoMedia.setNota4(objetoScanner.nextFloat());
					
					objetoMedia.calcularMedia();
					
					break;
					
				case 5:
					System.out.println("PROFESSOR: " + objetoProfessor.getNomeProfessor());
					System.out.println("ALUNO: " + objetoAluno.getNomeAluno());
					System.out.println("DISCIPLINA: " + objetoDisciplina.getNomeDisciplina());
					System.out.println("MÉDIA: " + objetoMedia.getMedia());
					
					System.out.println("########## OBRIGADO POR USAR O PROGRAMA DE GESTÃO ESCOLAR ##########");
					
					System.exit(0);
					
					break;
					
				case 6:
					System.out.println("########## OBRIGADO POR USAR O PROGRAMA DE GESTÃO ESCOLAR ##########");
					System.exit(0);
					break;
					
				default:
					System.out.println("OPÇÃO DE MENU INVÁLIDA!");
					break;
			}
		
		}
		
		objetoScanner.close();
		System.exit(0);
		
	}

}
