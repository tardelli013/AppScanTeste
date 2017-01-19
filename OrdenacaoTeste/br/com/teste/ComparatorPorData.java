package br.com.teste;

import java.util.Comparator;

public class ComparatorPorData implements Comparator<Estoque> {

	@Override
	public int compare(Estoque o1, Estoque o2) {
		return o1.getData().compareTo(o2.getData());
	}

}
