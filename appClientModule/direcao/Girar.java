package direcao;

import entidade.Submarino;


/**
 * Interface que realiza os 
 * movimentos L e R do enum comando
 *
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2017
 */
public interface Girar
{

    /**
     * Contrato de giro do submarino
     *
     * @param  submarino com o valor preenchido
     */
    void girar(Submarino submarino);
}
