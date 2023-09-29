public class Superheroes {
    private String nombre;
    private String poder;

    public Superheroes(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public void mostrarPoder() {
        System.out.println(nombre + " tiene el poder de " + poder);
    }

    public static class Aircraft {
        private String modelo;
        private int capacidad;

        public Aircraft(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }

        public void volar() {
            System.out.println("El avión de modelo " + modelo + " está volando con una capacidad de " + capacidad + " personas.");
        }
    }

    public static void main(String[] args) {
        Superheroes ironMan = new Superheroes("Iron Man", "Armadura");
        Superheroes capitanAmerica = new Superheroes("Capitán América", "escudo");
        Superheroes thor = new Superheroes("Thor", "Poderes");
        Superheroes blackWidow = new Superheroes("Black Widow", "robar");
        Aircraft avion = new Aircraft("jet", 10);

        ironMan.mostrarPoder();
        capitanAmerica.mostrarPoder();
        thor.mostrarPoder();
        blackWidow.mostrarPoder();
        avion.volar();
    }
}
