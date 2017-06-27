
/**
 * Escreva a descrição da classe MoverSul aqui.
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

    
    public void movimentarSubmarino(Submarino submarino) {
        submarino.minusX();
    }
}
