import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            System.out.print("Insira um número inteiro n: ");
            int n = sc.nextInt();

            int soma = 0;
            int atual = 1;
            for (int c = 1; c <= n; c++) {
                if (c % 2 != 0) {
                    soma += atual;
                    System.out.println("atual: " + atual);
                    atual += 2;
                }
            }
            System.out.println("A soma dos primeiros " + n + " números ímpares é: " + soma);
    }
}
