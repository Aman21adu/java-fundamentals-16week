public class SpeciesDemo {
    public static void main(String[] args) {
        Species s1 = new Species();
        Species s2 = new Species();

        s1.setSpecies("Panda", 2000, 2.5);
        s2.setSpecies("Tiger", 1000, 1.0);

        System.out.println("Species #1 Information:");
        s1.writeOutput();
        System.out.println("Projected population in 10 years: " + (int)s1.getPopulationIn10Years());
        System.out.println();

        System.out.println("Species #2 Information:");
        s2.writeOutput();
        System.out.println("Projected population in 10 years: " + (int)s2.getPopulationIn10Years());
    }
}
