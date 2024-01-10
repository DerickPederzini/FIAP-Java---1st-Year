Algoritmo "semnome"

Var
   x: inteiro
   p : caracter

Inicio

   p <- "sim"

   enquanto (p = "sim") ou (p = "s") faca
      leia(x)
      x<- x*3
      escreval("O número multiplicado",x)

      escreva("Deseja continuar:")
      leia(p)
   fimenquanto

Fimalgoritmo