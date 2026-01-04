public class Species {
    private String name;
    private int population;
    private double growthRate;

    public Species(String name, int population, double growthRate) {
        set(name, population, growthRate);
    }

    public Species() {
        this("unknown", 0, 0.0);
    }

    public void set(String n, int p, double g) {
        if (n == null) n = "unknown";
        if (p < 0) p = 0;
        if (g < 0) g = 0.0;
        this.name = n;
        this.population = p;
        this.growthRate = g;
    }

    public void setName(String name) { if (name != null) this.name = name; }
    public void setPopulation(int population) { if (population >= 0) this.population = population; }
    public void setGrowthRate(double growthRate) { if (growthRate >= 0) this.growthRate = growthRate; }

    public String getName() { return name; }
    public int getPopulation() { return population; }
    public double getGrowthRate() { return growthRate; }

    public void writeOutput() {
        System.out.println(name + ", " + population + ", " + growthRate);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Species)) return false;
        Species other = (Species) o;
        return this.name.equals(other.name)
            && this.population == other.population
            && Double.compare(this.growthRate, other.growthRate) == 0;
    }

    // Attempts to modify a primitive parameter (no effect on caller)
    public void tryToChange(int x) {
        x = x + 1000;
    }

    // Reassigns the parameter reference (no effect on caller)
    public void tryToReplace(Species other) {
        other = new Species("replaced", 0, 0.0);
    }

    // Copies field values from this to other (modifies the actual object's fields)
    public void change(Species other) {
        if (other == null) return;
        other.name = this.name;
        other.population = this.population;
        other.growthRate = this.growthRate;
    }
}

class SpeciesRefLab {
    public static void main(String[] args) {
        Species a = new Species("Frog", 1000, 0.1);
        Species b = new Species("Frog", 1000, 0.1);

        System.out.println("a == b ? " + (a == b));
        System.out.println("a.equals(b) ? " + a.equals(b));

        // aliasing
        Species c = a;
        c.setName("a.name changed via alias");
        System.out.println("-- after alias c=a and modifying c.name --");
        a.writeOutput();

        System.out.println("-- tryToChange(primitive) --");
        int primitive = 5;
        a.tryToChange(primitive);
        System.out.println("caller variable unchanged");

        System.out.println("-- tryToReplace(object reference) --");
        a.tryToReplace(b);
        System.out.println("no effect on caller");

        System.out.println("-- change(object fields) --");
        Species source = new Species("NewSpecies", 42, 0.5);
        source.change(b);
        System.out.println("target object fields updated");
        b.writeOutput();
    }
}