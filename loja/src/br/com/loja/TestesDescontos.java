package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.alura.desconto.CalculadoraDeDescontos;
import br.com.loja.alura.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 6);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal imposto = calculadora.calcular(orcamento);
		
		System.out.println(imposto);
	}
}
