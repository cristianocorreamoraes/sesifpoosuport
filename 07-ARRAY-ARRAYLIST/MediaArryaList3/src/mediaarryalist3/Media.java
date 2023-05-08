
package mediaarryalist3;

/*Importação da classe ArrayList*/
import java.util.ArrayList;
/*Importação da classe Scanner*/
import java.util.Scanner;

/*Declaração da classe Media*/
public class Media {

    /*Cria o ArrayList como atributo que carrega os nomes das disciplinas.*/
    public ArrayList disciplinas = new ArrayList();
    /*Cria o ArrayList como atributo que carrega os valores da médias.*/
    public ArrayList media = new ArrayList();
    /*Cria o ArrayLitst como atributo que carrega os valores das notas.*/
    public ArrayList notas = new ArrayList();
    
    /*Cria o objeto de Scanner como atributo que vai receber os dados digitados via teclado pelo
    usuário.*/
    Scanner sc = new Scanner(System.in);
    
    /*Cria um atributo double que vai armazenar a soma das notas.*/
    public double soma;
    
    /*Declaração do método de calculo da média.*/
    public void calculaMedia(){
    
        /*Carrega todas as disciplinas no ArrayList.*/
        disciplinas.add("FPOO");
        disciplinas.add("SOP");
        disciplinas.add("HARE");
        disciplinas.add("LIMA");
        
        /*Esse for vai percorrer todos os indices do ArrayList, nesse processo
        o programa deverá receber quatro notas referentes a cada disciplinas e fazer
        a soma dessas notas, ainda dentro desse loop será realizado também o calculo da média.*/
        for(int i = 0; i < disciplinas.size(); i++){
        
            /*Cria uma variável local chamada "cont" do tipo "int" que será
            usada como contador em um loop while que recebe as notas da disciplina da 
            vez (loop for)*/
            int cont = 0; 
            
            /*Cria uma variável local chamada de "nota" do tipo "double" essa varável
            será usada para receber a nota digitada pelo usuário e recebida pelo objeto 
            de Scanner.*/
            double nota = 0;
            
            /*Cria um ArrayList local que vai armazenar as quatro notas da disciplina
            da vez (loop for), essas notas são guardadas nesse ArrayList local e em seguida
            o objeto inteiro desse ArrayList local é armazenado dentro do Arraylist "notas", 
            dessa forma para cada indice de "notas" teremos na verdade um objeto do ArrayList
            "notaDi" contendo as quatros notas da disciplina da vez. */
            ArrayList notaDis = new ArrayList();
            
            /*Esse loop solicita e armazena quatro notas de uma disciplina*/
            while(cont < 4){
            
                /*Solicita a nota da disciplina.*/
                System.out.println("Digite a nota de " + disciplinas.get(i));
                
                /*Recebe a nota da disciplina, armazena essa nota na variável local
                "nota" e em seguida soma a nota armazenando o resultado de forma
                cumulativa no atributo "soma".*/
                soma += (nota = sc.nextDouble());
                
                /*Passa o valor da variável local "nota" da disciplina para o 
                ArrayList local "notaDis".*/
                notaDis.add(nota);
                
                /*Incrementa o contador "cont" em 1.*/
                cont++;
            
            }
            
            /*Passa o objeto do ArrayList local "notaDis" para um indice disponível do
            ArrayList "notas"*/
            notas.add(notaDis);
            
            /*Calcula e armazena o valor da média da disciplina da vez (loop for) no
            ArrayList "media".*/
            media.add(soma / 4);
            
            /*Zera o atributo "soma" para que o calculo de media da nova disciplina
            não seja afetado*/
            soma = 0;
            
           /*Zera a variável de contador para que o processo de recebimento de notas
            da próxima disciplina não seja afetado.*/ 
            cont = 0;
            
        }
    
    }
    
    /*Método que exibe as mpedias e as notas de cada disciplina.*/
    public void exibeMediaMedia(){
        
        /*Loop for que percorre todos os indices disponiveis no ArrayLits disciplinas
        e nesse processo exibe as notas e médias recebidas e calculadas através do
        método "calculaMedia".*/
        for(int i = 0; i < disciplinas.size() ;i++){
       
            /*Informa o nome da disciplina e a sua média*/
            System.out.println("Media de " + disciplinas.get(i) + " : " + media.get(i));
            
            /*Cria um ArrayList local chamado de "notaDis que vai receber o objeto
            do outro ArrayList também chamado de "notaDis" criado no método 
            "calculaMedia" e armazenado no ArrayList de atributo "nota"*/
            ArrayList notaDis = new ArrayList();
            
            /*"notaDis" recebendo o objeto de ArrayList de notas.*/
            notaDis.add(notas.get(i));
            
            /*Cria e zera um contador para o loop while.*/
            int cont = 0;
            
            /*Loop while que vai percorrer os indices do ArrayList local notasDis
            e exibir as notas da disciplina da vez (loop for).*/
            while(cont < notaDis.size()){
            
                /*Saída das notas da disciplina da vez (loop for)*/
                System.out.println("notas: " + notaDis.get(cont));
                
                /*Incrementa o contador em 1*/
                cont++;
            
            }

        }        
    
    }
    
}
