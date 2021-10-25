
package desarrollo;

public class Congelados extends productos{
    private String fecEnv;
    private String paisO;
    private String temp;
    
    public Congelados(String congelados, String fecEnv, String paisO, String temp){
        super("","",congelados);
        this.fecEnv=fecEnv;
        this.paisO=paisO;
        this.temp=temp;
        
    }
    //metodo set
    public void setFecEnv(String fecEnv){
        this.fecEnv=fecEnv;
    }
    public void setPaisO(String paisO){
        this.paisO=paisO;
    }
    public void setTemp(String temp){
        this.temp=temp;
    }
    //metodo get
    public String getFecEnv(){
        return this.fecEnv;
    }
    public String getPaisO(){
        return this.paisO;
    }
    public String getTemp(){
        return this.temp;
    }
}
