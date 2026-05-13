import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Suma: " + trabajo.sumar(num1, num2));

        System.out.println("Resta: " + trabajo.restar(num1, num2));

        System.out.println("Multiplicación: " + trabajo.multiplicar(num1, num2));

        if (num2 != 0) {
            System.out.println("División: " + trabajo.dividir(num1, num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        sc.close();
    }
}


