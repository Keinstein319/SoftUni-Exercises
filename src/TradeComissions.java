import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double bonus = 0;

        if (city.equalsIgnoreCase("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                bonus = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                bonus = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                bonus = 0.08;
            } else if (sales > 10000) {
                bonus = 0.12;
            } double comiss=bonus*sales;
            System.out.printf("%.2f", comiss);
        } else if (city.equalsIgnoreCase("Varna")) {
            if (sales >= 0 && sales <= 500) {
                bonus = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                bonus = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                bonus = 0.1;
            } else if (sales > 10000) {
                bonus = 0.13;
            } double comiss=bonus*sales;
            System.out.printf("%.2f", comiss);
        } else if (city.equalsIgnoreCase("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                bonus = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                bonus = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                bonus = 0.12;
            } else if (sales > 10000) {
                bonus = 0.145;
            } double comiss=bonus*sales;
            System.out.printf("%.2f", comiss);
        } else System.out.printf("error");
    }
}