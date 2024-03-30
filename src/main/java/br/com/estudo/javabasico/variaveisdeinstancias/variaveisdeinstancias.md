## Variáveis de instância

Classes Java podem definir ***variáveis de instância***, também chamadas 
de ***campos***.

Essas variáveis representam os dados associados com os objetos de 
uma classe. As variáveis de instâncias devem ser do ***tipo***, 
que pode tanto ser um ***tipo básico/tipos primitivos***(como **int**, 
**float**, **double**) ou um ***tipo de referência***(como na analogia do 
controle remoto), isto é, uma classe, como String; uma interface 
ou um arranjo.

Uma instância de variável de um tipo básico armazena um valor do tipo básico, 
enquanto variáveis de instâncias, declaradas usando-se um nome de classe, 
armazenam uma ***referência*** para um objeto daquela classe.

Continuando com a analogia entre variáveis referência e controles remotos, 
variáveis de instâncias são como parâmetros do dispositivo que podem tanto 
ser lidos, como alterados usando-se o controle remoto 
(tais como os controles de volume e canal do controle remoto 
de uma televisão). Dada uma variável referência *v,* que aponta para 
um o objeto *o*, pode-se acessar qualquer uma das variáveis de 
instâncias de *o* que as regras de acesso permitirem. Por exemplo, 
variáveis de instâncias ***publicas*** podem ser acessadas por 
qualquer pessoa. Usando o operador ponto, pode-se obter o valor de 
qualquer variável  de instância,*i,* usando-se *v.* *i* em uma expressão 
aritmética. Da mesma forma, pode-se alterar o valor de qualquer variável 
de instância *i* escrevendo *v*.*i* no lado **esquerdo do operador 
de atribuição **(”=”).**

Por exemplo, se gnome se refere a um objeto Gnome que tem variáveis 
de instâncias públicas name e age, então os seguintes comandos
são possíveis:

- *gnome.name = ”Professor Smythe”*
- *gnome.age = 132;*

Entretanto, uma referência para objeto não temde ser apenas uma variável 
referência; pode ser qualuqer expressão que retorna uma referência para 
objeto.