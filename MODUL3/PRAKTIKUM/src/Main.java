import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static boolean repeat = true;

    public static void main(String[] args) throws InterruptedException {
        try (Scanner sc = new Scanner(System.in)) {
            Calculation calc = new Calculation();
            do {
                try {
                    System.out.println("==Menu Program==");
                    System.out.println("1. Square");
                    System.out.println("2. Circle");
                    System.out.println("3. Trapezoid");
                    System.out.println("0. Exit");
                    System.out.print("Select menu: ");
                    int pilihan = sc.nextInt();
                    sc.nextLine();
                    switch (pilihan) {
                        case 1:
                            System.out.print("Enter the length of the side of the square : ");
                            double side = sc.nextDouble();
                            calc.setSquare(side);
                            calc.run();
                            System.out.println("The calculation result: " + calc.getSquare());
                            break;
                        case 2:
                            System.out.print("Enter radius: ");
                            double radius = sc.nextDouble();
                            calc.setCircle(radius);
                            calc.run();
                            System.out.println("\nThe calculation result: " + calc.getCircle());
                            break;
                        case 3:
                            System.out.print("Enter the upper side of the trapezoid : ");
                            double a = sc.nextDouble();
                            System.out.print("Enter bottom side length: ");
                            double b = sc.nextDouble();
                            System.out.print("Enter height: ");
                            double t = sc.nextDouble();
                            calc.setTrapezoid(a, b, t);
                            calc.run();
                            System.out.println("The calculation result: " + calc.getTrapezoid());
                            break;
                        case 0:
                            System.out.println("Program Selesai");
                            break;
                        default:
                            System.out.println("Option not available");
                            continue;
                    }
                    repeat = false;
                } catch (InputMismatchException e) {
                    System.out.println("Input must be a number");
                    sc.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (repeat);
            System.out.println("Program finished");
        }

    }
}
