Algoritmo "semnome"

Var
   //digite um numero, esconder ele
   //limpa tela
   numeroSecreto : inteiro
   chute : inteiro
   tentativas : inteiro

Inicio

   numeroSecreto <- 58
   tentativas <- 1

   repita
      escreva ("Chute um número:")
      leia(chute)
      tentativas <- tentativas + 1
      limpatela

      se chute > numeroSecreto entao
         escreval("Chutou Alto!")
      senao
         se chute < numeroSecreto entao
            escreval("Chutou Baixo!")
         fimse
      fimse

   ate chute = numeroSecreto

   escreval("ACERTOU!")
   escreval("Numero de tentativas:", tentativas)






Fimalgoritmo