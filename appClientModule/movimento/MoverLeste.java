package movimento;

import entidade.Submarino;


/**
 * Classe a ser aplicada no enum de direção Leste
 * 
 *
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MoverLeste implements Movimento
{

    /**
     * COnstrutor para objetos da classe MoverLeste
     */
    public MoverLeste()
    {
    }

    
    public void movimentarSubmarino(Submarino submarino) {
        submarino.addX();
    }
}
