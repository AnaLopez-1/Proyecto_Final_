public class Camionetas extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private String capacidadMaletero;
    private int numeroBolsasDeAire;
    
    public Camionetas (String marca, boolean nuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, int numeroPasajeros, int numeroPuertas, String capacidadMaletero, int numeroBolsasDeAire){
        super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
        this.numeroBolsasDeAire=numeroBolsasDeAire;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(String capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    @Override
    public String toString() {
        return "Camionetas [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", capacidadMaletero=" + capacidadMaletero + ", numeroBolsasDeAire=" + numeroBolsasDeAire + "]";
    }
}
