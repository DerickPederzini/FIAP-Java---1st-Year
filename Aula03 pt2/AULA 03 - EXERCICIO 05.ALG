Algoritmo "semnome"

Var
   condicao: caracter
   valorProduto : real
   precoEtiqueta : real

Inicio
   escreva("Digite o preço do Produto: ")
   leia(precoEtiqueta)
   escreval("1 para a Dinheiro ou Cheque")
   escreval("2 para cartão de crédito")
   escreval("3 para pagar em duas vezes")
   escreval("4 para pagar em três vezes")


   escreva("Condição de pagamento: ")
   leia(condicao)

   Escolha condicao
   Caso "1"
      valorProduto <- precoEtiqueta - ( precoEtiqueta *0.10)
      escreva ("Valor Do Produto é:", valorProduto)
   Caso "2"
      valorProduto <- precoEtiqueta - (precoEtiqueta * 0.05)
      escreva ("Valor Do Produto é:", valorProduto)
   Caso "3"
      valorProduto <- precoEtiqueta/2
      escreva ("Valor Do Produto é em duas vezes de:", valorProduto)
   Caso "4"
      valorProduto <-(precoEtiqueta/3) + (precoEtiqueta*0.10)
      escreva ("Valor do Produto é três vezes de:", valorProduto)
   fimEscolha



Fimalgoritmo