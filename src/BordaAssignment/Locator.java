package BordaAssignment;

public class Locator {
    double x;
    double y;
    double rotz;
    double azimuth;
    Locator(double x, double y, double rotz, double azimuth){
        this.x = x;
        this.y = y;
        this.rotz = rotz;
        this.azimuth = azimuth;
    }

    @Override
    public String toString() {
        return x +", "+ y+" ,"+rotz+" ,"+azimuth;
    }
}
