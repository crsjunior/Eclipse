package estruturas;

public class Nodo<T extends Comparable<T>> implements Comparable<T>
{
	private T dado;
	private Nodo<T> esquerda;
	private Nodo<T> direita;
	private int altura;

	public Nodo()
	{

	}

	public Nodo(T dado)
	{
		this.dado = dado;
	}

	public T getDado()
	{
		return dado;
	}

	public void setDado(T dado)
	{
		this.dado = dado;
	}

	public Nodo<T> getEsquerda()
	{
		return esquerda;
	}

	public void setEsquerda(Nodo<T> esquerda)
	{
		this.esquerda = esquerda;
	}

	public Nodo<T> getDireita()
	{
		return direita;
	}

	public void setDireita(Nodo<T> direita)
	{
		this.direita = direita;
	}

	public int getAltura()
	{
		return altura;
	}

	public void setAltura(int altura)
	{
		this.altura = altura;
	}

	@Override
	public int compareTo(T dado)
	{
		return this.dado.compareTo(dado);
	}
}
