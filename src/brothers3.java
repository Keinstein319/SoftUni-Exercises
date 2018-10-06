import java.util.Scanner;

public class brothers3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double b3 = Double.parseDouble(scanner.nextLine());
        double f = Double.parseDouble(scanner.nextLine());

        double work = 1 / (1 / b1 + 1 / b2 + 1 / b3);
        double workadj = work + 0.15 * work;
        double remain = Math.floor(f - workadj);

        System.out.printf("Cleaning time:%.2f", workadj);

        if (workadj < f) {
            System.out.printf("Yes, there is a surprise - time left -> %.2f hours.", remain);
        } else if (workadj > f) {
            System.out.printf("No, there isn&'t a surprise - shortage of time -> %.0f hours.", (-1 * remain));
        }

    }
}