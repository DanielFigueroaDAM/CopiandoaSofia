import java.util.Scanner;
public class boletin_3_A {//definimos clase
    public static void main(String[] args) {
        Scanner tecleamos= new Scanner (System.in);// creamos el scanner
        System.out.println("Introduce tu número");//pregunta para introducir número
           int numero = tecleamos.nextInt();//da el espacio para introducir un valor
            if (numero>0) {//paámetros que debe cumplir el número positivo
                System.out.println("Tienes un positivo");//imprime que es positivo en caso de serlo
            }
                        tecleamos.close();//cierramos scanner para optimizar


        }
    }

