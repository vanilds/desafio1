package br.com.itau;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;

public class Exercicio {

	public static void main(String[] args) {
	List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
	
        // ordenar por mes 
		lancamentos.stream().sorted((p1, p2) -> p1.getMes().compareTo(p2.getMes()))
		// selecionar apenas uma unica categoria 
		.filter(c -> c.getCategoria() == 1)
		.forEach(p -> System.out.println(p));

	}
	//mostrar o total da fatura de um mes especifico
	public static void totalFatura() {
		 
		List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
		lancamentos.stream()
				 .filter(c -> c.getMes() == 1)
				 .map(Lancamento::getValor)
				 .forEach(valor -> {
					 // valor(BigDecimal.ZERO);
				 });
		
		System.out.println(lancamentos);
		}
	

		

	
	}
		
