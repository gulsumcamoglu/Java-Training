package StudentNoteSystem;

public class Teacher {
    String name;
    int mpno;
    String branch;

    Teacher(String name,int mpno,String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("adı: "+this.name);
        System.out.println("branch: "+this.branch);
    }
}
