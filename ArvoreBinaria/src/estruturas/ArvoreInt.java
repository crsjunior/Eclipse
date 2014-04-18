package estruturas;

public class ArvoreInt
{
	private NodoInt raiz = null;
	private int contador = 0;

	public NodoInt getRaiz()
	{
		return raiz;
	}

	public int getContador()
	{
		return contador;
	}

	public void insert(int valor)
	{
		if (raiz == null) {
			raiz = new NodoInt(valor);
		} else {
			insere(raiz, valor);
		}
	}
	
	private void insere(NodoInt nodoAtual, int valor)
	{
		NodoInt nodo = null;
		if (valor < nodoAtual.getValor()) {
			nodo = nodoAtual.getEsquerda();
			if (nodo == null) {
				nodoAtual.setEsquerda(new NodoInt(valor));
			}
		} else if (valor > nodoAtual.getValor()) {
			nodo = nodoAtual.getDireita();
			if (nodo == null) {
				nodoAtual.setDireita(new NodoInt(valor));
			}
		}
		if (nodo != null) {
			insere(nodo, valor);
		}
	}
	
//	private void insere(NodoInt nodoAtual, int valor)
//	{
//		NodoInt nodo = null;
//		if (valor < nodoAtual.getValor()) {
//			nodo = nodoAtual.getEsquerda();
//			if (nodo == null) {
//				nodoAtual.setEsquerda(new NodoInt(valor));
//			}
//		} else if (valor > nodoAtual.getValor()) {
//			nodo = nodoAtual.getDireita();
//			if (nodo == null) {
//				nodoAtual.setDireita(new NodoInt(valor));
//			}
//		}
//		if (nodo != null) {
//			insere(nodo, valor);
//		}
//	}
	
	private void insert(NodoInt nodoAtual, int valor)
	{
		// se o valor < valor do nodoAtual, insere na esquerda.
		if (valor < nodoAtual.getValor()) {
			if (nodoAtual.getEsquerda() == null) {
				nodoAtual.setEsquerda(new NodoInt(valor));
			} else {
				insert(nodoAtual.getEsquerda(), valor);
			}
		// se o valor for > valor do nodoAtual, insere na direita.
		} else if (valor > nodoAtual.getValor()) {
			if (nodoAtual.getDireita() == null) {
				nodoAtual.setDireita(new NodoInt(valor));
			} else {
				insert(nodoAtual.getDireita(), valor);
			}
		}
	}

	public void remove(NodoInt nodo)
	{

	}

	public NodoInt search(int valor)
	{
		this.contador = 0;
		return search(raiz, valor);
	}
	
	private NodoInt search(NodoInt nodo, int valor)
	{
		if (nodo == null) {
			return null;
		}
		if (valor < nodo.getValor()) {
			++contador;
			return search(nodo.getEsquerda(), valor);
		} else if (valor > nodo.getValor()) {
			++contador;
			return search(nodo.getDireita(), valor);
		} else {
			return nodo;
		}
	}

	public NodoInt searchRaiz(NodoInt nodo)
	{
		throw new UnsupportedOperationException();
	}

	public void preOrder(NodoInt nodoRaiz)
	{
		if (nodoRaiz == null) {
			return;
		}
		System.out.println(nodoRaiz.getValor());
		preOrder(nodoRaiz.getEsquerda());
		preOrder(nodoRaiz.getDireita());
	}

	public void inOrder(NodoInt nodoRaiz)
	{
		if (nodoRaiz == null) {
			return;
		}
		inOrder(nodoRaiz.getEsquerda());
		System.out.println(nodoRaiz.getValor());
		inOrder(nodoRaiz.getDireita());
	}

	public void postOrder(NodoInt nodoRaiz)
	{
		if (nodoRaiz == null) {
			return;
		}
		postOrder(nodoRaiz.getEsquerda());
		postOrder(nodoRaiz.getDireita());
		System.out.println(nodoRaiz.getValor());
	}
}
