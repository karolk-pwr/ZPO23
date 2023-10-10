import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj prędkość: ");
        double v0 = scanner.nextDouble();
        System.out.println("Podaj kąt uderzenia: ");
        double angle = scanner.nextDouble();
        double angle_radian = Math.toRadians(angle);

        scanner.close();

        if (v0 < 0 || angle < 0 || angle > 90) {
            System.out.println("Nieprawidłowe dane wejściowe.");
        } else {
            double distance = (Math.pow(v0, 2) * Math.sin(2 * angle)) / 9.81;
            double maxHeight = (Math.pow(v0, 2) * Math.sin(2 * angle) * Math.sin(2 * angle) / (2 * 9.81));

            System.out.println("Zasięg: " + distance + " m");
            System.out.println("Maksymalna wysokość: " + maxHeight + " m");
        }
    }
}
