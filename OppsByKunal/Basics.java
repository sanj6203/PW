package OppsByKunal;

public class Basics {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks=45.3f;
        s1.rollno=343434;
        s1.name="priyanshu";
        Student s2 = new Student();
        s2.marks=43.3f;
        s2.rollno=3453434;
        s2.name="Bikash";
        Student s3 = new Student();
        s3.marks=73.3f;
        s3.rollno=3436632;
        s3.name="sanjeet";
        Student s4 = new Student();
        s4.marks=76.3f;
        s4.rollno=3985398;
        s4.name="Rohit";
        Student[] st= new Student[4];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;
        st[3]=s4;
        for (Student a: st
             ) {
            System.out.println(a.name+" " + a.rollno +" "+ a.marks);
        }


    }

}
class Student{
    int rollno;
    String name;
    float marks;
}
