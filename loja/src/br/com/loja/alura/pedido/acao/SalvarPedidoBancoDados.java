package br.com.loja.alura.pedido.acao;

import br.com.loja.alura.pedido.AcaoAposGerarPedido;
import br.com.loja.alura.pedido.Pedido;

public class SalvarPedidoBancoDados implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvar pedido BD");
    }
}
