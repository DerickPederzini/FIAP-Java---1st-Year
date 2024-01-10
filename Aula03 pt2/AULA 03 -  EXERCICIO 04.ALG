Algoritmo "semnome"

Var
   VALORHOTEL, taxa, valorTotal : real
   dias : inteiro
   nome : caracter

Inicio
   VALORHOTEL <- 80
   escreva("Digite seu Nome: ")
   leia(nome)
   escreva("Digite a quantia de dias: ")
   leia (dias)

   se dias > 15 entao
      taxa <- (5.50 * dias)
      valorTotal<- taxa + VALORHOTEL
      escreval("Nome do Cliente: ", nome)
      escreval ("Conta:",valorTotal)
   senao
      se dias = 15 entao
         taxa <- (6.00 * dias)
         valorTotal<- taxa + VALORHOTEL
         escreval("Nome do Cliente: ", nome)
         escreval ("Conta:",valorTotal)
      senao
         taxa<- (8.00 * dias) L
         valorTotal<- taxa + VALORHOTEL
         escreval("Nome do Cliente: ", nome)
         escreval ("Conta:",valorTotal)
      fimse
   fimse



Fimalgoritmo