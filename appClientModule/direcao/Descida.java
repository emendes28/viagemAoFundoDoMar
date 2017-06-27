package direcao;

import entidade.Submarino;
import movimento.Movimento;


/**
 * class Descida
 
 Implementa interface movimento 
 e realiza o movimento de descida
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2016
 */
public class Descida implements Movimento
{
   
    /**
     * Constructor for objects of class Descer
     */
    public Descida()
    {
    }

    /**
     * Recebe objeto submarino e diminui o eixo Z
     *
     * @param  submarino uma instancia de submarino inicializada
     */
    public void movimentarSubmarino(Submarino submarino)
    {
        //TODO : Adicionar Optional para evitar null 
        submarino.minusZ();
    }
    
}
