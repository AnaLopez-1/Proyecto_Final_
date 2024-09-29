public class Vehiculo {
    private String marca;
    private boolean esNuevo;
    private int modelo;
    private String cambios;
    private int velocidadMaxima;
    private String cilindraje;
  
    public Vehiculo (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje){
        this.marca=marca;
        this.esNuevo=esNuevo;
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

    public int getEsNuevo() {
        return modelo;
    }
    
    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public int getModelo() {
        return modelo;
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
        return "marca:" + marca + "\n"+ 
        "esNuevo:" + esNuevo + "\n"+
        "modelo:" + modelo + "\n"+
        "cambios:" + cambios + "\n"+
        "velocidadMaxima:" + velocidadMaxima + "\n"+
        "cilindraje:" + cilindraje;
    }
}