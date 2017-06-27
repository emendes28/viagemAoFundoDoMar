
/**
 * class Submarino
 * 
 * Entity of bussiness
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
     * Constructor for objects of class Submarino 
     * with position
     */
    public Submarino(int x, int y, int z, Direcao direcao)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direcao = direcao;
    }

    /**
     * The method return position of Submarine
     *
     * @return  the position 
     */
    public String getPosition()
    {
        return String.format("%d %d %d %s",x,y,z,direcao.toString());
    }
    
    public void addX(){
        this.x++;
    }  
    
    public void minusX(){
        this.x--;
    } 
        
    public void addY(){
        this.y++;
    }  
    
    public void minusY(){
        this.y--;
    }   
    
    
    public void addZ(){
        this.z++;
    }  
    
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
