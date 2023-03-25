package StudentNoteSystem;

public class Student {
    String name;
    int stuNo;
    Course c1;
    Course c2;
    Course c3;
    double avg;
    String classes;
    boolean isPass;



    Student(String name,int stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avg = 0.0;
        calcAverage();
        this.isPass=false;

    }
    void addBulkExamNote(double c1,double c2 , double c3){

        if (c1>=0 && c1<=100){
            this.c1.note = c1;
        }
        if (c2>=0 && c2<=100){
            this.c2.note = c2;
        }
        if (c3>=0 && c3<=100){
            this.c3.note = c3;
        }
    }
    void addBulkQuizNote(double c1,double c2 , double c3){

        if (c1>=0 && c1<=100){
            this.c1.quizNote = c1;
        }
        if (c2>=0 && c2<=100){
            this.c2.quizNote = c2;
        }
        if (c3>=0 && c3<=100){
            this.c3.quizNote = c3;
        }
    }
    void isPass(){

        if(this.c1.note ==0.0 &&  this.c2.note == 0.0 && this.c3.note == 0.0){
            System.out.println("not yet given notes");
        }else {
            this.isPass = isCheckPass();
            printNote();
            if (this.isPass){
                System.out.println("passed");
            }
            else {
                System.out.println("Failed");
            }
        }
    }
    boolean isCheckPass(){
        calcAverage();
        return this.avg>=55;
    }
    void calcAverage(){
        double quizAvg = this.c1.quizNote*0.20 + this.c2.quizNote*0.20 + this.c3.quizNote*0.20;
        this.avg = (this.c1.note*(0.80) + this.c2.note*(0.80) + this.c3.note*(0.80)+quizAvg)/3.0;

    }
    void printNote(){
        System.out.println("--------------------");
        System.out.println(this.c1.name+" "+ this.c1.note);
        System.out.println(this.c2.name+" "+ this.c2.note);
        System.out.println(this.c3.name+" "+ this.c3.note);
        System.out.println(this.c1.name+" "+ this.c1.quizNote);
        System.out.println(this.c2.name+" "+ this.c2.quizNote);
        System.out.println(this.c3.name+" "+ this.c3.quizNote);
        System.out.println("avg: "+ this.avg);
    }

}
