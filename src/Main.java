import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        double horasTrabajadas;
        double pagoPorHora;
        double salarioBruto;
        double isr;
        double salarioFinal;

        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingresa tus horas trabajadas");
        horasTrabajadas = sc.nextDouble();
        System.out.println("Ingresa tu pago por hora");
        pagoPorHora = sc.nextDouble();

        salarioBruto = horasTrabajadas * pagoPorHora;

        isr = salarioBruto * 0.10;
        salarioFinal = salarioBruto - isr;
        System.out.println("Empleado: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Pago por hora: $" + pagoPorHora);
        System.out.printf("Salario bruto: $%.2f\n", salarioBruto);
        System.out.printf("ISR (10%%): -$%.2f\n", isr);
        System.out.printf("Salario final: $%.2f\n", salarioFinal);




        sc.close();



    }
}