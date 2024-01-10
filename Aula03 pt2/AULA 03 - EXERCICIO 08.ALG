Algoritmo "semnome"

Var
   salario : real
   aliquota : real
   totalSalario : real
Inicio
   escreva("Salário Bruto:")
   leia(salario)

   se (salario> 0.01) e (salario <1302.01) entao
      aliquota<- salario*0.075
   senao
      se salario < 2571.30 entao
         aliquota<- salario*0.09
      senao
         se salario < 3856.95 entao
            aliquota<- salario*0.12
         senao
            se salario < 7507.50 entao
               aliquota<- salario*0.14
            senao
               aliquota<- 877.22

            fimse
         fimse
      fimse
   fimse

   totalSalario <- salario - aliquota

   escreval("Valor restante do Salário:", totalSalario)




Fimalgoritmo