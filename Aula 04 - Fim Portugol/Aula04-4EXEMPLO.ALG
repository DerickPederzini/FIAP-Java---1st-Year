Algoritmo "semnome"

Var
   idade, vagas, canditados, contador, somaId, quantiaMaior, quantiaHomens : inteiro
   sexo : caracter
   mediaId: real

Inicio

   para contador de 1 ate 10 faca
      escreva("Idade:")
      leia(idade)
      escreva("Sexo:")
      leia(sexo)

      somaId <- somaId + idade
   fimpara

   mediaId <- somaId /10

   se idade >= 18 entao
      quantiaMaior<- quantiaMaior + 1

      se sexo = "m" entao
         quantiaHomens<- quantiaHomens + 1

      fimse
   fimse

   escreval("Turma Cheia")
   escreval("Média de Idade:", mediaId)
   escreval("quantidade de maior de idade:",quantiaMaior)
   escreval("quantidade de homens:",quantiaHomens)







Fimalgoritmo