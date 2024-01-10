Algoritmo "semnome"

Var
   salario, reajuste, salarioFinal : real

Inicio

   escreva("Salário:")
   leia(salario)

   se (salario < 500) entao
      reajuste <- ( 0.15 * salario) entao
      salarioFinal <- ( reajuste + salario)
      escreval("Reajuste:", reajuste)
      escreval("Salário Final:", salarioFinal)
   senao
      se (salario >= 500) e (salario<=1000) entao
      //se (salario<=1000) entao {{ não precisa do maior ou igual a 500
      //pois o salario ja foi estabelecido como menor do que 500 anteriormente}}
         reajuste <-( 0.10 * salario)
         salarioFinal <- (reajuste+salario)
         escreval("Reajuste:", reajuste)
         escreval("Salário Final:", salarioFinal )
      senao
         reajuste <- (0.05 * salario)
         salarioFinal <- (reajuste+salario)
         escreval("Reajuste:", reajuste)
         escreval("Salário Final:", salarioFinal)

      fimse
   fimse


Fimalgoritmo