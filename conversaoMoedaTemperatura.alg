Algoritmo "semnome"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Marcio Elias Silva Marques
// Data atual  : 16/10/2021
Var
   cotacaoDolar,conversaoDolar, valorDolar:real
   cotacaoReal,conversaoReal,valorReal, increment:real
   celsius, fahrenheit,conversaoCelsius,conversaoFahrenheit: real
   valorDigitado, i: inteiro


Inicio
   REPITA
      escreval("-----MENU----")
      escreval("O que você deseja fazer")
      escreval("1 - Converter dolar para real")
      escreval("2 - Converter real para dolar")
      escreval("3 - Converter celsius para fahrenheit")
      escreval("4 - Converter fahrenheit para celsius ")
      escreval("0 - Sair")
      escreval(" ")
      leia(valorDigitado)


      escolha valorDigitado
      caso 1
         escreval("Informe a cotação atual do dólar")
         leia(cotacaoDolar)
         escreval("Informe quantos dolares você precisa")
         leia(valorDolar)
         conversaoDolar <- valorDolar * cotacaoDolar
         escreval(" ")
         escreval("Hoje para comprar U$",valorDolar,", preciso de R$", conversaoDolar)
         escreval(" ")
      caso 2
         escreval("Informe a cotação atual do real")
         leia(cotacaoReal)
         escreval("Informe quantos reais você precisa")
         leia(valorReal)
         conversaoReal <- valorReal * cotacaoReal
         escreval(" ")
         escreval("Hoje para comprar R$",valorReal,", preciso de U$", conversaoReal)
         escreval(" ")
      caso 3
         escreval("Informe a temperatura em Celsius")
         leia(celsius)
         conversaoCelsius <- (celsius * 1.8) + 32
         escreval(" ")
         escreval("A temperatura ",celsius,"° em Celsius é ", conversaoCelsius:2:2," Farenheit")
         escreval(" ")
         escreval("Temperatura de 1 a 100")
         para i de 1 ate 100 passo 1 faca

            increment <- (i * 1.8)+ 32
            escreval(i,"° Célsius é ", increment, " em Fahrenheit")

         fimpara


      caso 4
         escreval("Informe a temperatura em Fahrenheit")
         leia(fahrenheit)
         conversaoFahrenheit <- (fahrenheit - 32) * (5/9)
         escreval(" ")
         escreval("A temperatura ", fahrenheit,"° em Fahrenheit é ", conversaoFahrenheit:2:2,"° Celsius")
         escreval(" ")
         escreval("Temperatura de 1 a 100")

         para i de 1 ate 100 passo 1 faca

            increment <- (i - 32) * (5/9)
            escreval(i,"° Fahrenheit é ", increment, " em Celsius")

         fimpara
      fimescolha
   ATE valorDigitado = 0

Fimalgoritmo