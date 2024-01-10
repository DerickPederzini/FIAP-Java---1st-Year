Algoritmo "multipla escolha"
Var
   preco: real
   codigo: inteiro

Inicio
   escreva("Digite o preço:")
   leia(preco)
   escreva("digite a origem:")
   leia(codigo)

   Escolha codigo
   Caso 1
      escreva("Preço:", preco," - origem Sul")
   Caso 2
      escreva("Preço:", preco, " - origem Norte")
   Caso 3
      escreva("Preço:", preco, " - origem Leste")
   Caso 4
      escreva("Preço:", preco, " - origem Oeste")
   Caso 7 até 9
      escreva ("Preço:", preco, " - origem Sudeste")
   Caso 10 até 20
      escreva("Preço:", preco, " - origem Centro-Oeste")
   Caso 5,6, 25 até 30
      escreva("Preço:", preco, " - origem Nordeste")
   Outrocaso
      escreva("Produto Importado")

   FimEscolha

Fimalgoritmo