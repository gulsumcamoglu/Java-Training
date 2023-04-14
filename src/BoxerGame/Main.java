package BoxerGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,100,70);
        Fighter f2 = new Fighter("B",10,130,105,60);
        Match m = new Match(f1,f2,100,105);
        m.run();
    }
}
