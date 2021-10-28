Algoritmo "semnome"

// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Marcio Elias Silva Marques
// Data atual  : 16/10/2021
Var
   vetorHora:vetor[1..50] de caracter//vetor para guardar horario
   vetorTemperatura:vetor[1..50] de real//vetor para guardar temperatura
   conversao:vetor[1..50] de real//vetor para mostrar a conversao
   quantidadeTemperatura:inteiro//variavel para guardar quantas temperaturas serão informadas
   celsius,conversaoCelsius, fahrenheit,conversaoFahrenheit: real
   opcao, i: inteiro

PROCEDIMENTO mostrarMenu()

INICIO
   escreval("O que você deseja fazer")
   escreval("1 - Converter celsius para fahrenheit")
   escreval("2 - Converter fahrenheit para celsius ")
   escreval("3 - Registrar a temperatura ")
   escreval("0 - Sair")
   escreval(" ")
   leia(opcao)

FIMPROCEDIMENTO

PROCEDIMENTO converterCelsiusFahrenheit()
// Função para converter Celsius em Fahrenheit
INICIO
   escreval("Informe a temperatura em Celsius")
   leia(celsius)
   conversaoCelsius <- (celsius * 1.8) + 32
   escreval(" ")
   escreval("A temperatura ",celsius,"° em Celsius é ", conversaoCelsius:2:2," Farenheit")
   escreval(" ")


FIMPROCEDIMENTO

PROCEDIMENTO converterFahrenheitCelsius()
// Função para converter Fahrenheit em Celsius
INICIO
   escreval("Informe a temperatura em Fahrenheit")
   leia(fahrenheit)
   conversaoFahrenheit <- (fahrenheit - 32) * (5/9)
   escreval(" ")
   escreval("A temperatura ", fahrenheit,"° em Fahrenheit é ", conversaoFahrenheit:2:2,"° Celsius")
   escreval(" ")
FIMPROCEDIMENTO

PROCEDIMENTO informarTemperatura()
//Função para o usuario informar temperaturas registradas
INICIO
   escreval("Quantas temperaturas você irá informar:")
   leia(quantidadeTemperatura)

   para i de 1 ate quantidadeTemperatura faca
      escreval("Informe a ",i,"° temperatura")
      leia(vetorTemperatura[i])
      escreval("Em qual horário essa temperatura foi registrada:")
      leia(vetorHora[i])

      //laço de repetição para mostrar registros ao usuario no final da execução
      conversao[i] <- (vetorTemperatura[i] * 1.8) + 32

   fimpara
FIMPROCEDIMENTO

PROCEDIMENTO ordenarTemperatura()
INICIO
   //Função para ordenar da menor para maior
   para i de 1 ate 6 faca
      para j de 1 ate 6 faca
         se vetorTemperatura[j] > vetorTemperatura[i] entao
            aux <- vetorTemperatura[i]
            vetorTemperatura[i] <- vetorTemperatura[j]
            vetorTemperatura[j] <- aux
         fimse
      fimpara
   fimpara
FIMPROCEDIMENTO

PROCEDIMENTO imprimirResultado()
//Função para mostrar ao usuário temperaturas e horarios registrados
INICIO
   para i de 1 ate quantidadeTemperatura faca
      escreval("Temperatura ",vetorTemperatura[i],"°, registrada as ",vetorHora[i]," corresponde a ",conversao[i],"° Fahrenheit")
   fimpara
FIMPROCEDIMENTO

Inicio
   repita
      mostrarMenu()
      escolha opcao

      caso 1
         converterCelsiusFahrenheit()
      caso 2
         converterFahrenheitCelsius()
      caso 3
         informarTemperatura()
      outrocaso
         se opcao <> 0 entao
            escreval("Opção inválida")
         fimse
      fimescolha

   ate opcao = 0
   escreval("")
   imprimirResultado()

Fimalgoritmo