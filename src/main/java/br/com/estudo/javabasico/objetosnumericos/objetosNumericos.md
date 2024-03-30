## Objetos numéricos

As vezes precisamos armazer números como objetos, mas os tipos 
básicos(**tipos primitivos**) não são objetos. Para contornar 
esse problema, Java define uma classe especial para cada tipo 
básico numérico. Essas classes são chamadas de **classes numéricas.**

| Tipo base | Nome da classe | Exemplo de criação | Exemplo de acesso |
| --- | --- | --- | --- |
| byte | Byte | n = new Byte((byte)34); | n.byteValue(); |
| short | Short | n = new Short((short)100); | n.shortValue(); |
| int | Integer | n = new Integer(1045); | n.intValue(); |
| long | Long | n = new Long(1084L); | n.longValue(); |
| float | Float | n = new Float(3.934F); | n.floatValue(); |
| double | Double | n = new Double(3.934); | n.doubleValue(); |

