Em java, um objeto novo é criado a partir de uma classe usando-se 
o operador **new**. O operador **new** cria um novo objeto a partir de uma 
classe especifica e retorna uma ***referência*** para este objeto. 
Para criar um objeto de um tipo específico, deve-se seguir o 
uso do operador **new** por uma chamada a um construtor daquele 
tipo de objeto.

Pode-se usar qualquer construtor que faça parte da definição da classe, 
incluindo o construtor default(que não recebe argumentos 
entre os parênteses).

A chamada do operador **new** sobre um tipo de classe faz com que 
ocorram três eventos:

- Um novo objeto é dinamicamente alocado na mémoria, e todas as variáveis de instâncias são inicializadas com seus valores padrão. Os valores padrão são **null** para variáveis objeto e 0 para todos os tipos base, exceto as variáveis **boolean** (que são **false** por default).
- O construtor para o novo objeto é chamado com os parâmetros especificos. O construtor atribui valores significativos para as variáveis de instâncias e executa as computações adicionais que devam ser feitas par criar este objeto.
- Depois do construtor retornar, o operador **new** retorna uma referência(isto é, um endereço de memória) para o novo objeto recém-criado. Se a expressão está na forma de uma atribuição, então este endereço é armazenado na variável objeto, e a variável objeto passa a **referir** o objeto recém-criado.