package br.com.loja.alura;

import java.math.BigDecimal;

import br.com.loja.alura.desconto.CalculadoraDeDescontos;
import br.com.loja.alura.orcamento.ItemOrcamento;
import br.com.loja.alura.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		orcamento.aprovar();
		orcamento.aplicarDescontoExtra();
		orcamento.aplicarDescontoExtra();
		orcamento.aplicarDescontoExtra();

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal imposto = calculadora.calcular(orcamento);

		System.out.println(imposto);
	}
}
