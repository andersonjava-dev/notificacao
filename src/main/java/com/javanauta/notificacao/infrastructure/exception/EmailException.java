package com.javanauta.notificacao.infrastructure.exception;

public class EmailException extends RuntimeException{

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
    public EmailException(String mensagem){
        super(mensagem);
    }
}
