Algoritmo "semnome"

Var
   idade: inteiro
   categoria: caracter

Inicio
   escreva("Idade do Atleta:")
   leia(idade)

   se (idade < 5) entao
      escreva("Categoria Mirim")
   senao
      se (idade < 8) entao
         escreva("Categoria Infantil A")
      senao
         se (idade < 11) entao
            escreva("Categoria Infantil B")
         senao
            se (idade < 14) entao
               escreva("Categoria Juvenil A")
            senao
               se (idade < 18) entao
                  escreva("Categoria Juvenil B")
               senao
                  se (idade < 51) entao
                     escreva("Categoria Adulto")
                  senao
                     escreva ("Categoria Veterano")

                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo