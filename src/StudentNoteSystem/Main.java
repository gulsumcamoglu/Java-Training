package StudentNoteSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut",076567,"PHYS");
        Teacher t2 = new Teacher("Zeynep",076567,"HIST");
        Teacher t3 = new Teacher("Hazal",076567,"CHEM");
        Course c1 = new Course("physic",101,"PHYS");
        c1.addTeacher(t1);
        Course c2 = new Course("hist",101,"HIST");
        c2.addTeacher(t2);
        Course c3 = new Course("Chem",101,"CHEM");
        c3.addTeacher(t3);
        //c1.printTeacher();
        Student s1 = new Student("Mehmet",123,"Senior",c1,c2,c3);
        s1.addBulkQuizNote(90,34,56);
        s1.addBulkExamNote(100,200,50);
        s1.isPass();


        Student s2 = new Student("Seda",1235,"Senior",c1,c2,c3);
        s2.addBulkExamNote(100,23,78);
        s2.addBulkQuizNote(88,78,56);
        s2.isPass();




















    }
}
