package br.com.loja.alura;

import br.com.loja.alura.pedido.LogDePedido;
import br.com.loja.alura.pedido.acao.EnviarEmailPedido;
import br.com.loja.alura.pedido.acao.SalvarPedidoBancoDados;
import br.com.loja.alura.pedido.AcaoAposGerarPedido;
import br.com.loja.alura.pedido.GeraPedido;
import br.com.loja.alura.pedido.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestePedidos {

    public static void main(String[] args) {

        String cliente = "teste";
        BigDecimal valorOrcamento = new BigDecimal("10");
        int quantidadeItens = 1;

        List<AcaoAposGerarPedido> acoes = Arrays.asList(
                new EnviarEmailPedido(),
                new SalvarPedidoBancoDados(),
                new LogDePedido());

        GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        new GeraPedidoHandler(acoes).execute(dados);
    }
}
