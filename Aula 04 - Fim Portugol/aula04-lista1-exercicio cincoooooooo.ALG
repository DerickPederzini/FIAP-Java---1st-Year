Algoritmo "semnome"

Var
   numero, maior, menor, c : inteiro

Inicio

   escreval("Digite 10 números: ")

   c <-1
   enquanto c < 10 faca
      leia(numero)

      se c = 1 entao
         maior<-numero
         menor<-numero
      fimse

      se numero > maior entao
         maior <- numero
      fimse

      se numero < menor entao
         menor <- numero

      fimse

      c<-c+1
   fimenquanto

   escreval("Maior número:", maior ," Menor número:", menor)

Fimalgoritmo