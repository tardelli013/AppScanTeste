package br.com.teste;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TesteMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		List<Estoque> estoque = Utils.popularEstoque();

		Scanner ler = new Scanner(System.in);

		String data;
		Date dataConvertida;
		int produto;
		int ordenacao;

		System.out.printf("\nInsira uma Data no formato DD/MM/YYYY exemplo: 01/11/2017 ou T para 'todas' as Datas\n");
		data = ler.next();

		if (!data.equalsIgnoreCase("T")) {
			try {
				dataConvertida = Utils.converteStringParaDate(data);
			} catch (ParseException e) {
				System.out.println("Atenção o formato da data é inválido \n");
				main(null);
				ler.close();
				return;
			}
		}

		System.out.printf("Insira o código de um dos Produtos: \n 1 - SABONETE \n 2 - TOALHA \n 3 - SHAMPOO \n 0 - TODOS PRODUTOS \n ");
		produto = ler.nextInt();
		String produtoNome = produto == 1 ? "SABONETE" : produto == 2 ? "TOALHA" : produto == 3 ? "SHAMPOO" : "";

		System.out.printf("Informe o codigo da Ordenação: \n 1 - por data \n 2 - por produto \n");
		ordenacao = ler.nextInt();

		List<Estoque> listaParaImpressao = new ArrayList<>();
		for (Estoque st : estoque) {
			if (!produtoNome.equalsIgnoreCase("") && !data.equalsIgnoreCase("T")) {
				if (st.getProduto().equalsIgnoreCase(produtoNome) && data.equalsIgnoreCase(Utils.converteDataParaString(st.getData()))) {
					listaParaImpressao.add(st);
				}
			} else if (!data.equalsIgnoreCase("T")) {
				if (data.equalsIgnoreCase(Utils.converteDataParaString(st.getData()))) {
					listaParaImpressao.add(st);
				}
			} else if (!produtoNome.equalsIgnoreCase("")) {
				if (st.getProduto().equalsIgnoreCase(produtoNome)) {
					listaParaImpressao.add(st);
				}
			} else {
				listaParaImpressao.add(st);
			}

		}

		if (ordenacao == 1) {// ordenar por dada
			ComparatorPorData comparatorPorData = new ComparatorPorData();
			Collections.sort(listaParaImpressao, comparatorPorData);
		} else if (ordenacao == 2) {// ordenacao por produto
			ComparatorPorProduto comparatorPorProduto = new ComparatorPorProduto();
			Collections.sort(listaParaImpressao, comparatorPorProduto);
		} else {
			System.out.println("\nOrdenação inválida, resultado não será ordenado.\n");
		}

		for (Estoque estoque2 : listaParaImpressao) {
			System.out.println(estoque2);
		}

		System.out.printf("\n Digite 0 para reiniciar \n");
		int reiniciar = ler.nextInt();
		
		if (reiniciar == 0) {
			main(null);
			ler.close();
			return;
		}
		
		ler.close();
	}

}
