Algoritmo "semnome"

Var
   produto: caracter
   valorp, subtotal, total : real
   quantiap, contador : inteiro

Inicio

   para contador de 1 ate 2 faca
      escreva("Digite o Produto:")
      leia(produto)
      escreva("Digite o Valor:")
      leia(valorp)
      escreva("Quantia:")
      leia(quantiap)

      subtotal<- valorp * quantiap
      escreval("---------------------")
      escreval("Subtotal:", subtotal)
      escreval("---------------------")

      total<- total + subtotal

   fimpara

   se total>100 entao
      escreval("Total geral:", total*0.9)
      escreval("---------------------")
   senao
      escreval("Total Gerak:", total)
      escreval("---------------------")
   fimse


Fimalgoritmo