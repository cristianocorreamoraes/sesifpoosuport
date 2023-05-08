
package mediaarraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
    
    public double soma;
    public double media;
    public ArrayList notas = null;
    
    public double calculaMedia(){

        notas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        
        while(cont < 4){
        
            System.out.println("Digite uma nota: ");
            notas.add(sc.nextDouble());
            
            cont++;
        
        }
        
        cont = 0;
        
        while(cont < notas.size()){
        
            soma += (double) notas.get(cont);
            cont++;
        
        }
        
        media = soma / 4;
        
        return media;
        
        
    }
    
}
