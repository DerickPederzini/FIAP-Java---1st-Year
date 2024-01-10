Algoritmo "semnome"

Var
   investimento : caracter
   valor : real
   rendimento: real
   valorCorrigido: real

Inicio
   escreva("Valor do investimento: ")
   leia(valor)

   escreval ("Digite P para poupança")
   escreval ("Digite F para Renda Fixa")
   escreval ("Digite C para CDB")
   escreval ("Digite A para Ações")

   escreva("Digite o tipo de investimento:")
   leia(investimento)


   Escolha investimento
   Caso "P"
      rendimento <- valor * 0.03
      valorCorrigido <- rendimento + valor
      escreval ("Valor do rendimento:", rendimento)
      escreval ("Valor Corrigido:", valorCorrigido)
   Caso "F"
      rendimento <- valor * 0.05
      valorCorrigido <- rendimento + valor
      escreval ("Valor do rendimento:", rendimento)
      escreval ("Valor Corrigido:", valorCorrigido)
   Caso "C"
      rendimento <- valor * 0.06
      valorCorrigido <- rendimento + valor
      escreval ("Valor do rendimento:", rendimento)
      escreval ("Valor Corrigido:", valorCorrigido)
   Caso "A"
      rendimento <- valor * 0.10
      valorCorrigido <- rendimento + valor
      escreval ("Valor do rendimento:", rendimento)
      escreval ("Valor Corrigido:", valorCorrigido)
   outrocaso
      escreva("Investimento Inválido")
   fimEscolha



Fimalgoritmo