package br.com.loja.alura.pedido;

import br.com.loja.alura.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //constructor com injeção de dependencias:
    // PedidoRepository, EmailService

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
