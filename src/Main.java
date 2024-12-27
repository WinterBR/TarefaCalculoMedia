import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        while (A == 0) {
            System.out.println("Digite a nota 1: ");
            num1 = sc.nextInt(); // Agora você está atribuindo um valor, não criando a variável
            if (num1 >= 0 && num1 <= 10) {
                break;
            } else {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10.");
            }
        }

        while (A == 0) {
            System.out.println("Digite a nota 2: ");
            num2 = sc.nextInt(); // Agora você está atribuindo um valor, não criando a variável
            if (num2 >= 0 && num2 <= 10) {
                break;
            } else {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10.");
            }
        }

        while (A == 0) {
            System.out.println("Digite a nota 3: ");
            num3 = sc.nextInt(); // Agora você está atribuindo um valor, não criando a variável
            if (num3 >= 0 && num3 <= 10) {
                break;
            } else {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10.");
            }
        }

        while (A == 0) {
            System.out.println("Digite a nota 4: ");
            num4 = sc.nextInt(); // Agora você está atribuindo um valor, não criando a variável
            if (num4 >= 0 && num4 <= 10) {
                break;
            } else {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10.");
            }
        }


        Notas notas = new Notas(num1, num2, num3, num4);
        notas.conta();
        notas.passado();
    }
}