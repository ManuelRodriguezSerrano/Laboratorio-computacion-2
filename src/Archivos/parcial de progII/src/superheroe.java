// Clase Superheroe
public abstract class Superheroe {
    private String nombre;
    private String habilidad;

    public Superheroe(String nombre, String habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public abstract void atacar();
}

// Clase Avion
public class Avion {
    private String modelo;
    private int capacidad;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void despegar() {
        System.out.println("El avión " + modelo + " ha despegado.");
    }
}

// Clase IronMan
public class IronMan extends Superheroe {
    private Avion avion;

    public IronMan(String nombre, String habilidad, Avion avion) {
        super(nombre, habilidad);
        this.avion = avion;
    }

    public Avion getAvion() {
        return avion;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ha disparado un rayo láser.");
    }
}

// Clase CapitanAmerica
public class CapitanAmerica extends Superheroe {
    private String escudo;

    public CapitanAmerica(String nombre, String habilidad, String escudo) {
        super(nombre, habilidad);
        this.escudo = escudo;
    }

    public String getEscudo() {
        return escudo;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ha lanzado su escudo.");
    }
}

// Clase Thor
public class Thor extends Superheroe {
    private String martillo;

    public Thor(String nombre, String habilidad, String martillo) {
        super(nombre, habilidad);
        this.martillo = martillo;
    }

    public String getMartillo() {
        return martillo;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ha lanzado su martillo.");
    }
}

// Clase BlackWidow
public class BlackWidow extends Superheroe {
    private String arma;

    public BlackWidow(String nombre, String habilidad, String arma) {
        super(nombre, habilidad);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ha disparado su arma.");
    }
}
