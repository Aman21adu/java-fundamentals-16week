import java.io.*;
import java.util.*;

class Species implements Serializable {
    private String name;
    private int population;
    private double growthRate;

    public Species(String name, int population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Growth Rate: " + growthRate);
        System.out.println();
    }
}

public class SpeciesSerializationDemo {
    public static void main(String[] args) {

        Species s1 = new Species("Wolf", 500, 12.5);
        Species s2 = new Species("Eagle", 120, 7.0);

        try {
            System.out.println("Writing objects to species.records...");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("species.records"));
            out.writeObject(s1);
            out.writeObject(s2);
            out.close();

            System.out.println("Reading objects back...");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("species.records"));

            Species a = (Species) in.readObject();
            Species b = (Species) in.readObject();

            in.close();

            a.writeOutput();
            b.writeOutput();

        } catch (IOException e) {
            System.out.println("I/O Error");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
