
public class Main {

	public static void main(String[] args) {
		
		LoopWhileContador objLoop1 = new LoopWhileContador();
		LoopWhileSentinela objLoop2 = new LoopWhileSentinela();
		LoopFor objLoop3 = new LoopFor();
		LoopDoWhile objLoop4 = new LoopDoWhile();
		
		/* DEMONSTRAÇÃO DE LOOP DE REPETIÇÃO PRÉ-TESTE POR CONTADOR (WHILE) */
		//objLoop1.loopWhile1();
		//objLoop1.loopWhile2(10);
		
		/* DEMONSTRAÇÃO DE LOOP DE REPETIÇÃO PRÉ-TESTE POR SENTINELA (WHILE) */
		//objLoop2.loopWhile1();
		
		/* DEMONSTRAÇÃO DE LOOP DE REPETIÇÃO PRÉ-TESTE POR CONTADOR (FOR) */
		//objLoop3.loopFor1();
		//objLoop3.loopFor2(15);
		
		/* DEMONSTRAÇÃO DE LOOP DE REPETIÇÃO PÓS-TESTE POR CONTADOR (DO...WHILE) */
		//objLoop4.loopDo1();
		objLoop4.loopDo2(0);
		
	}

}
