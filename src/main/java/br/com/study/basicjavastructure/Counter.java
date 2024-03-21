package br.com.study.basicjavastructure;
/*
## **Como as classes são declaradas**
Resumindo, um **objeto** é uma combinação específica de dados e dos métodos capazes de processar e comunicar esses dados.
As classes definem os **tipos** dos objetos; por isso, objetos também são chamados de instâncias da classe
que os define e usam o nome da classe como seu tipo.
 */
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
