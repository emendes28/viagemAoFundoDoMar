

import entidade.Submarino;
import enuns.Comando;
import enuns.Direcao;
import java.util.Optional;

/**
 * Classe inicial do projeto que recebe a entrada do usuário
 * 
 *
 * @author Evandro Mendes
 * @version 1.0.0 27/06/2017
 */
public class Entrada
{
    private static Submarino submarino;
    
    static {
        submarino = new Submarino(0, 0, 0, Direcao.NORTE);
    }
    
    public static void main (String args[]){
        if(args.length > 0) {
            Optional<String> entrada = Optional.ofNullable(args[0]);
            entrada.ifPresent(c -> {
                entrada:
                for(char comando : c.toCharArray()) {              
                    try {
                        switch(Comando.valueOf(String.valueOf(comando))) {
                            case L:
                                Comando.L.getGiro().ifPresent(g -> g.girar(submarino));
                                break;
                            case R:
                                Comando.R.getGiro().ifPresent(g -> g.girar(submarino));
                                break;
                            case M:
                                Comando.M.getMovimento().ifPresent(m -> m.movimentarSubmarino(submarino));
                                break;
                            case U:
                                Comando.U.getMovimento().ifPresent(m -> m.movimentarSubmarino(submarino));
                                break;
                            case D:
                                Comando.D.getMovimento().ifPresent(m -> m.movimentarSubmarino(submarino));
                                break;
                            default:
                                System.out.println(String.format("O comando %c é Invalido",comando));
                                break;
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println(String.format("O comando %s é Inválido",entrada.get()));
                        break entrada;
                    }
                 }

                System.out.println(submarino.getPosition());
            });
            entrada.orElse("Favor informe uma entrada");
        } else {
                System.out.println("Informe os comandos");
        }
    }
}
