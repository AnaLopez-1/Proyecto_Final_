public class Motos extends Vehiculo {
    public Motos (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje);
    }

    @Override
    public String toString() {
        return "Motos [marca=" + getMarca() + 
        ", esNuevo=" + getEsNuevo() + 
        ", modelo=" + getModelo() + 
        ", cambios=" + getCambios() + 
        ", velocidadMaxima=" + getVelocidadMaxima() + 
        ", cilindraje=" + getCilindraje() + "]";
    }
}
