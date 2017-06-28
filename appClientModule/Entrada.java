

import entidade.Submarino;
import controle.Comando;
import controle.Direcao;
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
    
    public static void main (String args[]){
        if(args.length > 0) {
            Optional<String> entrada = Optional.ofNullable(args[0]);
            entrada.ifPresent(c -> {
                entrada:
                for(char comando : c.toCharArray()) {              
                    try {
                        switch(Comando.valueOf(String.valueOf(comando))) {
                            case L:
                                submarino.girarEsquerda();
                                break;
                            case R:
                                submarino.girarDireita();
                                break;
                            case M:
                                submarino.movimento();
                                break;
                            case U:
                                submarino.subir();
                                break;
                            case D:
                                submarino.descer();
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
