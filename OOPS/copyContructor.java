public class copyContructor {
public static void main(String[] args) {
    Student s1=new Student();
    s1.name="akhil";
    s1.rolll=2;

    Student s2=new Student(s1);
    s2.rolll=3;
}

    static class Student{
        String name;
        int rolll;

        Student(){

        }

        Student(Student s2){
            this.name=s2.name;
            this.rolll=s2.rolll;

        }

    }
}
