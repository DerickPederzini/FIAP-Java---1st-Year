Algoritmo "semnome"

Var
   voto, c, candidato1, candidato2, candidato3, candidato4, nulo, totalV,branco : inteiro
   porcentagemB, porcentagemN : real
Inicio

   voto <- 1
   enquanto (voto <> 0) faca
      escreva("Digite o voto:")
      leia(voto)

      se voto = 1 entao
         candidato1<- candidato1 + 1
      senao
         se voto = 2 entao
            candidato2<- candidato2 + 1
         senao
            se voto = 3 entao
               candidato3<- candidato3 + 1
            senao
               se voto = 4 entao
                  candidato4 <- candidato4 + 1
               senao
                  se voto = 5 entao
                     nulo<- nulo + 1
                  senao
                     se voto = 6 entao
                        branco<- branco+1
                     senao
                        se (voto <>0) e (voto > 6) entao
                           escreval("Voto inválido")
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimenquanto

   totalV<- candidato1+candidato2+candidato3+candidato4+nulo+branco

   porcentagemB<- (branco/totalV) * 100
   porcentagemN<- (nulo/totalV) * 100


   escreval("Candidato 1:", candidato1)
   escreval("Candidato 2:", candidato2)
   escreval("Candidato 3:", candidato3)
   escreval("Candidato 4:", candidato4)
   escreval("Nulo:", nulo)
   escreval("Branco:", branco)

   escreval("Porcentagem de Brancos:", porcentagemB)
   escreval("Porcentagem de Nulos:", porcentagemN)







Fimalgoritmo