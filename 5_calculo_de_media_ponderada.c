#include <stdio.h>

int main() {
  float nota1, nota2, nota3;
  float peso1, peso2, peso3;
  float media;

  printf("Digite a Nota 1:");
  scanf("%f", &nota1);

  printf("Digite a Nota 2:");
  scanf("%f", &nota2);

  printf("Digite a Nota 3:");
  scanf("%f", &nota3);

  printf("\nDigite o peso da nota 1:");
  scanf("%f", &peso1);

  printf("Digite o peso da nota 2:");
  scanf("%f", &peso2);

  printf("Digite o peso da nota 3:");
  scanf("%f", &peso3);

  media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

  printf("A média ponderada é: %.2f\n", media);

  return 0;
}
