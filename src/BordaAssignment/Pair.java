package BordaAssignment;

public class Pair {
    double x;
    double y;
    Pair(){

    }
    Pair(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    @Override
    public String toString() {
        return x +", "+ y;
    }
}
