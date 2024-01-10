algoritmo "semnome"
var
 horasTrabalho, salarioMinimo, valorHoras, salarioBruto, imposto, salarioLiquido : real
inicio
  escreva("Digite as horas trabalhadas:")
  leia(horasTrabalho)
  escreva("Digite o salário mínimo:")
  leia(salarioMinimo)
  valorHoras<-(1/3 salarioMinimo)
  salarioBruto<-(valorHoras*horasTrabalho)
  imposto<-(7/100 salarioBruto)
  salarioLiquido<-(salarioBruto-imposto)
  escreval("Valor Horas:", valorHoras)
  escreval("Salário Bruto:", salarioBruto)
  escreval("Valor Impostos:", imposto)
  escreval("Salário Líquido:", salarioLiquido)



fimalgoritmo
