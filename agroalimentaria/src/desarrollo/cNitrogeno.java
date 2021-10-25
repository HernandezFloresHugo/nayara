
package desarrollo;

public class cNitrogeno extends Congelados{
    private String informacion;
    private int segundos;
    
    //metodo constructor
    public cNitrogeno(String informacion, int segundos){
        super("","","","");
        this.informacion=informacion;
        this.segundos=segundos;
    }
    
    //metodo set
    public void setInfo(String informacion){
        this.informacion=informacion;
    }
    public void setSeg(int segundos){
        this.segundos=segundos;
    }
    
    //metodo get
    public String getInfo(){
        return this.informacion;
    }
    public int getSeg(){
        return this.segundos;
    }
}
