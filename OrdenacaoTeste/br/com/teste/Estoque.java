package br.com.teste;

import java.util.Date;

public class Estoque {

	Date data;
	String produto, unidade;
	int qntTotal;

	public Estoque(Date data, String produto, String unidade, int qntTotal) {
		super();
		this.data = data;
		this.produto = produto;
		this.unidade = unidade;
		this.qntTotal = qntTotal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public int getQntTotal() {
		return qntTotal;
	}

	public void setQntTotal(int qntTotal) {
		this.qntTotal = qntTotal;
	}

	@Override
	public String toString() {
		return "[Data = " + Utils.converteDataParaString(data) + ", Produto = " + produto + ", Unidade = " + unidade + ", Quantidade Total = " + qntTotal + "]";
	}
	
}
