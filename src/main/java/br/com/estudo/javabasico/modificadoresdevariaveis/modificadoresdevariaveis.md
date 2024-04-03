## Modificadores de variáveis

Em alguns casos, o acesso direto a uma variável de instância de um objeto 
pode não estar habilitado. Por exemplo, uma variável de instância 
declarada como ***private*** em alguma classe só pode ser acessada pelo 
método definidos dentro da classe. Tais variáveis de instâncias são 
parecidas com parâmetros de dispositivo que não pode ser acessados 
diretamente pelo controle remoto. Por exemplo, alguns dispositivos têm 
parâmetros internos que só podem ser lidos ou alterados pelo técnico da 
fábrica(e o úsuario não está autorizado a alterá-los, sem violar a 
garantia do dispositivo).

Quando se declara uma variável de instância, pode-se, opcionalmente, 
definir um modificador de variável, seguido pelo tipo e identificador 
daquela variável.

Além disso, também é opcional atribuir um valor inicial para a 
variável(usando o operador de atribuição “=” ). As regras para o 
nome de variável são as mesmas de qualquer outro indentificador Java. 
O tipo da variável pode ser tanto um tipo básico, indicando que a 
variável armazena valores daquele tipo, ou um nome de uma classe, 
indicando que a variável é uma ***referência*** para um objeto 
desta classe. Por fim, o valor inicial opcional que se pode atribuir a 
uma variável de instância deve combinar com o tipo de variável. 
Como por exemplo, definiu-se a classe ***Gnome***, que contém 
várias definições de variáveis de instâncias.

O ***escopo*** (ou visibilidade) de uma variável de instância pode 
ser controlado pelo uso dos seguintes ***modificadores de variáveis:***

- public: qualquer um pode acessar variáveis de instâncias públicas.
- protected: apenas métodos do mesmo pacote ou subclasse podem acessar 
- variáveis de instâncias protegidas.
- private: apenas métodos da mesma classe(excluindo métodos de uma 
- subclasee) podem acessar variáveis de instâncias privadas.
- Se nenhum dos modificadores  acima for usado, então a variável de 
- instância é considerada amigável. Variáveis de instâncias amigáveis 
- podem ser acessadas por qualquer classe no mesmo pacote.

Além dos modificadores de escopo de variável, existem também os 
seguintes modificadores de uso:

- static: a palavra static é usada para declarar  uma variável que é associada com a classe, não com instâncias individuais daquela classe. Variáveis static são usadas para armazenar informações globais sobre a classe(por exemplo, uma variável static pode ser usada para armazenar a quantidade total de objetos Gnome criados). Variáveis static existem mesmo se nenhuma instância de sua classe for criada.
- final: uma variável de instância final é um tipo de variável para qual se ***deve*** atribuir um valor inicial, e para a qual, a partir de então, não é possivel atribuir um novo valor. Se for de um tipo básico, então é uma constante(como a constante MAX_HEIGHT na classe Gnome). Se uma variável objeto é ***final,*** então irá sempre se referir ao mesmo objeto(mesmo se o objeto alterar seu estado interno).