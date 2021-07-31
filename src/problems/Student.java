package problems;

public class Student {
    String name;
    Student(String name) {
        this.name = name;
    }

    public String nameAdd(Student s){
        return name + s.name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raj");
        Student s2 = new Student("Ramayampeta");
        System.out.println(s1.nameAdd(s2));
    }
}
