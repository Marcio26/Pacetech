Algoritmo "semnome"

// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Marcio Elias Silva Marques
// Data atual  : 28/10/2021
Var
   vetorHora:vetor[1..30] de caracter//vetor para guardar horario
   vetorTemperatura:vetor[1..30] de real//vetor para guardar temperatura
   conversao:vetor[1..30] de real//vetor para mostrar a conversao
   quantidadeTemperatura:inteiro//variavel para guardar quantas temperaturas serão informadas
   tipoTemperatura, i,opcao: inteiro//variavel para guardar temperatura em Celsius ou Fahrenheit

PROCEDIMENTO mostrarMenu()
INICIO
   ESCREVAL("O que você deseja fazer")
   ESCREVAL("1 - Registrar a temperatura ")
   ESCREVAL("0 - Sair")
   ESCREVAL(" ")
   LEIA(opcao)
FIMPROCEDIMENTO

PROCEDIMENTO informarTemperatura()
//Função para o usuario informar temperaturas registradas
INICIO
   ESCREVAL("Quantas temperaturas você irá informar:")
   LEIA(quantidadeTemperatura)

   ESCREVAL("Será em graus Celsius ou Fahrenheit?")
   ESCREVAL("1 - Celsius")
   ESCREVAL("2 - Fahrenheit")
   LEIA(tipoTemperatura)

   PARA i DE 1 ATE quantidadeTemperatura FACA
      ESCREVAL("Informe a ",i,"° temperatura")
      LEIA(vetorTemperatura[i])
      ESCREVAL("Em qual horário essa temperatura foi registrada:")
      LEIA(vetorHora[i])
   FIMPARA
FIMPROCEDIMENTO

PROCEDIMENTO converterTemperatura()
//Função para converter a temperatura informada
INICIO
   SE tipoTemperatura = 1 entao
      Para i de 1 ate quantidadeTemperatura faca
         conversao[i] <- (vetorTemperatura[i] * 1.8) + 32
      Fimpara
   SENAO
      SE tipoTemperatura = 2 entao
         Para i de 1 ate quantidadeTemperatura faca
            conversao[i] <- (vetorTemperatura[i] - 32) * (5/9)
         Fimpara
      FIMSE
   FIMSE
FIMPROCEDIMENTO

PROCEDIMENTO ordenarTemperatura()
//Função para ordenar da menor para maior
var
j:inteiro
aux:real
INICIO
   PARA i DE 1 ATE quantidadeTemperatura FACA
      PARA j DE 1 ATE quantidadeTemperatura FACA
         SE vetorTemperatura[j] > vetorTemperatura[i] ENTAO
            aux <- vetorTemperatura[i]
            vetorTemperatura[i] <- vetorTemperatura[j]
            vetorTemperatura[j] <- aux
         FIMSE
      FIMPARA
   FIMPARA
FIMPROCEDIMENTO

PROCEDIMENTO imprimirResultado()
//Função para mostrar ao usuário temperaturas e horarios registrados
INICIO
   SE tipoTemperatura = 1 ENTAO
      PARA i DE 1 ATE quantidadeTemperatura FACA
         ESCREVAL("Temperatura ",vetorTemperatura[i],"°, registrada as ",vetorHora[i]," corresponde a ",conversao[i],"° Fahrenheit")
      FIMPARA
   SENAO
      SE tipoTemperatura = 2 ENTAO
         PARA i DE 1 ATE quantidadeTemperatura FACA
            ESCREVAL("Temperatura ",vetorTemperatura[i],"°, registrada as ",vetorHora[i]," corresponde a ",conversao[i],"° Celsius")
         FIMPARA
      FIMSE
   FIMSE
FIMPROCEDIMENTO

INICIO
   REPITA
      mostrarMenu()
      ESCOLHA opcao

      CASO 1
         informarTemperatura()
         ordenarTemperatura()
         converterTemperatura()
      OUTROCASO
         SE opcao <> 0 entao
            ESCREVAL("Opção inválida")
         FIMSE
      FIMESCOLHA
   ATE opcao = 0
   ESCREVAL("")
   imprimirResultado()
Fimalgoritmo