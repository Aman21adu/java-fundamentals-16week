import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        Rectangle rect = new Rectangle();
        rect.setDimensions(w, h);

        // rect.width = 6; // This line should cause a compile error (do not uncomment)

        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());

        input.close();
    }
}
