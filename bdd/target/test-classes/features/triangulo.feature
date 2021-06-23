# language: pt

Funcionalidade: Testar a validacao de três números para ver se formam um triangulo e o tipo de triangulo formado
  O sistema deve receber tres numeros inteiros e dizer se e possivel criar um triangulo com eles ou nao
  Caso seja possivel, o sistema informa o tipo do triangulo formado com os tres numeros

  Cenario: Testar números que não formam um triângulo valido
    Dado tres numeros 2, 3 e 7
    Quando verifico se eles formam um triangulo
    Entao nao formam um triangulo

  Cenario: Testar números que formam um triangulo equilatero
    Dado tres numeros 6, 6 e 6
    Quando verifico se eles formam um triangulo
    Entao formam um triangulo equilatero

  Cenario: Testar números que formam um triangulo isosceles
    Dado tres numeros 6, 6 e 8
    Quando verifico se eles formam um triangulo
    Entao formam um triangulo isosceles

  Cenario: Testar números que formam um triangulo escaleno
    Dado tres numeros 3, 4 e 5
    Quando verifico se eles formam um triangulo
    Entao formam um triangulo escaleno
