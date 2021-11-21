package br.com.loja.alura.orcamento;

import br.com.loja.alura.orcamento.situacao.Aprovado;
import br.com.loja.alura.orcamento.situacao.EmAnalise;
import br.com.loja.alura.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	
	private int quantidadeItens;

	private SituacaoOrcamento situacao = new EmAnalise();

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprovar(){
		this.situacao.aprovar(this);
	}

	public void reprovar(){
		this.situacao.reprovar(this);
	}

	public void finalizar(){
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao){
		this.situacao = situacao;
	}
}
