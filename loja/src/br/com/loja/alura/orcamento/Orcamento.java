package br.com.loja.alura.orcamento;

import br.com.loja.alura.orcamento.situacao.Aprovado;
import br.com.loja.alura.orcamento.situacao.EmAnalise;
import br.com.loja.alura.orcamento.situacao.Finalizado;
import br.com.loja.alura.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private List<Orcavel> itens;

	private SituacaoOrcamento situacao = new EmAnalise();

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
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
		return itens.size();
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao){
		this.situacao = situacao;
	}

    public boolean isFinalizado() {
		return situacao instanceof Finalizado;
    }

	public void adicionarItem(Orcavel item){
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
}
