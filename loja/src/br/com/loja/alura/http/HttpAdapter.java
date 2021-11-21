package br.com.loja.alura.http;

import java.io.IOException;
import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados) throws IOException;
}
