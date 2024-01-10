Algoritmo "semnome"

Var
   media : real

Inicio
   escreva("Digite a média anual do aluno: ")
   leia(media)

   se media >= 9 entao
      escreva("Média Ótima. Aluno passou de ano!")
   senao
      se media >= 8 entao
         escreva("Média boa. Aluno passou de ano!")
      senao
         se media >= 6 entao
            escreva("Média regular. Aluno passou de ano!")
         senao
            escreva("Média insuficiente. Aluno de recuperação!")

         fimse
      fimse
   fimse

Fimalgoritmo