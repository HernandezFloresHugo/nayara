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
public class productos {
    protected String frescos;
    protected String refrigerados;
    protected String congelados;
    
    public productos(String frescos, String refrigerados, String congelados){
        this.frescos=frescos;
        this.refrigerados=refrigerados;
        this.congelados=congelados;
    }
    
    //metodo set
    public void setFrescos(String frescos){
        this.frescos=frescos;
    }
    public void setRefrigerados(String refirgerados){
        this.refrigerados=refrigerados;
    }
    public void setCongelados(String congelados){
        this.congelados=congelados;
    }
    //metodo get
    public String getFrescos(){
        return frescos;
    }
    public String getRefrigerados(){
        return refrigerados;
    }
    public String getCongelados(){
        return congelados;
    }
}
