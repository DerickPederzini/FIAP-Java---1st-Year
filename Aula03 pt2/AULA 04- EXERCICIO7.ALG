Algoritmo "semnome"

Var
   codigoProduto, codigoPais : inteiro
   pesoQuilos, pesoGramas, precoTotal, imposto, valorTotal, precoGramas : real

Inicio

   escreva("Código do  Produto:")
   leia(codigoProduto)
   escreva("Peso do Produto:")
   leia(pesoQuilos)
   escreva("Código do País de Origem:")
   leia(codigoPais)

    pesoGramas<- pesoQuilos/1000

   Escolha codigoProduto

   Caso 1 ate 4
   precoGramas<- 15
   Caso 5 ate 7
   precoGramas<- 25
   Caso 8 ate 10
   precoGramas<- 35
   fimEscolha
   
   precoTotal<- pesoGramas* precoGramas

   se codigoPais = 1 entao
   imposto<-0
   se codigoPais = 2 entao
   imposto<- precoTotal*0.15
   senao
   imposto <- precoTotal*0.25
   
   fimse
   fimse
   
   valorTotal<-precoTotal + imposto
   
   escreval("Valor do Imposto:", imposto)
   escreval("Valor da Grama:", precoGramas)
   escreval("Preço Total", precoTotal)
   escreval("Valor Total", valorTotal)
   
   
                     
                     
                     
                     
                     







Fimalgoritmo