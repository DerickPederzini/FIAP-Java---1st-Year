Algoritmo "semnome"

Var
bonus1, bonus2 : real
salario, tempoWork : real
Inicio
escreva("Digite o salário:")
leia(salario)
escreva("Digite anos de trabalho:")
leia(tempoWork)

bonus1<-salario + (salario/5)
bonus2<-salario + (salario/10)

se tempoWork >= 5 entao
   escreva("Valor do Bônus:", bonus1)
senao
     escreva("Valor do Bônus:", bonus2)
fimse


Fimalgoritmo