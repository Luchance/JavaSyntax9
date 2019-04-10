import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        double a, b, c;
        double x1, x2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextDouble();
        System.out.println("Enter b");
        b = scanner.nextDouble();
        System.out.println("Enter c");
        c = scanner.nextDouble();
        scanner.close();

//        ax2 + bx + c = 0

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        if (discriminant > 0) {
            System.out.println("Roots: " + x1 + ", " + x2);
        } else if (discriminant == 0) {
            System.out.println("Only one root.");
            System.out.println("Root: " + x1);
        } else {
            System.out.println("It has Complex Roots.");
            x1 = -b / (2 * a);
            x2 = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots: " + x1 + " + " + x2 + " " + x1 + " - " + x2);
        }
    }
}
