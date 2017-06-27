
/**
 * Escreva a descrição da classe Mover aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Mover implements Movimento
{

    /**
     * COnstrutor para objetos da classe Mover
     */
    public Mover()
    {
        
    }

    
    public void movimentarSubmarino(Submarino submarino) {
       submarino.getDirecao().getMovimento().movimentarSubmarino(submarino);
    }
}
