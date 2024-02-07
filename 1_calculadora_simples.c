#include <stdio.h>

int main(){
  float num1, num2;
  float soma, sub, mult, div;

  printf("-- Calculadora Simples --:\n");
  
  printf("Digite o número 1: ");
  scanf("%f", &num1);
  printf("Digite o número 2: ");
  scanf("%f", &num2);

  soma = num1 + num2;
  sub = num1 - num2;
  mult = num1 * num2;
  div = num1 / num2;

  printf("%f + %f = %f\n", num1, num2, soma);
  printf("%f - %f = %f\n", num1, num2, sub);
  printf("%f * %f = %f\n", num1, num2, mult);
  printf("%f / %f = %f\n", num1, num2, div);

  return 0;
}