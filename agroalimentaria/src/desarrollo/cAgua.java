
package desarrollo;

public class cAgua extends Congelados{
    private float salinidad; //esto debe de ser en gramos
    
    public cAgua(float salinidad){
        super("","","","");
        this.salinidad=salinidad;
    }
    
    //metodo set
    public void setSalinidad(float salinidad){
        this.salinidad=salinidad;
    }
    //metodo get
    public float getSalinidad(){
        return this.salinidad;
    }
}
