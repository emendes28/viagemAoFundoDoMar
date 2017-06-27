package movimento;

import entidade.Submarino;


/**
 * Classe a ser aplicada no enum de direção Sul
 * 
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MoverSul implements Movimento
{

    /**
     * COnstrutor para objetos da classe MoverSul
     */
    public MoverSul()
    {
    }

    /**
    * Metodo que realiza o movimento do submarino no eixo Y
    * 
    * @param submarino uma instancia com um submarino
    */
    public void movimentarSubmarino(Submarino submarino) {
        submarino.minusY();
    }
}
