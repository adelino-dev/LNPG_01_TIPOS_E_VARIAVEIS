#include <stdio.h>
int main()
{
  float celsius, fahrenheit;

  printf("Digite a temperatura em graus Celsius:");
  scanf("%f", &celsius);

  fahrenheit = (celsius*1.8)+32;

  printf("Graus em Fanrenheit: %.2f", fahrenheit);

  return 0;
}