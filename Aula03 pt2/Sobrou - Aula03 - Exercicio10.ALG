Algoritmo "semnome"

Var
   salarioMinimo, horasWork, horasExtra, horasExtraValor, horasWorkValor, salarioMes, salarioBruto,imposto, salarioLiquido, gratificacao, salarioFinal  :real
   dependentes : inteiro

Inicio

   escreva("Salário Mínimo:")
   leia(salarioMinimo)
   escreva("Horas Trabalhadas:")
   leia (horasWork)
   escreva("Números de Dependentes:")
   leia(dependentes)
   escreva("Horas Extras:")
   leia(horasExtra)

   dependentes<- 32 * dependentes
   horasWorkValor<- 0.20 * salarioMinimo
   salarioMes<- horasWork * horasWorkValor
   horasExtraValor<- ((horasWorkValor * 0.5) + horasWorkValor) * horasExtra

   salarioBruto <- salarioMes + dependentes + horasExtraValor

   se salarioMes < 1500.01 entao
      imposto<- 0
   senao
      se salarioMes < 2500.01 entao
         imposto<- 0.10 * salarioBruto
      senao
         imposto<- 0.20 * salarioBruto
      fimse
   fimse

   salarioLiquido<- salarioBruto - imposto

   se salarioLiquido < 1650.01 entao
      gratificacao<- 225.00
   senao
      gratificacao<- 185.00
   fimse

   salarioFinal<- salarioLiquido + gratificacao
   

   escreval ("---------------------------------------")
   escreval("----------Informações Finais------------")
   escreval("----------------------------------------")
   escreval ("Valor hora:", horasWorkValor)
   escreval ("Salário Mensal:", salarioMes)
   escreval("Valor de dependentes:", dependentes)
   escreval("Valor Horas extra:", horasExtraValor)
   escreval("Salário Bruto:", salarioBruto)
   escreval("Imposto:", imposto)
   escreval ("Salário Líquido:", salarioLiquido)
   escreval("Gratificação:", gratificacao)
   escreval("Salário a Receber:", salarioFinal)











Fimalgoritmo