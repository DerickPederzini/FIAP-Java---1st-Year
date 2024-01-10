algoritmo "semnome"


var
  valorDeposito, valorJuros, rendimento, valorFinal : real
inicio
      escreva("Digite o Valor Depósito:")
leia(valorDeposito)
escreva("Digite o Juro:")
leia(valorJuros)

rendimento<-(valorDeposito*valorJuros)/100
valorFinal<-(valorDeposito + rendimento)
escreval("rendimento:", rendimento)
escreval("Valor Total:", valorFinal)








fimalgoritmo
