package direcao;

import entidade.Submarino;


/**
 * Classe de esquerda para resolver a entrada 
 * de comando e implementar a interface Girar 
 * para setar a direção no objeto submarino
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2017
 */
public class Esquerda implements Girar 
{
    
    
     public void girar(Submarino submarino){
       submarino.setDirecao(submarino.getDirecao().getEsquerda());
   }
    
    
}
