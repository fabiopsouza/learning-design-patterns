package br.com.loja.alura.orcamento.situacao;

import br.com.loja.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {

    private BigDecimal valor;

    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor(){
        if(valor == null) {
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }
}
