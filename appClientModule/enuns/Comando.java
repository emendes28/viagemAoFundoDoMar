package enuns;


import movimento.ComandoMovimento;
import direcao.Descida;
import direcao.Subida;
import direcao.Direita;
import direcao.Esquerda;
import java.util.Optional;
import movimento.Movimento;
import direcao.Giro;


/**
 * Enumeration class Comando - 
 * Enum para Organizaçao de comando para a aplicaçao
 * Que possui como contrutores as ações 
 * possiveis de cada entrada
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2016
 */
public enum Comando
{
    L(new Esquerda()),R(new Direita()),M(new ComandoMovimento()),U(new Subida()),D(new Descida());
    
    private Movimento movimento;
    
    private Giro giro;
    
    Comando(Movimento movimento){
        this.movimento = movimento;
    }
    
    
    Comando(Giro giro){
        this.giro = giro;
    }

    public Optional<Giro> getGiro() {
        return Optional.ofNullable(giro);
    }

    public Optional<Movimento> getMovimento() {        
        return Optional.ofNullable(movimento);
    }
        
}
