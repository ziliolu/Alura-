//inclui biblioteca
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    // imprimindo cabecalho do jogo
    printf("\n\n");
    printf("          P  /_\\  P                              \n");
    printf("         /_\\_|_|_/_\\                            \n");
    printf("     n_n | ||. .|| | n_n         Bem vindo ao     \n");
    printf("     |_|_|nnnn nnnn|_|_|     Jogo de Adivinhacao! \n");
    printf("    |\" \"  |  |_|  |\"  \" |                     \n");
    printf("    |_____| ' _ ' |_____|                         \n");
    printf("          \\__|_|__/                              \n");
    printf("\n\n");

    //declarando variaveis
    int chute;
    int acertou;
    int nivel;
    int numero_tentativas;

    //declarando pontos iniciais
    double pontos = 1000;

    //gerando numero aleatorio p/ jogo 
    int segundos = time(0);
    srand(segundos);
    int numero_grande = rand();
    int numero_secreto = numero_grande % 100;

    //perguntando nivel de dificuldade
    printf("Em qual nivel de dificuldade voce gostaria de jogar?\n");
    printf("(1) Facil  (2) Medio  (3) Dificil\n\n");
    printf("Escolha: ");

    scanf("%d", nivel);

    
    switch (nivel){
        case 1:
            numero_tentativas = 20;
            break;
    
        case 2: 
            numero_tentativas = 15;
            break;

        default:
            numero_tentativas = 6;
            break;
    }

    for (int i = 1; i <= numero_tentativas; i++)
    {

        printf("Tentativa %d de %d\n", i, numero_tentativas);
        printf("Qual e o seu chute?\n");
        scanf("%d", &chute);
        printf("Seu chute foi %d \n", chute);

        //se o chute for negativo
        if (chute < 0){
            printf("Voce nao pode chutar numeros negativos, tente novamente!\n");
            i--;
            continue;
        }

        int acertou = (chute == numero_secreto);
        int maior = (chute > numero_secreto);

        if (acertou){
            break;
        }

        else if (maior){
            printf("Voce errou! Seu chute foi maior que o numero secreto\n");
        }

        else {
            printf("Voce errou! Seu chute foi menor que o numero secreto\n");
        };

        //calcula quantidade de pontos

        double pontos_perdidos = abs(chute - numero_secreto) / 2.0;
        pontos = pontos - pontos_perdidos;

        if (pontos_perdidos < 0){
            pontos_perdidos = pontos_perdidos * -1;
        }
    }

    // imprimindo mensagem de vitoria ou derrota

    printf("\n");
    if(acertou) {
        printf("             OOOOOOOOOOO               \n");
        printf("         OOOOOOOOOOOOOOOOOOO           \n");
        printf("      OOOOOO  OOOOOOOOO  OOOOOO        \n");
        printf("    OOOOOO      OOOOO      OOOOOO      \n");
        printf("  OOOOOOOO  #   OOOOO  #   OOOOOOOO    \n");
        printf(" OOOOOOOOOO    OOOOOOO    OOOOOOOOOO   \n");
        printf("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  \n");
        printf("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  \n");
        printf("OOOO  OOOOOOOOOOOOOOOOOOOOOOOOO  OOOO  \n");
        printf(" OOOO  OOOOOOOOOOOOOOOOOOOOOOO  OOOO   \n");
        printf("  OOOO   OOOOOOOOOOOOOOOOOOOO  OOOO    \n");
        printf("    OOOOO   OOOOOOOOOOOOOOO   OOOO     \n");
        printf("      OOOOOO   OOOOOOOOO   OOOOOO      \n");
        printf("         OOOOOO         OOOOOO         \n");
        printf("             OOOOOOOOOOOO              \n");
        printf("\nParabens! Voce acertou!\n");
        printf("Voce fez %.2f pontos. Ate a proxima!\n\n", pontos);

    } else {

        printf("       \\|/ ____ \\|/    \n");   
        printf("        @~/ ,. \\~@      \n");   
        printf("       /_( \\__/ )_\\    \n");   
        printf("          \\__U_/        \n");

        printf("\nVoce perdeu! Tente novamente!\n\n");
    }
}
