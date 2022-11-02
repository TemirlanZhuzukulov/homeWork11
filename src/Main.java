import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Input a:");
        triangle.a = scanner.nextDouble();
        System.out.print("Input b:");
        triangle.b = scanner.nextDouble();
        System.out.print("Input c:");
        triangle.c = scanner.nextDouble();
        triangle.counter(triangle.a, triangle.b, triangle.c);
    }

}