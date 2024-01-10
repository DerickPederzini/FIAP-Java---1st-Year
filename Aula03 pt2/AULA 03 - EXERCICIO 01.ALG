Algoritmo "semnome"

Var
   altura : real
   peso, imc : real

Inicio
   escreva("Altura:")
   leia(altura)
   escreva("Peso:")
   leia(peso)
   imc <- peso / (altura^2)

   escreval ("Seu IMC é:", imc:4:2)

   se (imc < 18.5) entao
      escreva("Baixo Peso")
   senao
      se (imc >= 18.5)e (imc < 25.0)entao
         //poderia ser feito (imc < 24.9)
         escreva("Peso Normal")
      senao
         se (imc >= 25.0) e ( imc < 30) entao
            //poderia ser feito (imc < 29.9)
            escreva("Pré-Obesidade")
         senao
            se (imc >= 30.0) e (imc <35) entao
               //poderia ser feito (imc < 34.9)
               escreva("Obesidade Grau I")
            senao
               se (imc >= 35) e (imc < 40) entao
                  //poderia ser feito (imc < 39.9)
                  escreva("Obesidade Grau II")
               senao
                  escreva("Obesidade Grau III")

               fimse
            fimse
         fimse
      fimse
   fimse




Fimalgoritmo