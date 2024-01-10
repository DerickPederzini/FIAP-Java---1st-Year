Algoritmo "semnome"

Var
 dia1, mes1, ano1, dia2, mes2, ano2, data1, data2 :inteiro
Inicio

escreval("Digite a primeira data")

escreva("Primeiro dia:")
leia(dia1)
escreva("Primeiro mês:")
leia(mes1)
escreva("Primeiro ano:")
leia(ano1)
escreval("Escreva a segunda data")
escreva("Segundo dia:")
leia(dia2)
escreva("Segundo mês:" )
leia(mes2)
escreva("Segundo ano:")
leia(ano2)

data1<-(ano1*365) + (mes1*30) + dia1
data2<-(ano2*365) + (mes2*30) + dia2

 se data1 > data2 entao
    escreva("Data 1 é mais recente")
 senao
      escreva("Data 2 é mais recente")
fimse

Fimalgoritmo