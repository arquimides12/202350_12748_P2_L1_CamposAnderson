package arbolBinario;
import java.util.Stack;
import recorridoArbolBinario.Nodo;
 public class Principal {
	public static void main(String[] args) {
		// Crear el �rbol binario de ejemplo
		Nodo raiz = new Nodo(5);
		Nodo nodo1 = new Nodo(6);    //nodo1
		Nodo nodo2 = new Nodo(34);
		Nodo nodo3 = new Nodo(40);
		Nodo nodo4 = new Nodo(52);

		raiz.setSubarbolIzdo(nodo1);
		raiz.setSubarbolDcho(nodo2);
		nodo1.setSubarbolIzdo(nodo3);
		nodo1.setSubarbolDcho(nodo4);
		// Recorrido en preorden
		System.out.println("Recorrido en preorden:");
		preorden(raiz);

		// Recorrido en inorden
		System.out.println("\nRecorrido en inorden:");
		inorden(raiz);

		// Recorrido en postorden
		System.out.println("\nRecorrido en postorden:");
		postorden(raiz);
	}
	//Metodo para recorrido de preorden
	public static void preorden(Nodo r) {
		if (r != null) {
			r.visitar();
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	}
	//Metodo para recorrido de inorden
	public static void inorden(Nodo r) {
		if (r != null) {
			inorden(r.subarbolIzdo());
			r.visitar();
			inorden(r.subarbolDcho());
		}
	}
	//Metodo para recorrido postorden
	public static void postorden(Nodo r) {
		if (r != null) {
			postorden(r.subarbolIzdo());
			postorden(r.subarbolDcho());
			r.visitar();
		}
	}
}
