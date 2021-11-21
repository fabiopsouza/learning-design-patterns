package br.com.loja.alura.orcamento.situacao;

import br.com.loja.alura.exception.DomainExcetion;
import br.com.loja.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainExcetion("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainExcetion("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainExcetion("Orçamento não pode ser finalizado");
    }
}
