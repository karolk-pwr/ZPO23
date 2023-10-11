import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzień, miesiąc oraz rok: ");
        int dzien = scanner.nextInt();
        int miesiac = scanner.nextInt();
        int rok = scanner.nextInt();

        try {
            String data2 = data(dzien, miesiac, rok);
            System.out.println(data2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String data(int dzien, int miesiac, int rok) {
        int dopuszczalnyDzien = 31;

        if (miesiac < 1 || miesiac > 12) {
            throw new IllegalArgumentException("Podano nieprawidlowy miesiac");
        }

        if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
            dopuszczalnyDzien = 30;
        }

        if (miesiac == 2) {
            dopuszczalnyDzien = 29;
        } else {
            dopuszczalnyDzien = 31;
        }

        if ((dzien < 1) || (dzien >= dopuszczalnyDzien)) {
            throw new IllegalArgumentException("Podano nieprawidłowy dzień.");
        }

        String nowyDzien = String.format("%02d", dzien);
        String nowyMiesiac = String.format("%02d", miesiac);
        return nowyDzien + "-" + nowyMiesiac + "-" + rok;
    }
}
