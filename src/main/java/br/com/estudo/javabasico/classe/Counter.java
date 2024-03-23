package br.com.estudo.javabasico.classe;

public class Counter {
    //uma simples variável de instância inteira
    protected int count;
    //O construtor default para um objeto Counter
    Counter() {
        count = 0;
    }
    //Um método de acesso para recuperar o valor corrente do contador
    public int getCount() {
        return count;
    }
    //Um método modificador para incrementar o contador
    public void incrementCounter() {
        count++;
    }
    //Um método modificador para decrementar o contador
    public void decrementCounter() {
        count--;
    }
}
