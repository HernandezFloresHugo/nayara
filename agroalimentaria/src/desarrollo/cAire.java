
package desarrollo;

public class cAire extends Congelados{
    private int nitrogeno;
    private int oxigeno;
    private int dCarbono;
    private int vAgua;
    
    public cAire(int nitrogeno, int oxigeno, int dCarbono, int vAgua){
        super("","","","");
        this.nitrogeno=nitrogeno;
        this.oxigeno=oxigeno;
        this.dCarbono=dCarbono;
        this.vAgua=vAgua;;
    }
    //metodo set 
    public void setNit(int nitrogeno){
        this.nitrogeno=nitrogeno;
    }
    public void setOxig(int oxigeno){
        this.oxigeno=oxigeno;
    }
    public void setdCarb(int dCarbono){
        this.dCarbono=dCarbono;
    }
    public void setvAgua(int vgua){
        this.vAgua=vAgua;
    }
    //metodo get
    public int getNit(){
        return this.nitrogeno;
    }
    public int getOxig(){
        return this.oxigeno;
    }
    public int getdCarb(){
        return this.dCarbono;
    }
    public int getvAgua(){
        return this.vAgua;
    }
}
