#include <stdio.h>
int main()
{
  int idade;
  printf("Digite sua idade (em anos):");
  scanf("%d", &idade);

  if (idade >= 18)
    printf("Você é maior de idade.");
  else
    printf("Você não é maior de idade.");

  return 0;  
}