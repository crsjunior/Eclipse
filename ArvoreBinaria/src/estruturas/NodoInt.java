package estruturas;

public class NodoInt
{
	private int valor = 0;
	private NodoInt esquerda = null;
	private NodoInt direita = null;
	private int altura = 0;

	public NodoInt()
	{
	}

	public NodoInt(int valor)
	{
		this.valor = valor;
	}

	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)
	{
		this.valor = valor;
	}

	public NodoInt getEsquerda()
	{
		return esquerda;
	}

	public void setEsquerda(NodoInt esquerda)
	{
		this.esquerda = esquerda;
	}

	public NodoInt getDireita()
	{
		return direita;
	}

	public void setDireita(NodoInt direita)
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
}
