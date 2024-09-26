public class Sedan {
    private int numeroPasajeros;
    private int numeroPuertas;
    private String capacidadMaletero;
    private double tieneONoAireAcondicionado;
    private double tieneONoCamaraReversa;
    private double tieneONoVelocidadCrucero;
    private double numeroBolsasAire;
    private double tieneONoAbs;
    private double tieneONoSensoresColision;
    private double tieneONoSensorDeTrafico;
    private double tieneONoAsistenteDePermanencia;

    public Sedan (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, int numeroPasajeros, int numeroPuertas, String capacidadMaletero, double tieneONoAireAcondicionado, double tieneONoCamaraReversa, double tieneONoVelocidadCrucero, double numeroBolsasAire, double tieneONoAbs, double tieneONoSensoresColision, double tieneONoSensorDeTrafico, double tieneONoAsistenteDePermanencia){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
        this.tieneONoAireAcondicionado=tieneONoAireAcondicionado;
        this.tieneONoCamaraReversa=tieneONoCamaraReversa;
        this.tieneONoVelocidadCrucero=tieneONoVelocidadCrucero;
        this.numeroBolsasAire=numeroBolsasAire;
        this.tieneONoAbs=tieneONoAbs;
        this.tieneONoSensoresColision=tieneONoSensoresColision;
        this.tieneONoSensorDeTrafico=tieneONoSensorDeTrafico;
        this.tieneONoAsistenteDePermanencia=tieneONoAsistenteDePermanencia;
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

    public double getTieneONoAireAcondicionado() {
        return tieneONoAireAcondicionado;
    }

    public void setTieneONoAireAcondicionado(double tieneONoAireAcondicionado) {
        this.tieneONoAireAcondicionado = tieneONoAireAcondicionado;
    }

    public double getTieneONoCamaraReversa() {
        return tieneONoCamaraReversa;
    }

    public void setTieneONoCamaraReversa(double tieneONoCamaraReversa) {
        this.tieneONoCamaraReversa = tieneONoCamaraReversa;
    }

    public double getTieneONoVelocidadCrucero() {
        return tieneONoVelocidadCrucero;
    }

    public void setTieneONoVelocidadCrucero(double tieneONoVelocidadCrucero) {
        this.tieneONoVelocidadCrucero = tieneONoVelocidadCrucero;
    }

    public double getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(double numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public double getTieneONoAbs() {
        return tieneONoAbs;
    }

    public void setTieneONoAbs(double tieneONoAbs) {
        this.tieneONoAbs = tieneONoAbs;
    }

    public double getTieneONoSensoresColision() {
        return tieneONoSensoresColision;
    }

    public void setTieneONoSensoresColision(double tieneONoSensoresColision) {
        this.tieneONoSensoresColision = tieneONoSensoresColision;
    }

    public double getTieneONoSensorDeTrafico() {
        return tieneONoSensorDeTrafico;
    }

    public void setTieneONoSensorDeTrafico(double tieneONoSensorDeTrafico) {
        this.tieneONoSensorDeTrafico = tieneONoSensorDeTrafico;
    }

    public double getTieneONoAsistenteDePermanencia() {
        return tieneONoAsistenteDePermanencia;
    }

    public void setTieneONoAsistenteDePermanencia(double tieneONoAsistenteDePermanencia) {
        this.tieneONoAsistenteDePermanencia = tieneONoAsistenteDePermanencia;
    }

    @Override
    public String toString() {
        return "Sedan [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", tieneONoAireAcondicionado=" + tieneONoAireAcondicionado
                + ", tieneONoCamaraReversa=" + tieneONoCamaraReversa + ", tieneONoVelocidadCrucero="
                + tieneONoVelocidadCrucero + ", numeroBolsasAire=" + numeroBolsasAire + ", tieneONoAbs=" + tieneONoAbs
                + ", tieneONoSensoresColision=" + tieneONoSensoresColision + ", tieneONoSensorDeTrafico="
                + tieneONoSensorDeTrafico + ", tieneONoAsistenteDePermanencia=" + tieneONoAsistenteDePermanencia + "]";
    }

    




}
