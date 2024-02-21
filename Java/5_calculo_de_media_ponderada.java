import java.util.Scanner;
import java.text.DecimalFormat;

class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.print("Digite a nota 1:");
        float nota1 = scanner.nextInt();

        System.out.print("Digite a nota 2:");
        float nota2 = scanner.nextInt();

        System.out.print("Digite a nota 3:");
        float nota3 = scanner.nextInt();

        System.out.print("Digite o peso 1:");
        float peso1 = scanner.nextInt();

        System.out.print("Digite o peso 2:");
        float peso2 = scanner.nextInt();

        System.out.print("Digite o peso 3:");
        float peso3 = scanner.nextInt();

        float mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("\nA média ponderada é: " + formato.format(mediaPonderada));
    }
}
