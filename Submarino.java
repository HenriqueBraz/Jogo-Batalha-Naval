
/**
 * Escreva a descrição da classe Submarino aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Random;
public class Submarino
{
    
    private int subx;
    private int suby;
   

    /**
     * Construtor para objetos da classe Submarino
     */
    public Submarino()
    {
        subx = 0;
        suby = 0;
        
    }
    
      
    // setters
    /**
     * Coloca Submarino4 no tabuleiro
     */
    
    public void setSub(){
          
          
                  Random gerador = new Random();
                  subx = gerador.nextInt(12)+2;  
                  suby = gerador.nextInt(12)+2;
                
    }
    
    
    // getters
    public int getSub(int n){
        
          int lista[] = new int[2];
             
             lista [0] = subx;
             lista [1] = suby;
             
    
            return lista[n];
    
          
    }
    


 
}
