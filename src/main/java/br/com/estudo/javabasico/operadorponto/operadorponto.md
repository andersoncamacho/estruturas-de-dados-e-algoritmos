## Operador ponto

Toda variável referência para objeto deve referir-se a algum objeto, a menos 
que seja **null**, caso em que não aponta para nada. Seguindo com a 
analogia do controle remoto, uma referência **null** é um suporte de 
controle remoto vazio. Inicialmente, a menos que se faça a variável 
referência apontar para alguma coisa por meio de uma atribuição, 
ela é **null**.

Pode haver, na verdade, várias referências para um mesmo objeto, 
e cada referência para um objeto específico pode ser usada para 
chamar métodos daquele objeto.

Essa situação é equivalente a existirem vários controles remotos capazes 
de atuar sobre o mesmo dispositivo. Qualquer um dos controles pode ser 
usado para fazer alterações no dispositivo(como alterar canal da televisão).
Observe que, se um controle remoto é usado para alterar o dispositivo, 
então o (único) objeto apontado por todos os controles se altera. 
Da mesma forma, se uma variável referência for usada para alterar o estado 
do objeto, então seu estado muda para todas as referrências.

Esse comportamento vem do fato de que são muitas referências, 
mas todas apontadas para o mesmo objeto.

Um dos principais usos de uma variável referência é acessar os membros da 
classe à qual pertence o objeto, a instância da classe. 
Ou seja, uma variável referência é útil para acessar os métodos e as 
variáveis de instância associadas com um objeto.

Esse acesso é feito pelo operador **(”.”)**. Chama-se um método associado 
com um objeto usando o nome da variável referência seguido do operador 
ponto, e então o nome do método e seus parâmetros.

Isso ativa o método com o nome especificado associado ao objeto 
referenciado pela variável referência. De maneira opcional, podem ser 
passados vários parâmetros.

Se existirem vários métodos com o mesmo nome definido para este objeto, 
então a maquina de execução java irá usar aquele cujo número de 
parâmetros e tipos melhor combinam. O nome de um método combinado 
com a quantidade e o tipo de seus parâmetros chama-se ***assinatura***  
do método, uma vez que todas essas partes são usadas para determinar o 
método correto para executar uma certa chamada de método. 
Considerem-se os seguintes exemplos:

- **oven.cookDinner();**
- **oven.cookDinner(food);**
- **oven.cookDinner(food, seasoning);**

Cada uma dessas chamadas se refere, na verdade, a métodos diferentes, 
definidos com o mesmo nome na classe a qual pertecem. Observa-se, 
entretanto, que a assinatua de um método em java não inclui o tipo 
de retorno do método, de maneira que Java não permite que dois métodos 
com a mesma assinatura retornem tipos diferentes.