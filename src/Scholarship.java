import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double scho1 = 0;
        double scho2 = 0;

        if (b >= 5.50) {
            scho2 = b * 25;
        }
        if (c > a) {
            scho1 = 0.35 * c;

        }
        if (b > 4.50 & c > a & b < 5.50) {
            System.out.printf("You get a Social scholarship %.0f BGN", scho1);
        } else if (b >= 5.50 & scho2 > scho1) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", scho2);
        } else if (b >= 5.50 & scho1 > scho2 & c>a) {
            System.out.printf("You get a Social scholarship %.0f BGN", scho1);
        }else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}