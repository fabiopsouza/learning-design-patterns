package br.com.loja.alura;

import br.com.loja.alura.http.JavaHttpClient;
import br.com.loja.alura.orcamento.Orcamento;
import br.com.loja.alura.orcamento.RegistroDeOrcamento;

import java.io.IOException;
import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) throws IOException {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
