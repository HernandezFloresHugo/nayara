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
public class Informacion extends productos{
    private String fCad;
    private int numLot;
    
    //Constructor
    public Informacion(String frescos, String refrigerados, String congelados, String fCad, int numLot){
        super(frescos,refrigerados,congelados);
        this.fCad=fCad;
        this.numLot=numLot;
    }
    //metodo set
    public void setFCad(String fCad){
        this.fCad=fCad;
    }
    public void setNumLot(int numLot){
        this.numLot=numLot;
    }
    //metodo get
    public String getFcad(){
        return this.fCad;
    }
    public int getNumLot(){
        return this.numLot;
    }
    
}
