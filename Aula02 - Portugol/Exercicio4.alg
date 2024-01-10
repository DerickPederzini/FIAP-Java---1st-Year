algoritmo "semnome"

var
   valorFabrica, lucro, lucro1, impostos, impostos1, valorFinal :real
inicio
escreva("Digite o valor de fábrica:")
leia(valorFabrica)
escreva("Digite o percentual do lucro:")
leia(lucro)
escreva("Digite o valor dos impostos:")
leia(impostos)
lucro1<-(valorFabrica*(lucro/100))
impostos1<-(valorFabrica* (impostos/100))
valorFinal<-(valorFabrica+lucro1+impostos1)
escreval("Valor do lucro:", lucro1)
escreval("Valor impostos:", impostos1)
escreval("Valor Final:", valorFinal)

fimalgoritmo
