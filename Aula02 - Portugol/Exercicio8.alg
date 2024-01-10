algoritmo "semnome"
var
  capital, juros, periodo, montante: real
inicio
  escreva("Digite o valor do capítal:")
  leia(capital)
  escreva("Digite os juros:")
  leia(juros)
  escreva("Digite o periodo:")
  leia(periodo)
  montante<-(capital*((1+juros/100)^periodo))
  escreva("Valor do montante:", montante)
fimalgoritmo
