import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello world, aburrido en una clase de java");

            System.out.println("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Ingrese el tercer número: ");
            int num3 = scanner.nextInt();

            // Ordenar los números de mayor a menor
            if (num1 >= num2 && num1 >= num3) {
                if (num2 >= num3) {
                    System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("Los números ordenados son: " + num1 + ", " + num3 + ", " + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 >= num3) {
                    System.out.println("Los números ordenados son: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("Los números ordenados son: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                if (num1 >= num2) {
                    System.out.println("Los números ordenados son: " + num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println("Los números ordenados son: " + num3 + ", " + num2 + ", " + num1);
                }
            }

            scanner.close();
        }
    }
