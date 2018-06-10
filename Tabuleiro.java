
/**
 * Escreva a descrição da classe Tabuleiro aqui.
 * 
 * @author Henrique Keller Braz 
 * @version 05/11/2017
 */
import java.util.Random;
public class Tabuleiro
{
   
    private String tabuleiro[][];
    
    
    /**
     * Construtor para objetos da classe Tabuleiro
     */
    public Tabuleiro()
    {
        tabuleiro = new String [16][16];
        // inicializa tabuleiro e popula com pontos
           for(int lin=0; lin<tabuleiro.length; lin++){
            for(int col = 0; col<tabuleiro[lin].length; col++){
                tabuleiro[lin][col]= ".";
            }
        }
       
    }
    
    // getters
    
    public String getTabuleiro(int x, int y){
        
      return tabuleiro[x][y];
    }
    
    //setters
    
     /**
     *Aloca casa no tabuleiro 
     */
    
    public void setTabuleiro(int x, int y){
    
          tabuleiro[x][y] = "O";
    
    }
    

    
     /**
     * Coloca Submarino no tabuleiro
     */
    
    public void setSub(){
          Submarino sub = new Submarino();
          
          do{
                 
                  sub.setSub();
                  
                  
               
            }while (getTabuleiro (sub.getSub(0), sub.getSub(1)) == "O"||
                    getTabuleiro (sub.getSub(0)+1, sub.getSub(1)) == "O" ||
                    getTabuleiro (sub.getSub(0)-1, sub.getSub(1)) == "O" ||
                    getTabuleiro (sub.getSub(0), sub.getSub(1)+1) == "O" ||
                    getTabuleiro (sub.getSub(0), sub.getSub(1)-1) == "O" ||
                    getTabuleiro (sub.getSub(0)+2, sub.getSub(1)) == "O" ||
                    getTabuleiro (sub.getSub(0)-2, sub.getSub(1)) == "O" ||
                    getTabuleiro (sub.getSub(0), sub.getSub(1)+2) == "O" ||
                    getTabuleiro (sub.getSub(0), sub.getSub(1)-2) == "O" ||
                    getTabuleiro (sub.getSub(0)+1, sub.getSub(1)+1) == "O" ||
                    getTabuleiro (sub.getSub(0)+1, sub.getSub(1)-1) == "O" ||
                    getTabuleiro (sub.getSub(0)-1, sub.getSub(1)+1) == "O" ||
                    getTabuleiro (sub.getSub(0)-1, sub.getSub(1)-1) == "O" ||
                    getTabuleiro (sub.getSub(0)+2, sub.getSub(1)+2) == "O" ||
                    getTabuleiro (sub.getSub(0)+2, sub.getSub(1)-2) == "O" ||
                    getTabuleiro (sub.getSub(0)-2, sub.getSub(1)+2) == "O" ||
                    getTabuleiro (sub.getSub(0)-2, sub.getSub(1)-2) == "O");
                    
                   
                    
            setTabuleiro(sub.getSub(0),sub.getSub(1));
                
    }
    

     /**
     * Coloca Avião no tabuleiro
     */
    
    public void setAviao(){
           Aviao aviao = new Aviao();
            
          do{
                     aviao.setAviao();
               
            }while (//aviao.getAviao(0) < 1 || aviao.getAviao(1) >13 ||
                getTabuleiro(aviao.getAviao(0),aviao.getAviao(1))=="O" || 
                getTabuleiro(aviao.getAviao(2),aviao.getAviao(3))=="O" || 
                getTabuleiro(aviao.getAviao(4),aviao.getAviao(5))=="O" ||
                
                getTabuleiro(aviao.getAviao(0)+1,aviao.getAviao(1))=="O" || 
                getTabuleiro(aviao.getAviao(2)+1,aviao.getAviao(3))=="O" || 
                getTabuleiro(aviao.getAviao(4)+1,aviao.getAviao(5))=="O" ||
                getTabuleiro(aviao.getAviao(0),aviao.getAviao(1)-1)=="O" || 
                getTabuleiro(aviao.getAviao(4),aviao.getAviao(5)-1)=="O" ||
                getTabuleiro(aviao.getAviao(2),aviao.getAviao(3)+1)=="O" || 
                getTabuleiro(aviao.getAviao(4),aviao.getAviao(5)+1)=="O" ||
                getTabuleiro(aviao.getAviao(4)-1,aviao.getAviao(5))=="O" ||
                getTabuleiro(aviao.getAviao(4)-2,aviao.getAviao(5))=="O");
            
                  setTabuleiro(aviao.getAviao(0),aviao.getAviao(1));
                  setTabuleiro(aviao.getAviao(2),aviao.getAviao(3));
                  setTabuleiro(aviao.getAviao(4),aviao.getAviao(5));
                
                
    }
    

     /**
     * Coloca Navio no tabuleiro
     */
    
