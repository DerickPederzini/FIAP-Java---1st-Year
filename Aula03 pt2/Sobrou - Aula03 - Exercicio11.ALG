Algoritmo "semnome"

Var
   valor1, valor2, valor3 : inteiro

Inicio
   escreva("Informe o 1º número:")
   leia(valor1)
   escreva("Informe o 2º número:")
   leia(valor2)
   escreva("Informe o 3º número:")
   leia(valor3)

   se (valor1 = valor2) ou (valor1 = valor3) ou (valor2 = valor3) entao
      escreva("Números Iguais")
   senao
      se (valor1 > valor2) e (valor1 > valor3) entao
         se (valor2 > valor3) entao
            escreva("Ordem:", valor1,"," ,valor2,"," ,valor3)
         senao
            escreva("Ordem:", valor1,"," ,valor3,"," ,valor2)
         fimse
      fimse
   fimse

   se (valor2 > valor1) e (valor2> valor3) entao
      se (valor1 > valor3) entao
         escreva("Ordem:", valor2,"," ,valor1,"," ,valor3)
      senao
         escreva("Ordem:", valor2, "," ,valor3, "," ,valor1)
      fimse
   fimse

   se (valor3 > valor1) e (valor3 > valor2) entao
      se (valor2 > valor1) entao
         escreva("Ordem:", valor3, "," ,valor2, "," ,valor1)
      senao
         escreva("Ordem:", valor3, "," ,valor1, "," ,valor2)

      fimse
   fimse

Fimalgoritmo