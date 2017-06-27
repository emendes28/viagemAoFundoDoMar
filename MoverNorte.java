
/**
 * Escreva a descrição da classe MoverNorte aqui.
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
        submarino.addX();
    }
}
