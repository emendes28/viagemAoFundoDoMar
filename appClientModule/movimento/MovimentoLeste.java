package movimento;

import entidade.Submarino;


/**
 * Classe a ser aplicada no enum de direção Leste
 * 
 *
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MovimentoLeste implements Movimento
{

    /**
     * COnstrutor para objetos da classe MoverLeste
     */
    public MovimentoLeste()
    {
    }

    
    public void movimentarSubmarino(Submarino submarino) {
        submarino.addX();
    }
}
