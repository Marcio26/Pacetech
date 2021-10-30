algoritmo " "

// Autor : Marcio Elias Silva Marques
// Data : 29/10/2021
VAR
   vetorCelsius, vetorFahrenheit, vetorHora: vetor[1..30] de real
   aux: real
   j, i, opcao, quantidadeTemperatura: inteiro


PROCEDIMENTO mostrarMenu()
INICIO
   ESCREVAL("O que você deseja fazer")
   ESCREVAL()
   ESCREVAL("1 - Converter de Fahrenheit para Celsius")
   ESCREVAL("2 - Converter de Celsius para Fahrenheit")
   ESCREVAL("0 - Sair")
   LEIA(opcao)
FIMPROCEDIMENTO
PROCEDIMENTO ordenarTemperatura()
INICIO
   //Ordenação do vetor pelo metodo bolha
   ESCOLHA opcao
   CASO 1
      PARA i DE 1 ATE quantidadeTemperatura FACA
         PARA j DE 1 ATE quantidadeTemperatura FACA
            SE vetorCelsius[i] < vetorCelsius[j] ENTAO
               aux <- vetorCelsius[j]
               vetorCelsius[j] <- vetorCelsius[i]
               vetorCelsius[i] <- aux
            FIMSE
         FIMPARA
      FIMPARA


   CASO 2
      PARA i DE 1 ATE quantidadeTemperatura FACA
         PARA j DE 1 ATE quantidadeTemperatura FACA
            SE vetorFahrenheit[i] < vetorFahrenheit[j] ENTAO
               aux <- vetorFahrenheit[j]
               vetorFahrenheit[j] <- vetorFahrenheit[i]
               vetorFahrenheit[i] <- aux
            FIMSE
         FIMPARA
      FIMPARA
   FIMESCOLHA

FIMPROCEDIMENTO
INICIO
      REPITA
      mostrarMenu()

      ESCOLHA opcao
      CASO 1
         ESCREVAL("Quantas temperaturas voce irá informar:")
         LEIA(quantidadeTemperatura)
         PARA j DE 1 ATE quantidadeTemperatura FACA
            ESCREVAL("Em qual horario você registrou a ",j,"° temperatura")
            LEIA(vetorHora[j])
         FIMPARA

         PARA j DE 1 ATE quantidadeTemperatura FACA
            ESCREVAL("Informe a ",j,"° temperatura ")
            LEIA(vetorFahrenheit[j])
         FIMPARA

         ordenarTemperatura()
         PARA j DE 1 ATE quantidadeTemperatura  FACA
            vetorCelsius[j] <- (vetorFahrenheit[j] - 32) * 5/9
            ESCREVAL("Temperatura ", vetorFahrenheit[j], "º graus Fahrenheit, registrada as" , vetorHora[j] ,  " corresponde a " , vetorCelsius[j], " graus Celsius")
         FIMPARA

      CASO 2
         ESCREVAL("Quantas temperaturas voce irá informar:")
         LEIA(quantidadeTemperatura)
         PARA j DE 1 ATE quantidadeTemperatura  FACA
            ESCREVAL("Em qual horario você registrou a ",j,"° temperatura")
            LEIA(vetorHora[j])
         FIMPARA

         PARA j DE 1 ATE quantidadeTemperatura  FACA
            ESCREVAL("Informe a ",j,"° temperatura")
            LEIA(vetorCelsius[j])
         FIMPARA

         ordenarTemperatura()
         PARA j DE 1 ATE quantidadeTemperatura  FACA
            vetorFahrenheit[j] <- (vetorCelsius[j] * 9/5) + 32
            ESCREVAL("Temperatura ", vetorCelsius[j], "º graus Celsius, registrada as" , vetorHora[j] ,  " corresponde a " , vetorFahrenheit[j], " graus Fahrenheit")
         FIMPARA
      OUTROCASO
         SE opcao <> 0 ENTAO
            ESCREVAL("Opção inválida")
         FIMSE
      FIMESCOLHA
   ATE opcao = 0

fimalgoritmo