    public void setNavio(){
           Navio navio = new Navio();
            
       
                
                if(navio.getNd()==0 || navio.getNd() == 1){
                    
                  do{
                           navio.setNavio();
                           
                    }while ( 
                    getTabuleiro(navio.getNavio(0),navio.getNavio(1))=="O" || 
                    getTabuleiro(navio.getNavio(2),navio.getNavio(3))=="O" || 
                    getTabuleiro(navio.getNavio(4),navio.getNavio(5))=="O" ||
                    getTabuleiro(navio.getNavio(0)+1,navio.getNavio(1))=="O" ||
                    getTabuleiro(navio.getNavio(2)+1,navio.getNavio(3))=="O" || 
                    getTabuleiro(navio.getNavio(4)+1,navio.getNavio(5))=="O" ||
                    getTabuleiro(navio.getNavio(0)-1,navio.getNavio(1))=="O" || 
                    getTabuleiro(navio.getNavio(2)-1,navio.getNavio(3))=="O" || 
                    getTabuleiro(navio.getNavio(4)-1,navio.getNavio(5))=="O" ||
                    getTabuleiro(navio.getNavio(0),navio.getNavio(1)+1)=="O" || 
                    getTabuleiro(navio.getNavio(4),navio.getNavio(5)-1)=="O");
                
                }
                
                if(navio.getNd()==2 || navio.getNd() == 3){
                    
                    do{
                    
                     navio.setNavio();
                     
                    }while (
                    getTabuleiro(navio.getNavio(0),navio.getNavio(1))=="O" || 
                    getTabuleiro(navio.getNavio(2),navio.getNavio(3))=="O" || 
                    getTabuleiro(navio.getNavio(4),navio.getNavio(5))=="O" ||
                    getTabuleiro(navio.getNavio(0)-1,navio.getNavio(1))=="O" ||    
                    getTabuleiro(navio.getNavio(0),navio.getNavio(1)+1)=="O" || 
                    getTabuleiro(navio.getNavio(2),navio.getNavio(3)+1)=="O" || 
                    getTabuleiro(navio.getNavio(4),navio.getNavio(5)+1)=="O" ||
                    getTabuleiro(navio.getNavio(0),navio.getNavio(1)-1)=="O" || 
                    getTabuleiro(navio.getNavio(2),navio.getNavio(3)-1)=="O" || 
                    getTabuleiro(navio.getNavio(4),navio.getNavio(5)-1)=="O" ||
                    getTabuleiro(navio.getNavio(4)+1,navio.getNavio(5))=="O" ||
                    getTabuleiro(navio.getNavio(4)-1,navio.getNavio(5))=="O");
              
                
                }
             
                       
                  setTabuleiro(navio.getNavio(0),navio.getNavio(1));
                  setTabuleiro(navio.getNavio(2),navio.getNavio(3));
                  setTabuleiro(navio.getNavio(4),navio.getNavio(5));
            
               
    }
    
         public String toString1(){
        
          String msg="Estado Atual do tabuleiro 16X16:  \n";
          
           int i,j = 0; 
           for ( i=0 ; i<tabuleiro.length; i++){
               
                     for ( j=0 ; j<tabuleiro[i].length; j++){
            
                           msg = msg  + "\nlinha ("+i+") coluna("+j+") valor: " + tabuleiro[i][j]+"\n\n";}
                
            }
            
            return msg;
    
    
    }
    
          public String toString(){
              
               String msg= "";
               
                msg = "\n\n----------------- Batalha Naval ----------------------\n\n";
                   
              for(int i=0; i<16; i++){
                  
                   if (i ==0){ msg = msg + "    " + i;}
                   
                   else if (i >9){ msg = msg + "" + i;}
                   
                   else {msg = msg + " " + i;}
                   
                                                     
               } 
                   
                                   
               msg = msg + "\n";
               
              /*
              
               // aqui mostra as peças do tabuleiro
              for (int linha = 0; linha<16; linha++){
                  
                         if(linha < 10 ){ msg = msg + linha + "   ";}
                         else{ msg = msg + linha + "  ";}
                      
                       for (int coluna = 0; coluna <16; coluna++){                                                                                                                               
                                                                      
                                   msg = msg + getTabuleiro(linha,coluna)+" "; 
                                   
                                
                                   if ( coluna == 15){msg = msg+ "\n";}
                        
                        }
                      
                          
            
             }
             
             
            **/
            
             // aqui esconde as peças do tabuleiro
           for (int linha = 0; linha<16; linha++){
                  
                         if(linha < 10 ){ msg = msg + linha + "   ";}
                         else{ msg = msg + linha + "  ";}
                      
                       for (int coluna = 0; coluna <16; coluna++){                                                                                                                               
                                                                      
                                   msg = msg + "."+" ";
                                   
                                
                                   if ( coluna == 15){msg = msg+ "\n";}
                        
                        }
                      
                          
            
             }
           
    
           return msg;
        }


}
