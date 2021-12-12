package Clase061221;
import javax.swing.*;
public class ColaDinOps {
	NodoColaD P, U;
	
	public ColaDinOps() {
		P = null;
		U = null;
	}
	
	void Aviso (String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	boolean ColaLlena(NodoColaD nodoX) {
		boolean status = false;
		
		if (nodoX == null) status = true;
		
		return (status);
	}
	
	boolean ColaVacia() {
		boolean status = false;
		
		if ((P==null)&&(U==null))status = true;
		
		return (status);
	}
	
	void AgregaNodo(Object dato) {
		String msg;
		NodoColaD Nodo;
		
		Nodo = new NodoColaD(dato);
		
		if (ColaLlena(Nodo))
			msg ="ERROR, Cola llena";
		else {
			if (ColaVacia()) {
				P = Nodo;
				U = Nodo;
			}
			else {
				U.Sig = Nodo;
				U = Nodo;
			}
			msg = "Nodo agregado a la Cola!!";
		}
		Aviso (msg);
	}
	
	Object EliminaNodo() {
		Object dato = null;
		NodoColaD aux;
		
		if (!ColaVacia()) {
			aux = P;
			dato = aux.Info;
			P = aux.Sig;
			
			if (P == null) U = null;
		}
		return (dato);
	}
	
	void MuestraCola() {
		int i=1;
		NodoColaD aux = P;
		Object dato = null;
		String ca = "Cola \n \n";
		
		if (ColaVacia())JOptionPane.showMessageDialog(null, "La Cola está vacia!!");
		else
			while (aux != null) {
				dato = aux.Info;
				ca=ca+"Nodo "+1+" = "+dato+"\n";
				JOptionPane.showMessageDialog(null,dato+"\n" );
			    aux = aux.Sig;
			    i++;
			}
		JOptionPane.showMessageDialog(null, ca);
	}
}
