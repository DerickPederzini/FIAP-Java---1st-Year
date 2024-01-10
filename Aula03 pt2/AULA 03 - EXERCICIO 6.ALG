Algoritmo "semnome"

Var
   venda : inteiro
   preco, porcentagem, novoPreco : real
Inicio
   escreva("Venda Média:")
   leia(venda)
   escreva("Preço Atual:")
   leia(preco)

   se (venda<500) ou (preco<30) entao
      novoPreco <- preco*1.10
   senao
      se ((venda<=500) e (venda<1200)) ou ((preco>=30) e (preco<80)) entao
         novoPreco<- preco*1.15
      senao
         se (venda >=1200) ou (preco<80) entao
            novoPreco <- preco*0.8
         fimse
      fimse
   fimse

   escreval ("Novo preço:", novoPreco)




Fimalgoritmo