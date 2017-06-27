
/**
 * Enumeration class Direcao 
 * Direcao do submarino
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2017
 */
enum Direcao
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

        /**
         * @return the esquerda
         */
        public Direcao getEsquerda() {
            return esquerda;
        }

        /**
         * @return the direita
         */
        public Direcao getDireita() {
            return direita;
        }
        
        
        /**
         * @return the a quantidade de movimento
         */
        public Movimento getMovimento() {
            return movimento;
        }
        
    }
