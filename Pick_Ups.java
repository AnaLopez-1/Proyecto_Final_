public class Pick_Ups extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private String capacidadCajaDeCarga;
    private int numeroBolsasDeAire;

    public Pick_Ups (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, int numeroPasajeros, int numeroPuertas, String capacidadCajaDeCarga, int numeroBolsasDeAire){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadCajaDeCarga=capacidadCajaDeCarga;
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

    public String getCapacidadCajaDeCarga() {
        return capacidadCajaDeCarga;
    }

    public void setCapacidadCajaDeCarga(String capacidadCajaDeCarga) {
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    @Override
    public String toString() {
        return "Pick_Ups [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                + ", capacidadCajaDeCarga=" + capacidadCajaDeCarga + ", numeroBolsasDeAire=" + numeroBolsasDeAire + "]";
    }

}
