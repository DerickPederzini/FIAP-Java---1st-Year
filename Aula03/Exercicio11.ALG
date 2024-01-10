Algoritmo "semnome"

Var
 SEMANAS, ATIVIDADE: real
 valorAula, aulasSemanais, numeroAulas, horaAtividade, dsr, salMensal, salarioBase  :real
 numeroAula : inteiro
Inicio
SEMANAS<-4.5
ATIVIDADE<-0.05


escreva("Digite o número de aulas por semana:")
leia(numeroAula)
escreva("Digite o valor hora aula:")
leia(valorAula)

salarioBase<- (numeroAula * SEMANAS)* valorAula
horaAtividade<- salarioBase * ATIVIDADE
dsr<-(salarioBase + horaAtividade) /6
salMensal<- salarioBase + horaAtividade + dsr




escreval("Salário Base:", salarioBase)
escreval("Hora atividade;", horaAtividade)
escreval("Valor DSR:", dsr)
escreval("Salário mensal:", salMensal)
Fimalgoritmo