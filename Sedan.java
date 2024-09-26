public class Sedan extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private String capacidadMaletero;
    private boolean tieneONoAireAcondicionado;
    private boolean tieneONoCamaraReversa;
    private boolean tieneONoVelocidadCrucero;
    private boolean numeroBolsasAire;
    private boolean tieneONoAbs;
    private boolean tieneONoSensoresColision;
    private boolean tieneONoSensorDeTrafico;
    private boolean tieneONoAsistenteDePermanencia;

    public Sedan (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, int numeroPasajeros, int numeroPuertas, String capacidadMaletero, boolean tieneONoAireAcondicionado, boolean tieneONoCamaraReversa, boolean tieneONoVelocidadCrucero, boolean numeroBolsasAire, boolean tieneONoAbs, boolean tieneONoSensoresColision, boolean tieneONoSensorDeTrafico, boolean tieneONoAsistenteDePermanencia){
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


    public boolean isTieneONoAireAcondicionado() {
        return tieneONoAireAcondicionado;
    }


    public void setTieneONoAireAcondicionado(boolean tieneONoAireAcondicionado) {
        this.tieneONoAireAcondicionado = tieneONoAireAcondicionado;
    }


    public boolean isTieneONoCamaraReversa() {
        return tieneONoCamaraReversa;
    }


    public void setTieneONoCamaraReversa(boolean tieneONoCamaraReversa) {
        this.tieneONoCamaraReversa = tieneONoCamaraReversa;
    }


    public boolean isTieneONoVelocidadCrucero() {
        return tieneONoVelocidadCrucero;
    }


    public void setTieneONoVelocidadCrucero(boolean tieneONoVelocidadCrucero) {
        this.tieneONoVelocidadCrucero = tieneONoVelocidadCrucero;
    }


    public boolean isNumeroBolsasAire() {
        return numeroBolsasAire;
    }


    public void setNumeroBolsasAire(boolean numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }


    public boolean isTieneONoAbs() {
        return tieneONoAbs;
    }


    public void setTieneONoAbs(boolean tieneONoAbs) {
        this.tieneONoAbs = tieneONoAbs;
    }


    public boolean isTieneONoSensoresColision() {
        return tieneONoSensoresColision;
    }


    public void setTieneONoSensoresColision(boolean tieneONoSensoresColision) {
        this.tieneONoSensoresColision = tieneONoSensoresColision;
    }


    public boolean isTieneONoSensorDeTrafico() {
        return tieneONoSensorDeTrafico;
    }


    public void setTieneONoSensorDeTrafico(boolean tieneONoSensorDeTrafico) {
        this.tieneONoSensorDeTrafico = tieneONoSensorDeTrafico;
    }


    public boolean isTieneONoAsistenteDePermanencia() {
        return tieneONoAsistenteDePermanencia;
    }


    public void setTieneONoAsistenteDePermanencia(boolean tieneONoAsistenteDePermanencia) {
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
