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
			// a arvore esta vazia, portanto, o novo nodo sera a raiz da arvore.
			raiz = new NodoInt(valor);
		} else {
			// a arvore nao esta vazia, entao vamos procurar a posicao correta para o novo nodo.
			insert(raiz, valor);
		}
	}

	private void insert(NodoInt nodoAtual, int valor)
	{
		if (valor < nodoAtual.getValor()) {
			// descendo arvore para a esquerda.
			if (nodoAtual.getEsquerda() == null) {
				// encontrada a posicao do novo nodo.
				nodoAtual.setEsquerda(new NodoInt(valor));
			} else {
				// segue descendo arvore para a esquerda.
				insert(nodoAtual.getEsquerda(), valor);
			}
		} else if (valor > nodoAtual.getValor()) {
			// descendo arvore para a direita.
			if (nodoAtual.getDireita() == null) {
				// encontrada a posicao do novo nodo.
				nodoAtual.setDireita(new NodoInt(valor));
			} else {
				// segue descendo arvore para a direita.
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
