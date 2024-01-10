algoritmo "semnome"

var
  salarioMinimo, valorKw, quantidadeKw, valorResidencia, desc, valorDesc: real
inicio
  escreva ("Digite salário mínimo:")
  leia(salarioMinimo)
  escreva ("Digite quantidade de quilowatts:")
  leia(quantidadeKw)
  
  valorKw<-(salarioMinimo*0.2)
  valorResidencia<-(quantidadeKw*valorKw)
  desc<-(0.15*valorResidencia)
  valorDesc<-(valorResidencia-desc)

  
  escreval("Valor quilowatts:",valorKw)
  escreval ("Valor residência:", valorResidencia)
  escreval ("Valor residência com desconto:", valorDesc)
fimalgoritmo
