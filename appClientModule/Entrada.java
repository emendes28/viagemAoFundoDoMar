

import entidade.Submarino;
/**
 * Classe inicial do projeto que recebe a entrada do usuário
 * 
 *
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class Entrada
{
    private static Submarino submarino = Submarino.getInstance();
    
    public static void main (String args[]){
                for(char comando : args[0].toCharArray()) {   
                    try {
                        switch(comando) {
                            case 'L':
                                submarino.girarEsquerda();
                                break;
                            case 'R':
                                submarino.girarDireita();
                                break;
                            case 'M':
                                submarino.movimento();
                                break;
                            case 'U':
                                submarino.subir();
                                break;
                            case 'D':
                                submarino.descer();
                                break;
                            default:
                                System.out.println(String.format("O comando %c é Invalido",comando));
                                break;
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println(String.format("O comando %s é Inválido",args[0]));
                        break;
                    }
                 }

                System.out.println(submarino.getPosition());
      
    }
}
