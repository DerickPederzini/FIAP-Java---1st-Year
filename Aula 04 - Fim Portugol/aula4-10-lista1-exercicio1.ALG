Algoritmo "semnome"

Var
   idade, pessoas, pessoas1, pessoas2, pessoas3, pessoas4, pessoas5, quantiaP : inteiro
   porcentagem: real

Inicio

   pessoas<- 1
   para pessoas de 1 ate 5 faca

      escreval (pessoas, "º Pessoa")

      escreva("Digite a Idade:")
      leia(idade)

      se idade < 16 entao
         pessoas1<- pessoas1+1
      senao
         se idade < 31 entao
            pessoas2<- pessoas2+1
         senao
            se idade < 46 entao
               pessoas3<- pessoas3+1
            senao
               se idade < 61 entao
                  pessoas4<- pessoas4+1
               senao
                  pessoas5<- pessoas5+1


               fimse
            fimse
         fimse
      fimse
   fimpara
   
   porcentagem<- pessoas1/5 * 100

   escreval("Pessoas na primeira faixa:", pessoas1)
   escreval("Pessoas na segunda faixa:", pessoas2)
   escreval("Pessoas na terceira faixa:", pessoas3)
   escreval("Pessoas na quarta faixa:", pessoas4)
   escreval("Pessoas na quinta faixa:", pessoas5)
   
   escreval("Porcentagem de pessoas na primeira faixa =", porcentagem, "%")

   
   



Fimalgoritmo