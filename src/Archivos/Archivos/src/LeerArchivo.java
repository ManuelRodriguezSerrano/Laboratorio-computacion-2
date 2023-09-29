import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        LeerArchivo lector = new LeerArchivo();
        lector.leerArchivo();
    }

    public void leerArchivo() {
        try {
            FileReader entrada = new FileReader("C:/Users/Manuel/Desktop/lab2/Laboratorio-computacion-2/src/Archivos/Archivos/src/imagen.jpg");
            int caracter = entrada.read();
            while (caracter != -1) {
                char letra = (char) caracter;
                System.out.print(letra);
                caracter = entrada.read();
            }
            entrada.close(); // ¡No olvides cerrar el archivo después de leerlo!

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
