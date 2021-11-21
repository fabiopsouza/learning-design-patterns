package br.com.loja.alura.exception;

public class DomainExcetion extends RuntimeException {

    public DomainExcetion(String message) {
        super(message);
    }
}
