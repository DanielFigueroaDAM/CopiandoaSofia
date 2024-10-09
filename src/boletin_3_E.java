import java.util.Scanner;
public class boletin_3_E {
    public static void main(String[] args) {
        Scanner variables = new Scanner(System.in);
        System.out.print("Ingrese un numero 1: ");
        int num1 = variables.nextInt();
        System.out.print("Ingrese un numero 2: ");
        int num2 = variables.nextInt();
        System.out.print("Ingrese un numero 3: ");
        int num3 = variables.nextInt();
        int mayor = Math.max(num1, Math.max(num2, num3));
        System.out.println("el mayor es " + mayor);
    }
}