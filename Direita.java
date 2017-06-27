
/**
 * Write a description of class Direita here.
 *
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2017
 */
public class Direita implements Girar
{
   public void girar(Submarino submarino){
       submarino.setDirecao(submarino.getDirecao().getDireita());
   }
}
