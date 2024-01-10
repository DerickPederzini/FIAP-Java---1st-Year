Algoritmo "semnome"

Var
   salario : real
   aliquota, aliquota2, parcela : real
   totalSalario, totalSalario2 : real
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

   escreval("Salário Líquido:", totalSalario)
   
   se totalSalario < 1903.981 entao
   escreval ("Salário Após IRRF:", totalSalario)
   senao
   se totalSalario 2826.651 entao
   aliquota2<- 0.075
   parcela<- 142.80
   senao
   se totalSalario < 3751.051 entao
   aliquota2<- 0.15
   parcela<- 354.80
   senao
   se totalSalario < 4.464.681 entao
   aliquota2<- 0.225
   parcela<-636.13
   senao
   aliquota<- 0.275
   parcela<-869.36
   
   fimse
   fimse
   fimse
   fimse
   fimse
   
   
   
   escreval("Total salario 2:,
   

   
   
   




Fimalgoritmo