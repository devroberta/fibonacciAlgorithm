import java.util.Scanner;

public class Program {

    static Fibonacci fibonacci = new Fibonacci();
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero para exercicio Fibonacci: ");
        int number = leitor.nextInt();

        if (fibonacci.isContainedFibonacci(number)) {
            System.out.printf("Numero \"%d\" pertence a sequencia Fibonacci.", number);
        } else {
            System.out.printf("Numero \"%d\" NAO pertence a sequencia Fibonacci.", number);
        }
    }
}