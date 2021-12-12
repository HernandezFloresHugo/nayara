package Clase061221;
import javax.swing.*;
public class miColaDin {
	public static void main(String args[]){
	ColaDinOps ColaD = new ColaDinOps();
	Object dato;
	int op = 0;
		  
	do{
		do{
		   op = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Nodo\n2.Extraer Nodo\n3.Mostrar Cola\n0.Terminar"));
		   if ((op < 0)||(op > 3))JOptionPane.showMessageDialog(null,"ERROR en la selección!!");
		  }while((op < 0)|| (op >3));
		    
		   switch (op){
		     case 1: dato = JOptionPane.showInputDialog("Ingresa el dato a agregar a la cola");
		             ColaD.AgregaNodo(dato);
		             break;
		     
		     case 2: dato = ColaD.EliminaNodo();
		             if (dato == null) JOptionPane.showMessageDialog(null,"Cola Vacía!!");
		             else JOptionPane.showMessageDialog(null,"Dato extraído de la Cola:  " + dato);
		             break;
		         
		     case 3: ColaD.MuestraCola();
		     		 break;
		    }
		  }while(op != 0);
		 }
}
