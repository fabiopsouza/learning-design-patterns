package br.com.loja.alura;

import br.com.loja.alura.acao.EnviarEmailPedido;
import br.com.loja.alura.acao.SalvarPedidoBancoDados;
import br.com.loja.alura.orcamento.Orcamento;
import br.com.loja.alura.pedido.AcaoAposGerarPedido;
import br.com.loja.alura.pedido.GeraPedido;
import br.com.loja.alura.pedido.GeraPedidoHandler;
import br.com.loja.alura.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TestePedidos {

    public static void main(String[] args) {

        String cliente = "teste";
        BigDecimal valorOrcamento = new BigDecimal("10");
        int quantidadeItens = 1;

        List<AcaoAposGerarPedido> acoes = Arrays.asList(
                new EnviarEmailPedido(),
                new SalvarPedidoBancoDados());

        GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        new GeraPedidoHandler(acoes).execute(dados);
    }
}
