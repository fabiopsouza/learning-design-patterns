package br.com.loja.alura.acao;

import br.com.loja.alura.pedido.AcaoAposGerarPedido;
import br.com.loja.alura.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviar email pedido");
    }
}
