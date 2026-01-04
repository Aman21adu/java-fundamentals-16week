public class Species {
    private String name;
    private int population;
    private double growthRate;

    public void setSpecies(String n, int p, double g) {
        if (p >= 0 && g >= 0) {
            name = n;
            population = p;
            growthRate = g;
        } else {
            System.out.println("Invalid values! Population and growth rate must be non-negative.");
        }
    }

    public double getPopulationIn10Years() {
        return population * Math.pow(1 + growthRate / 100, 10);
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Growth Rate: " + growthRate);
    }
}
