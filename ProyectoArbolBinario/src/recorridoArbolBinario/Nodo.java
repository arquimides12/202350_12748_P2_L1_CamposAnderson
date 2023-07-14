package recorridoArbolBinario;

public class Nodo {
	private Object valor;
	private Nodo subarbolIzdo;
	private Nodo subarbolDcho;

	public Nodo(int valor) {
		this.valor = valor;
		this.subarbolIzdo = null;
		this.subarbolDcho = null;
	}

	public void visitar() {
		System.out.print(valor + " ");
	}

	public Nodo subarbolIzdo() {
		return subarbolIzdo;
	}

	public Nodo subarbolDcho() {
		return subarbolDcho;
	}

	public void setSubarbolIzdo(Nodo subarbolIzdo) {
		this.subarbolIzdo = subarbolIzdo;
	}

	public void setSubarbolDcho(Nodo subarbolDcho) {
		this.subarbolDcho = subarbolDcho;
	}
}
