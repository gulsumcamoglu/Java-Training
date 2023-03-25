package StudentNoteSystem;

public class Course {
    String name;
    int code;
    String prefix;
    double note;
    double quizNote;
    Teacher teacher;
    Course(String name,int code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.quizNote = 0;
        this.note = 0;

    }
    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch))
            this.teacher = t;
        else
            System.out.println("teacher and course branch dont macht");

    }

    void printTeacher(){
        if (this.teacher !=null)
            System.out.println(this.name+" dersinin hocası "+this.teacher.name);
        else
            System.out.println("not yet given any teacher to "+this.name);
    }
}
