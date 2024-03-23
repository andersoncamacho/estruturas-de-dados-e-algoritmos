# Tipos básicos (tipos primitivos)

Os tipos dos objetos são determinados pela classe de origem.
Em nome da eficiência e da simplicidade, Java ainda oferece os
seguintes tipos básicos(também chamados de tipos primitivos), que não são objetos:

- **boolean** → valor booleano: true ou false
- **char** → caracter Unicode de 16 bits
- **byte** → inteiro com sinal em complemento de dois de 8 bits
- **short** → inteiro com sinal em complemento de dois de 16bits
- **int** → inteiro com sinal em complemento de dois de 32bits
- **long** → inteiro com sinal em complemento de dois de 64bits
- **float** →número de ponto flutuante de 32bits (IEEE 754-1985)
- **double** → número de ponto flutuante de 64bits (IEEE 754-1985)

Uma variável declarada como tendo um desses tipos simplesmente armazena um valor desse tipo,
em vez de uma referência para um objeto. Constantes inteiras, tais como 14 ou 195, são do tipo **int**,
a menos que seguidas de imediato por um “L” ou “l”, sendo, neste caso, do tipo **long.
** Constantes de ponto flutuante, como 3.1415 ou 2.158e5, são do tipo **double,** a menos que seguidas de
imediato por um “F” ou “f”, sendo, neste caso, do tipo **float**.
