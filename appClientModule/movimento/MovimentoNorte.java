package movimento;

import entidade.Submarino;


/**
 * Classe a ser aplicada no enum de direção Norte 
 * 
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MovimentoNorte implements Movimento
{

    /**
     * COnstrutor para objetos da classe MoverNorte
     */
    public MovimentoNorte()
    {
        
    }

    
    public void movimentarSubmarino(Submarino submarino) {
        submarino.addY();
    }
}
