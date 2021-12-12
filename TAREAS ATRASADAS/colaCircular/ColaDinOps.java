package Clase071221;
import javax.swing.*;
public class ColaDinOps {
	NodoColaD P, U;
	
	 public ColaDinOps() {
		 P=null;
		 U=null;
	 }
	 
	 void Aviso (String msg) {
		 JOptionPane.showMessageDialog(null, msg);
	 }
	 
	 boolean ColaLlena (NodoColaD nodoX) {
		 boolean status = false;
		 
		 if (nodoX == null) status = true;
		 
		 return  (status);
	 }
	 
	 boolean ColaVacia() {
		 boolean status = false;
		 
		 if ((P == null) && (U == null)) status = true;
		 
		 return (status);
	 }
	 
	 void AgregaNodo (Object dato) {
		 String msg;
		 NodoColaD Nodo;
		 
		 Nodo = new NodoColaD(dato);
		 
		 if (ColaLlena(Nodo))
			 msg = "ERROR, Cola llena!!";
		 else {
			 if (ColaVacia()) {
				 P=Nodo;
				 U=Nodo;
			 }
			 else {
				 U.Sig = Nodo;
				 U = Nodo;
			 }
			 msg = "Nodo agregado a la cola!!";
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
		 int i = 1;
		 String cad ="";
		 NodoColaD aux = P;
		 Object dato = null;
		 
		 if (ColaVacia()) JOptionPane.showMessageDialog(null, "La cola esta vacía!");
		 else
			 while (aux != null) {
				 dato = aux.Info;
				 cad = cad+"Nodo: "+i+")"+" "+dato+"\n";
				 JOptionPane.showMessageDialog(null, cad+"Ultimo elemento en la cola: "+U.Info);
				 aux=aux.Sig;
				 i++;
			 }
	 }
}
