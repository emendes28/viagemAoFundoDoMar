package enuns;

import movimento.MovimentoNorte;
import movimento.MovimentoOeste;
import movimento.MovimentoLeste;
import movimento.MovimentoSul;
import movimento.Movimento;


/**
 * Enumeration class Direcao 
 * Direcao do submarino
 * Com o movimento como contrutor 
 * e a sua direção correspondente
 * 
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2017
 */
public enum Direcao
    {
        NORTE(new MovimentoNorte()), SUL(new MovimentoSul()),LESTE(new MovimentoLeste()),OESTE(new MovimentoOeste());
        
        static {
            NORTE.esquerda = OESTE;
            NORTE.direita = LESTE;
            SUL.esquerda = LESTE;
            SUL.direita = OESTE;
            LESTE.esquerda = NORTE;
            LESTE.direita = SUL;
            OESTE.esquerda = SUL;
            OESTE.direita = NORTE;
        }
        
        private Direcao esquerda;
        
        private Direcao direita;
       
        private Movimento movimento;
        
        Direcao (Movimento movimento){
            this.movimento = movimento;
        }

        public Direcao getEsquerda() {
            return esquerda;
        }

        public Direcao getDireita() {
            return direita;
        }
        
    
        public Movimento getMovimento() {
            return movimento;
        }
        
    }
