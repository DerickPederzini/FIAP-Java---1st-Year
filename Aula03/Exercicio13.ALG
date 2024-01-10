Algoritmo "semnome"

Var
 diaNasc, mesNasc, anoNasc, diaHoje, mesHoje, anoHoje: inteiro
 totalDiasHoje, totalDiasNasc, totalDiasVivido : inteiro
 totalMesHoje, totalMesNasc, totalMesVivido : real
 totalAnoNasc, totalAnoHoje, totalAnoVivido: real
Inicio

   //ENTRADA

      escreva("Dia de Nascimento:")
      leia(diaNasc)
      escreva("Mês de Nascimento:")
      leia(mesNasc)
      escreva("Ano de Nascimento:")
      leia(anoNasc)
      escreva("Dia de Hoje:")
      leia(diaHoje)
      escreva("Mês de Hoje:")
      leia(mesHoje)
      escreva("Ano de Hoje:")
      leia(anoHoje)
      
    //PROCESSAMENTO
      
      totalDiasNasc<- diaNasc + (mesNasc*30) + (anoNasc*365)
      totalDiasHoje<- diaHoje + (mesHoje*30) + (anoHoje*365)
      totalDiasVivido<- totalDiasHoje - totalDiasNasc
      escreval("Dias Vividos:",totalDiasVivido)
      //meses
      totalMesNasc<- (diaNasc/30) + mesNasc + (anoNasc*12)
      totalMesHoje<- (diaHoje/30) + mesHoje + (anoHoje*12)
      totalMesVivido<- totalMesHoje - totalMesNasc
      escreval ("Você viveu:", totalMesVivido:4:0, " meses")
      
      totalAnoNasc<- (diaNasc/365) + (mesNasc/12) + anoNasc
      totalAnoHoje<- (diaHoje/365) + (mesHoje/12) + anoHoje
      totalAnoVivido<- totalAnoHoje - totalAnoNasc
      escreval("Você viver:", totalAnoVivido:4:0, " Anos")
Fimalgoritmo