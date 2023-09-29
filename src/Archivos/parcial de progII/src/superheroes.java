// Clase Superheroe
public class Superheroe {
    private String nombre;
    private String poder;

    public Superheroe() {
        this.nombre = "Desconocido";
        this.poder = "Sin poder";
    }

    public Superheroe(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Poder: " + poder);
    }
}

// Clase Avion
public class Avion {
    private String modelo;
    private int capacidadPasajeros;

    public Avion() {
        this.modelo = "Desconocido";
        this.capacidadPasajeros = 0;
    }

    public Avion(String modelo, int capacidadPasajeros) {
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void mostrarInformacion() {
        System.out.println("Modelo del avión: " + modelo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}

// Clase ProgramaSuperheroes
public class ProgramaSuperheroes {
    public static void main(String[] args) {
        Superheroe ironMan = new Superheroe("Iron Man", "Armadura");
        Superheroe capitanAmerica = new Superheroe("Capitán América", "Fuerza");
        Superheroe thor = new Superheroe("Thor", "Control del martillo");
        Superheroe blackWidow = new Superheroe("Viuda Negra", "Habilidades de espionaje");

        Avion avion = new Avion("jet", 6);

        System.out.println("Información de los Superhéroes:");
        ironMan.mostrarInformacion();
        capitanAmerica.mostrarInformacion();
        thor.mostrarInformacion();
        blackWidow.mostrarInformacion();

        System.out.println("\nInformación de los Aviones:");
        avion.mostrarInformacion();
    }
}
