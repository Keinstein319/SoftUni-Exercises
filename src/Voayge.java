import java.util.Scanner;

public class Voayge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spend = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                spend = 0.3 * budget;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", spend);
            } else if (season.equals("winter")) {
                spend = 0.7 * budget;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", spend);
            }}  if (budget > 100 && budget <= 1000) {
                if (season.equals("summer")) {
                    spend = 0.4 * budget;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", spend);
                } else if (season.equals("winter")) {
                    spend = 0.8 * budget;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", spend);
                }} else if (budget > 1000) {
                    spend = 0.9 * budget;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", spend);
                }


    }
}