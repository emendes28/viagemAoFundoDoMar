package entidade;

import controle.Direcao;

/**
 * class Submarino
 * 
 * Entidade Central do negócio
 *
 * @author Evandro Mendes
 * @version 1.0.0 26/06/2016
 */
public class Submarino
{
    
    private static Submarino INSTANCE = new Submarino(0, 0, 0, Direcao.NORTE);
    
    private int x;
    
    private int y;
    
    private int z;   
    
    private Direcao direcao;       

    /**
     * Construtor do submarino com a sua localização e direção
     */
    private Submarino(int x, int y, int z, Direcao direcao)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direcao = direcao;
    }
    
    public static Submarino getInstance(){
        if(null == INSTANCE) {
            INSTANCE = new Submarino(0, 0, 0, Direcao.NORTE);
        }
        return INSTANCE;
    }

    /**
     * Retorna a posição do submarino
     *
     * @return  the position 
     */
    public String getPosition()
    {
        return String.format("%d %d %d %s",x,y,z,direcao.toString());
    }
    /**
    * Incrementa x + 1 a cada invocação
    */
    
    private void movimentarLeste() {
        this.x++;
    } 
    
    /**
    * Decrementa x + 1 a cada invocação
    */
    private void movimentarOeste() {
        this.x--;
    }
    /**
    * Incrementa y + 1 a cada invocação
    */  
    private void movimentarNorte() {
        this.y++;
    }  
     /**
    * Decrementa y + 1 a cada invocação
    */
    private void movimentarSul() {
        this.y--;
    }   
    
     /**
    * Incrementa z + 1 a cada invocação
    */
    public void subir(){
        this.z++;
    }  
    /**
    * Decrementa z + 1 a cada invocação
    */
    public void descer(){
        this.z--;
    }  
    
    public void setDirecao(Direcao direcao){
        this.direcao = direcao;
    }
    
    
    public Direcao getDirecao(){
        return direcao;
    } 
        
    public void girarDireita(){
        this.direcao.getDireita();
    } 
        
    public void girarEsquerda(){
        this.direcao.getEsquerda();
    } 
    
      
    public void movimento(){
        switch(this.direcao) {
            case LESTE:
                movimentarLeste();
            break;
            case NORTE:
                movimentarNorte();
            break;
            case OESTE:
                movimentarOeste();
            break;
            case SUL:
                movimentarSul();
            break;
                   
        }
    }
    
}
