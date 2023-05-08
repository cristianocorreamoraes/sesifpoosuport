
package mediaarray;

public class Media {

    public double calculaMedia(){
    
        float[] notas;
        notas = new float[4];
        float soma = 0;
        float media = 0;
        
        notas[0] = 3;
        notas[1] = 5;
        notas[2] = 7;
        notas[3] = 10;
        
        int cont = 0;
        
        while(cont < notas.length){
        
            soma += notas[cont];
            cont++;
            
        }
        
        media = soma / 4;
        
        return media;
        
    }
    
}
