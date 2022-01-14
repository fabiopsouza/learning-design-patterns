package br.com.loja.alura.pedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido gerado foi: " + pedido);
    }
}
