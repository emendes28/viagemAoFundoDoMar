package movimento;

import entidade.Submarino;


/**
 * Realiza o movimento a partir da entrada
 * 
 * 
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class Mover implements Movimento
{

    /**
     * COnstrutor para objetos da classe Mover
     */
    public Mover()
    {
        
    }

    
    public void movimentarSubmarino(Submarino submarino) {
       submarino.getDirecao().getMovimento().movimentarSubmarino(submarino);
    }
}
