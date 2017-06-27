package movimento;

import entidade.Submarino;


/**
 * Interface para movimentar o submarino
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2017
 */
public interface Movimento
{
    /**
     * Metodo que realiza o movimento do submarino
     *
     * @param um submarino inicializado
     */
    void movimentarSubmarino(Submarino submarino);
}
