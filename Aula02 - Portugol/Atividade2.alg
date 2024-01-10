algoritmo "semnome"

var
 nome: caracter
 salarioFixo, totalVendas, comissao, salarioFinal:real
inicio
escreva("Digite o nome do vendedor:")
leia(nome)
escreva("Digite o salário fixo:")
leia(salarioFixo)
escreva("Digite total de vendas efetuadas:")
leia(totalVendas)
comissao<-(totalVendas*0.18)
salarioFinal<-(salarioFixo+comissao)

escreval("Nome:", nome)
escreval("salário:", salarioFixo)
escreval("Salario Final:", salarioFinal)

fimalgoritmo
