public class PersonStudentDemo {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1001);
        Student s2 = new Student("Alice", 1001);

        System.out.println("Student 1:");
        s1.writeOutput();
        System.out.println();

        System.out.println("Student 2:");
        s2.writeOutput();
        System.out.println();

        System.out.println("Are they equal? " + s1.equals(s2));
    }
}

class Person {
    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    public boolean equals(Person other) {
        return this.name.equals(other.name);
    }
}

class Student extends Person {
    private int studentNumber;

    public Student() {
        super();
        this.studentNumber = 0;
    }

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    @Override
    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Student) {
            Student s = (Student) other;
            return this.getName().equals(s.getName()) &&
                   this.studentNumber == s.studentNumber;
        }
        return false;
    }
}
