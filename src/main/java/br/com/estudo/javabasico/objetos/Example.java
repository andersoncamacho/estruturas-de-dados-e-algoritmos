package br.com.estudo.javabasico.objetos;

import br.com.estudo.javabasico.classe.Counter;

public class Example {
    public static void main(String[] args) {
        Counter c;
        Counter d = new Counter();
        c = new Counter();
        d = c;
    }
}
