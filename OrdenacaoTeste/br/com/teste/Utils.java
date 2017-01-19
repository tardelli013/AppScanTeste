package br.com.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utils {

	public static Date converteStringParaDate(String date) throws ParseException{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse(date);
		
		return data;
	}
	
	public static String converteDataParaString(Date date){
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String reportDate = df.format(date);
		
		return reportDate;
	}
	
	public static List<Estoque> popularEstoque(){
		List<Estoque> list = new ArrayList<>();
		try {
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "SABONETE", "PORTO ALEGRE", 15));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "TOALHA", "PORTO ALEGRE", 6));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "SHAMPOO", "PORTO ALEGRE", 8));
	
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "SABONETE", "SÃO PAULO", 89));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "TOALHA", "SÃO PAULO", 3));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "SHAMPOO", "SÃO PAULO", 28));
			
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "SABONETE", "RIO DE JANEIRO", 55));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "TOALHA", "RIO DE JANEIRO", 99));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "SHAMPOO", "RIO DE JANEIRO", 123));
			
			list.add(new Estoque(Utils.converteStringParaDate("12/03/2016"), "SABONETE", "SALVADOR", 15));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2017"), "TOALHA", "SALVADOR", 6));
			list.add(new Estoque(Utils.converteStringParaDate("11/09/2014"), "SHAMPOO", "SALVADOR", 8));
			
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "SABONETE", "BRASILIA", 15));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "TOALHA", "BRASILIA", 6));
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "SHAMPOO", "BRASILIA", 8));
			
			list.add(new Estoque(Utils.converteStringParaDate("01/01/2016"), "SABONETE", "BELO HORIZONTE", 15));
			list.add(new Estoque(Utils.converteStringParaDate("01/02/2012"), "TOALHA", "BELO HORIZONTE", 6));
			list.add(new Estoque(Utils.converteStringParaDate("08/12/2015"), "SHAMPOO", "BELO HORIZONTE", 8));
			
			System.out.println("#### MASSA DE DADOS ADICIONADA PARA TESTE #### \n");
			for (Estoque estoque : list) {
				System.out.println(estoque);	
			}
	
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
