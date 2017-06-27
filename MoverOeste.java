
/**
 * Escreva a descrição da classe MoverOeste aqui.
 * 
 *
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class MoverOeste implements Movimento
{

    /**
     * COnstrutor para objetos da classe MoverOeste
     */
    public MoverOeste()
    {
    }

    
    public void movimentarSubmarino(Submarino submarino) {
        submarino.minusX();
    }
}
