public class Vehiculo {
    private String marca;
    private boolean nuevo;
    private int modelo;
    private String cambios;
    private int velocidadMaxima;
    private String cilindraje;
  
    public Vehiculo (String marca, boolean nuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje){
        this.marca=marca;
        this.nuevo=nuevo;
        this.modelo=modelo;
        this.cambios=cambios;
        this.velocidadMaxima=velocidadMaxima;
        this.cilindraje=cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public int isModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Vehiculo\n"+
        "marca:" + marca + "\n"+ 
        "nuevo:" + nuevo + "\n"+
        "modelo:" + modelo + "\n"+
        "cambios:" + cambios + "\n"+
        "velocidadMaxima:" + velocidadMaxima + "\n"+
        "cilindraje:" + cilindraje;
    }
}