
import java.util.Optional;


/**
 * Enumeration class Comando - 
 * Enum para Organizaçao de comando para a aplicaçao
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2016
 */
public enum Comando
{
    L(new Esquerda()),R(new Direita()),M(new Mover()),U(new Subir()),D(new Descer());
    
    private Movimento movimento;
    
    private Girar giro;
    
    Comando(Movimento movimento){
        this.movimento = movimento;
    }
    
    
    Comando(Girar giro){
        this.giro = giro;
    }

    public Optional<Girar> getGiro() {
        return Optional.ofNullable(giro);
    }

    public Optional<Movimento> getMovimento() {        
        return Optional.ofNullable(movimento);
    }
        
}
