package br.com.loja.alura;

import br.com.loja.alura.orcamento.ItemOrcamento;
import br.com.loja.alura.orcamento.Orcamento;
import br.com.loja.alura.orcamento.situacao.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
    }
}
