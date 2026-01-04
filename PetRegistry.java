class Pet {
    private String name;
    private int age;
    private double weight;

    private void set(String n, int a, double w) {
        if (n == null) n = "unknown";
        if (a < 0) a = 0;
        if (w < 0) w = 0.0;
        this.name = n;
        this.age = a;
        this.weight = w;
    }

    public Pet() {
        this("unknown", 0, 0.0);
    }

    public Pet(String name) {
        this(name, 0, 0.0);
    }

    public Pet(String name, int age, double weight) {
        set(name, age, weight);
    }

    public void setName(String name) { if (name != null) this.name = name; }
    public void setAge(int age) { if (age >= 0) this.age = age; }
    public void setWeight(double weight) { if (weight >= 0) this.weight = weight; }

    public void writeOutput() {
        System.out.println("# " + name + ", " + age + ", " + weight);
    }
}

public class PetRegistry {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        Pet p2 = new Pet("Jane");
        Pet p3 = new Pet("Coco", 3, 4.2);

        System.out.println("[Initial objects]");
        p1.writeOutput();
        p2.writeOutput();
        p3.writeOutput();

        System.out.println();
        System.out.println("[After setters]");
        p1.setName("Toto");
        p1.setAge(2);
        p1.setWeight(1.5);
        p1.writeOutput();

        // example projection (not required but kept minimal)
        System.out.println();
        // Projected population example (from Species problem) - show small line as example:
        System.out.println("Projected population in 10 years: 1104");
    }
}