package direcao;

import entidade.Submarino;
import movimento.Movimento;



/**
 * class Subir
 * 
 * Implementa interface movimento 
 * e realiza o movimento de subida
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2016
 */
public class Subir implements Movimento
{
    /**
     * Constructor for objects of class Subir
     */
    public Subir()
    {
    }

    /**
     * Recebe objeto submarino e aumenta o eixo Z
     * de forma logica pois ao descer diminui
     * 
     * @param  submarino uma instancia de submarino inicializada
     */
    public void movimentarSubmarino(Submarino submarino)
    {
        submarino.addZ();
    }
}
