public class nuevo {
import java.util.ArrayList;
import java.util.Scanner;

    class Person {
        // Resto del código para la clase Person (sin cambios)

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni;
        }
    }

    class Student extends Person {
        // Resto del código para la clase Student (sin cambios)
    }

    class Teacher extends Person {
        // Resto del código para la clase Teacher (sin cambios)
    }

    class Curso {
        // Resto del código para la clase Curso (sin cambios)
    }

    public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Curso curso = new Curso();

            while (true) {
                // Resto del código para el menú y las opciones (sin cambios)
            }

            // Cerrar el Scanner al salir del bucle
            scanner.close();
        }
    }

}
