package movimento;

import entidade.Submarino;


/**
 * Classe a ser aplicada no enum de direção Oeste
 * 
 *
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MoverOeste implements Movimento
{

    /**
     * Construtor para objetos da classe MoverOeste
     */
    public MoverOeste()
    {
    }

    
    /**
    * Método que realiza o movimento do submarino no eixo X
    * usando no método minus X
    * 
    * @param submarino uma instancia com um submarino
    */
    public void movimentarSubmarino(Submarino submarino) {
        submarino.minusX();
    }
}
