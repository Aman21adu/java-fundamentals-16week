public class PolymorphismArray {
    public static void main(String[] args) {
        Person[] list = new Person[3];

        list[0] = new Person("Bob");
        list[1] = new Student("Carol", 2024);
        list[2] = new Student("David", 2025);

        for (Person p : list) {
            p.writeOutput();
            System.out.println();
        }
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

    public void writeOutput() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    @Override
    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }

    public String getName() {
        return super.getName();
    }
}
