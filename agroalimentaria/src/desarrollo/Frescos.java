/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo;

/**
 *
 * @author LA CAGUE
 */
public class Frescos extends productos {
    private String fecEnv;
    private String paisO;
    
    //Constructor
    public Frescos(String frescos, String fecEnv, String paisO){
        super(frescos,"","");
        this.fecEnv=fecEnv;
        this.paisO=paisO;
    }
    
    //metodo set
    public void setFecEnv(String fecEnv){
        this.fecEnv=fecEnv;
    }
    public void setPaisO(String paisO){
        this.paisO=paisO;
    }
    //metodo get
    public String getFecEnv(){
        return fecEnv;
    }
    public String getPaisO(){
        return paisO;
    }
    
    
    
}
