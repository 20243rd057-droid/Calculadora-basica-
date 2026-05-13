import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("ingresa el segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("suma: " + trabajo.sumar(num1, num2));

        System.out.println("resta: " + trabajo.restar(num1, num2));

        System.out.println("multiplicación: " + trabajo.multiplicar(num1, num2));

        if (num2 != 0) {
            System.out.println("division: " + trabajo.dividir(num1, num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        sc.close();
    }
}


