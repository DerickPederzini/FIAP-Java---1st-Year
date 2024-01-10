algoritmo "semnome"
var
  salarioBruto, salarioLiquido, gratificacao, imposto :real
inicio
  escreva("Digite o salário bruto:")
  leia(salarioBruto)
  gratificacao<-(salarioBruto*0.10)
  imposto<-(salarioBruto*0.20)
  salarioLiquido<-(salarioBruto+gratificacao-imposto)
  escreva("Salário Líquido:",salarioLiquido)
fimalgoritmo
