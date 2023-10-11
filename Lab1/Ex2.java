import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch referencyjny: ");
        String reference = scanner.nextLine().toLowerCase();

        int wrong = 0;
        while (true) {
            System.out.print("Podaj łańcuch do porównania: ");
            String compare = scanner.nextLine().toLowerCase();

            if (compare.equals("stop")) {
                break;
            }

            for (int i = 0; i < compare.length(); i++) {
                int id = reference.indexOf(compare.charAt(i));
                if (id == -1) {
                    wrong += 1;
                }
            }

            if (wrong == 0) {
                System.out.println("Łańcuch poprawny.");
            } else {
                System.out.println("Łańcuch zawiera niedozwolone znaki.");
            }
        }

        scanner.close();
    }
}

