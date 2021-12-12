package Clase241121;
import javax.swing.JOptionPane;
import Tools.Tools;
public class miPilaEstatica {
	int PilaE[];
	int tope, T;
	
	public miPilaEstatica() {
		T=5;
		PilaE=new int [T];
		tope=-1;
	}
	
	public miPilaEstatica (int tam) {
		PilaE=new int [tam];
		tope=-1;
		T=tam;
	}
	
	boolean PilaVacia() {
		boolean status = false;
		if (tope == -1) 
	       status = true;
	return (status);
	}
	
	boolean PilaLlena(){
	      boolean status = false;
	      if(tope == T-1)
	      status = true;
	return(status);
	}
	
	void Push(int dato){
        tope++;
        PilaE[tope]= dato;
    }
	
	int Pop(){
	    int dato; 
	    dato = PilaE[tope]; 
	return(dato);
	}
	
	int StackTop(){
	      int dato;
	      tope--;
	      dato = PilaE[tope];   
	return(dato);
	}
	
public void menu() {
		
		String opcion[] = {"PUSH", "POP","STACKTOP","SALIR"};
		int sel;
		do {
		sel=JOptionPane.showOptionDialog(null, " SELECCIONA DANDO CLICK ", "Pila Estruc Dat", 
		JOptionPane.NO_OPTION, 
		JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]); 
			switch (opcion[sel]) {
				case "PUSH":
						Push(Tools.leerInt("Dime el dato"));
						break;
				case "POP":
						Tools.imprimeMsje("Dato en el Tope: "+Pop());
						break;
				case "STACKTOP":
						Tools.imprimeMsje("Dato: "+ StackTop());
						break;
				case "SALIR":
						break;
								}	 
			} 
		while (!"SALIR".equals(opcion[sel]));
		}
}

