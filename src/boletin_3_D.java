import java.util.Scanner;

public class boletin_3_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nome da persona 1:");
        String nome1 = scanner.nextLine();
        System.out.print("peso de " + nome1 + ": ");
        double peso1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("nome da segunda persoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("peso de " + nome2 + ": ");
        double peso2 = scanner.nextDouble();

        if (peso1 > peso2) {
            System.out.println("Pesa mais " + nome1 + " con " + peso1 + " kg.");
            System.out.println("a diferencia e " + (peso1 - peso2) + " kg.");
        } else if (peso2 > peso1) {
            System.out.println("Pesa mais " + nome2 + " con " + peso2 + " kg.");
            System.out.println("a diferencia e " + (peso2 - peso1) + " kg.");
        } else {
            System.out.println("Ambas personas pesan o mismo: " + peso1 + " kg.");
        }

        scanner.close();
    }
}

