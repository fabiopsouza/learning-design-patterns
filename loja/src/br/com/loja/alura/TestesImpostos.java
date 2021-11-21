package br.com.loja.alura;

import java.math.BigDecimal;

import br.com.loja.alura.imposto.CalculadoraDeImpostos;
import br.com.loja.alura.imposto.ICMS;
import br.com.loja.alura.imposto.ISS;
import br.com.loja.alura.orcamento.ItemOrcamento;
import br.com.loja.alura.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ICMS(new ISS(null)));
		
		System.out.println(imposto);
	}
}
