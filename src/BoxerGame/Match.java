package BoxerGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("====New round=========");
                int temp = (Math.random() <= 0.5) ? 1 : 2;
                if (temp==1){
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                }else{
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                }

                System.out.println("A score: "+this.f1.health+", B score: "+this.f2.health);
            }
        }
        else System.out.println("Invalid Weight match");
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight &&
                this.f2.weight>=minWeight && this.f2.weight<=maxWeight );
    }

    boolean isWin(){
        if (this.f1.health ==0) {
            System.out.println(f2.name + " Kazandı!!!");
            return true;
        }

        if (this.f2.health ==0) {
            System.out.println(f1.name + " Kazandı!!!");
            return true;
        }

        return false;
    }
}
