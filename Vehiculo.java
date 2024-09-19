public class Vehiculo {
    private String marca;
    private String nuevo;
    private boolean modelo;
    private String cambios;
    private int velocidadMaxima;
    private String cilindraje;
    private String tipoCombustible;
    private String transmision;

    public Vehiculo (String marca, String nuevo, boolean modelo, String cambios, int velocidadMaxima, String cilindraje, String tipoCombustible, String transmision){
        this.marca=marca;
        this.nuevo=nuevo;
        this.modelo=modelo;
        this.cambios=cambios;
        this.velocidadMaxima=velocidadMaxima;
        this.cilindraje=cilindraje;
        this.tipoCombustible=tipoCombustible;
        this.transmision=transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNuevo() {
        return nuevo;
    }

    public void setNuevo(String nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isModelo() {
        return modelo;
    }

    public void setModelo(boolean modelo) {
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

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Vehiculo\n"+
        "marca:" + marca + "\n"+ 
        "nuevo:" + nuevo + "\n"+
        "modelo:" + modelo + "\n"+
        "cambios:" + cambios + "\n"+
        "velocidadMaxima:" + velocidadMaxima + "\n"+
        "cilindraje:" + cilindraje + "\n"+
        "tipoCombustible:" + tipoCombustible + "\n"
        "transmision=" + transmision;
    }
}