package controller;

import estruturas.ArvoreInt;
import estruturas.NodoInt;

public class TesteA
{
	public static void main(String[] args)
	{
		ArvoreInt a = new ArvoreInt();
		
//		a.insert(10);
//		a.insert(5);
//		a.insert(4);
//		a.insert(12);
//		a.insert(17);
//		a.insert(23);
//		a.insert(14);
		
//		a.insere(a.getRaiz(), 10);
//		a.insere(a.getRaiz(), 5);
//		a.insere(a.getRaiz(), 4);
//		a.insere(a.getRaiz(), 12);
//		a.insere(a.getRaiz(), 17);
//		a.insere(a.getRaiz(), 23);
//		a.insere(a.getRaiz(), 14);
		
		a.insert(10);
		a.insert(5);
		a.insert(4);
		a.insert(12);
		a.insert(17);
		a.insert(23);
		a.insert(14);
		a.insert(13);
		
		a.preOrder(a.getRaiz());
		System.out.println();
		a.inOrder(a.getRaiz());
		System.out.println();
		a.postOrder(a.getRaiz());
		System.out.println();
		int valor = 4;
		NodoInt busca = a.search(valor);
		if (busca != null) {
			System.out.println("Encontrado: " + String.valueOf(busca.getValor()));
		} else {
			System.out.println("Nao encontrado: " + String.valueOf(valor));
		}
		System.out.println("Niveis percorridos para concluir a busca: " + String.valueOf(a.getContador()));
		
		
//		System.out.println(a.getRaiz().getValor());
//		System.out.println(a.getRaiz().getDireita().getDireita().getValor());
//		System.out.println(a.getRaiz().getDireita().getDireita().getEsquerda().getValor());
//		System.out.println(a.getRaiz().getDireita().getValor());
	}
}
