import java.util.Scanner;

public class Calculadora{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("-- Calculadora Simples --:\n");
    
    System.out.print("Digite o primeiro número:");
    double num1 = scanner.nextDouble();
    
    System.out.print("Digite o segundo número:");
    double num2 = scanner.nextDouble();

    System.out.println(num1 + " + " + num2 + " = " + somar(num1, num2 ));
    System.out.println(num1 + " - " + num2 + " = " + subtrair(num1, num2));
    System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
    System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2)); 
  }

  public static double somar(double num1, double num2){
    double resultado = num1 + num2;
    return resultado;
  }

  public static double subtrair(double num1, double num2){
    double resultado = num1 - num2;
    return resultado;
  }
  
  public static double multiplicar(double num1, double num2){
    double resultado = num1 * num2;
    return resultado;
  }

  public static double dividir(double num1, double num2){
    double resultado = num1 / num2;
    return resultado;
  }
}