public class Camiones extends Vehiculo{
    private String capacidadDeCarga;
    private int numeroEjes;

    public Camiones(String capacidadDeCarga, int numeroEjes){
        super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje);
        this.capacidadDeCarga=capacidadDeCarga;
        this.numeroEjes=numeroEjes;
    }

    public String getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(String capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camiones [capacidadDeCarga=" + capacidadDeCarga + ", numeroEjes=" + numeroEjes + "]";
    }
    

}
