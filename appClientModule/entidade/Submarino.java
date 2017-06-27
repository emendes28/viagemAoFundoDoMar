package entidade;

import enuns.Direcao;

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
    private int x;
    
    private int y;
    
    private int z;   
    
    private Direcao direcao;       

    /**
     * Construtor do submarino com a sua localização e direção
     */
    public Submarino(int x, int y, int z, Direcao direcao)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direcao = direcao;
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
    public void addX(){
        this.x++;
    }  
    /**
    * Decrementa x + 1 a cada invocação
    */
    public void minusX(){
        this.x--;
    } 
    /**
    * Incrementa y + 1 a cada invocação
    */  
    public void addY(){
        this.y++;
    }  
     /**
    * Decrementa y + 1 a cada invocação
    */
    public void minusY(){
        this.y--;
    }   
    
     /**
    * Incrementa z + 1 a cada invocação
    */
    public void addZ(){
        this.z++;
    }  
    /**
    * Decrementa z + 1 a cada invocação
    */
    public void minusZ(){
        this.z--;
    }  
    
    public void setDirecao(Direcao direcao){
        this.direcao = direcao;
    }
    
    
    public Direcao getDirecao(){
        return direcao;
    } 
    
}
