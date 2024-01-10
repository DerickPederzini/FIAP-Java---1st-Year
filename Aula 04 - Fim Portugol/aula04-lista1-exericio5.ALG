Algoritmo "semnome"

Var
   peso, altura, porcentagemO, idadeM : real
   olhos, cabelo : caracter
   idade, idadeQuant, idadeQuant2, quantidadeR, quantiaO, c : inteiro

Inicio

   c<-1

   para c de 1 ate 3 faca

      escreval("----------------------------")

      escreval(c,"º Pessoa")

      escreva("Digite a idade:")
      leia(idade)

      escreva("Digite o peso:")
      leia(peso)

      escreva("Digite a altura:")
      leia(altura)

      escreval("A = AZUL - P = PRETO - C = CASTANHO - V = VERDE")

      escreval("Digite a cor dos olhos:")
      leia(olhos)

      escreval("L = LOIRO - P = PRETO - C = CASTANHO - R = RUIVO")

      escreva("Digite a cor dos cabelos:")
      leia(cabelo)

      se (idade > 50) e ( peso < 60) entao
         idadeQuant<- idadeQuant + 1
      fimse

      se (cabelo = "R") ou (cabelo = "r") e (olhos <> "A") ou (olhos <> "a")entao
         quantidadeR<- quantidadeR + 1

      fimse

      se (olhos = "A") ou (olhos = "a")entao
         quantiaO <- quantiaO + 1
      fimse

      se altura < 150 entao
         idadeQuant2<- idadeQuant2 + 1
         idadeM<- idade / idadeQuant2
      fimse

   fimpara

   porcentagemO<- (quantiaO * 100) / c

   escreval("Quantia de pessoas acima de 50 anos e com menos de 60kg:", idadeQuant)
   escreval("Média das pessoas com menos de 150:", idadeM)
   escreval("Porcentamge olhos azuis:", PorcentagemO,"%")
   escreval("Quantia ruivos sem olhos azuis:", quantidadeR)

Fimalgoritmo
