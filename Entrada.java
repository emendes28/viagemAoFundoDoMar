import java.util.Optional;

/**
 * Escreva a descrição da classe Entrada aqui.
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
        Optional<String> entrada = Optional.ofNullable(args[0]);
        entrada.ifPresent(c -> {
            for(char comando : c.toCharArray()) {                
                switch(Comando.valueOf(String.valueOf(comando))) {
                    case L:
                        Comando.L.getGiro().ifPresent(g -> g.girar(submarino));
                        
                        System.out.println("L");
                        break;
                    case R:
                        Comando.R.getGiro().ifPresent(g -> g.girar(submarino));
                        System.out.println("R");
                        break;
                    case M:
                        Comando.M.getMovimento().ifPresent(m -> m.movimentarSubmarino(submarino));
                        System.out.println("M");
                        break;
                    case U:
                        Comando.U.getMovimento().ifPresent(m -> m.movimentarSubmarino(submarino));
                        System.out.println("U");
                        break;
                    case D:
                        Comando.D.getMovimento().ifPresent(m -> m.movimentarSubmarino(submarino));
                        break;
                    default:
                        System.out.println("swith "+submarino.getPosition());
                        break;
                }
                
            System.out.println("for "+submarino.getPosition());
                    
            }
            System.out.println(submarino.getPosition());
        });
        entrada.orElse("Favor informe uma entrada");
    }
}
