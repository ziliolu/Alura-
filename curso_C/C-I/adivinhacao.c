// CRIAÇÃO DE UM JOGO DE ADIVINHAÇÃO DE NÚMEROS 


//inclui biblioteca
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    //imprime o cabeçalho do jogo
    printf("**************************************\n");
    printf("* Bem-vindo ao nosso jogo de adivinhacao *\n");
    printf("Você começará com 1000 pontos e vai perdendo a cada vez que erra uma jogada :(");
    printf("**************************************\n");

    int segundos = time(0);
    srand(segundos);

    int numero_grande = rand(); 
    int numero_secreto = numero_grande % 100; 
    int chute;
    int tentativa = 0;
    int ganhou = 0;
    double pontos = 1000;
    
    while (ganhou == 0){

        printf("Qual e o seu chute?\n");
        printf("Tentativa %d\n", tentativa + 1);
        scanf("%d", &chute);
        printf("Seu chute foi %d \n", chute);

        if (chute < 0)
        {
            printf("Voce nao pode chutar numeros negativos, tente novamente!\n");
            continue;
        }

        int acertou = (chute == numero_secreto);
        int maior = (chute > numero_secreto);

        if (acertou){
            printf("Parabens! Voce acertou!\n");
            printf("Jogue de novo, voce e um otimo jogador!\n");
            ganhou = 1;
        }

        else if (maior){
            printf("Voce errou! Seu chute foi maior que o numero secreto\n");
             
        }

        else{
            printf("Voce errou! Seu chute foi menor que o numero secreto\n");
            
        };

        tentativa++;

        int pontos_perdidos = (chute - numero_secreto) / 2;

        if (pontos_perdidos < 0){
            pontos_perdidos = pontos_perdidos * -1;
        }
        
        pontos = pontos - (double)pontos_perdidos; 
    }

    printf("Fim do jogo!\n");
    printf("Voce acertou em %d tentativas\n", tentativa);
    printf("Total de pontos restantes: %.1f\n", pontos);
}

