package movimento;

import entidade.Submarino;


/**
 * Classe a ser aplicada no enum de direção Norte 
 * 
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MoverNorte implements Movimento
{

    /**
     * COnstrutor para objetos da classe MoverNorte
     */
    public MoverNorte()
    {
        
    }

    
    public void movimentarSubmarino(Submarino submarino) {
        submarino.addY();
    }
}
