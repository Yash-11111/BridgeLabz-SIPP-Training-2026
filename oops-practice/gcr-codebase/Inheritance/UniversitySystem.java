class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Student extends Person {
    private final int studentId;
    private double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nStudent ID: " + studentId +
               "\nGPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nThesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent g = new GradStudent(
                "Rahul",
                24,
                101,
                9.1,
                "Artificial Intelligence"
        );

        System.out.println(g);

        System.out.println("\nIS-A Relationship");
        System.out.println(g instanceof GradStudent);
        System.out.println(g instanceof Student);
        System.out.println(g instanceof Person);
    }
}