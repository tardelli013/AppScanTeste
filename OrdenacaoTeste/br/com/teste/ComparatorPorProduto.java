package br.com.teste;

import java.util.Comparator;

public class ComparatorPorProduto implements Comparator<Estoque> {

	@Override
	public int compare(Estoque o1, Estoque o2) {
		return o1.getProduto().compareTo(o2.getProduto());
	}

}
