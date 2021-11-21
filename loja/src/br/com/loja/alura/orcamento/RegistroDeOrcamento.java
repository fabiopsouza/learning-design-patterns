package br.com.loja.alura.orcamento;

import br.com.loja.alura.exception.DomainExcetion;
import br.com.loja.alura.http.HttpAdapter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) throws IOException {

        if(!orcamento.isFinalizado()){
            throw new DomainExcetion("Orcamento não finalizado");
        }

        String url = "htto://api.externa/orcamento";
        Map<String, Object> dados = new HashMap() {{
            put("valor", orcamento.getValor());
            put("quantidade", orcamento.getQuantidadeItens());
        }};

        http.post(url, dados);
    }
}
