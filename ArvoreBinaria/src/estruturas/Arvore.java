package estruturas;

public class Arvore<T extends Comparable<T>>
{
	private Nodo<T> raiz;

	public Arvore()
	{
		this.raiz = null;
	}

	public Nodo<T> getRaiz()
	{
		return raiz;
	}

	public void insert(Nodo<T> nodo)
	{
		
	}

	public void remove(Nodo<T> nodo)
	{

	}

	public Nodo<T> search(T dado)
	{

		throw new UnsupportedOperationException();
	}

	public Nodo<T> searchRaiz(Nodo<T> nodo)
	{
		throw new UnsupportedOperationException();
	}
}
