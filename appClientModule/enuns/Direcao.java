package enuns;

import movimento.MoverNorte;
import movimento.MoverOeste;
import movimento.MoverLeste;
import movimento.MoverSul;
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
        NORTE(new MoverNorte()), SUL(new MoverSul()),LESTE(new MoverLeste()),OESTE(new MoverOeste());
        
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
