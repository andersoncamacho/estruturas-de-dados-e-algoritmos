package br.com.estudo;

public class Universe {
   public static void main(String[] args) {
       System.out.println("Hello Universe!");
   }
}

/*
Agora vamos dissecar a classe **Universe**:
- public
    - Isto diz que todo mundo pode executar este programa
- class
    - Todo código **Java** deve pertencer a uma classe
- Universe
    - Este é o nome da classe
- { }
    - As chaves indicam o início do corpo da classe e chaves para fechar o corpo da classe
- public
    - Isto diz que todo mundo pode executar este programa
- static
    - este método pertence a classe não ao objeto
- void
    - este método não retorna nada
- String[] args
    - Parâmetros passados para este método (neste caso, os argumentos da linha de comando passados
    como um arranjo de strings)
- System.out.println
    - Nome do método que se deseja chamar (neste caso, o método para imprimir strings na tela)
- ("Hello Universe!!!")
    - o parâmetro passado para o método (neste caso, o string que será impresso).
*/