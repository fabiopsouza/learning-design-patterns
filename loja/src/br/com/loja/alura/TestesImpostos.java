package br.com.loja.alura;

import java.math.BigDecimal;

import br.com.loja.alura.imposto.CalculadoraDeImpostos;
import br.com.loja.alura.imposto.ICMS;
import br.com.loja.alura.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ICMS());
		
		System.out.println(imposto);
	}
}
