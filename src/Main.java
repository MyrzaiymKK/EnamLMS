import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite distance: ");
    double distance = scanner.nextDouble();
        System.out.println(TransportType.BUS.calculateTravelCost(distance));
        System.out.println(TransportType.CAR.calculateTravelCost(distance));
        System.out.println(TransportType.TRUCK.calculateTravelCost(distance));

    }
}