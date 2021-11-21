package br.com.loja.alura;

import br.com.loja.alura.http.JavaHttpClient;
import br.com.loja.alura.orcamento.ItemOrcamento;
import br.com.loja.alura.orcamento.Orcamento;
import br.com.loja.alura.orcamento.RegistroDeOrcamento;

import java.io.IOException;
import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) throws IOException {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
