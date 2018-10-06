import java.util.Scanner;

public class Numbers100to200 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //INPUTS
        double cost = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int tru = Integer.parseInt(scanner.nextLine());
        //PRICES
        double profitpuzzle = puzzle * 2.60;
        double profitdolls = dolls * 3.00;
        double profitbears = bears * 4.10;
        double profitmin = min * 8.20;
        double profittru = tru * 2.00;

        double totalprofit = profitbears + profitdolls + profitmin + profitpuzzle + profittru;
        int stock = puzzle + dolls + bears + min + tru;

        if (stock >= 50) {
            totalprofit = totalprofit - (totalprofit * 0.25);
        }
        totalprofit = totalprofit - (totalprofit * .10);
        double budget = Math.abs(totalprofit - cost);

        if (totalprofit >= cost) {
            System.out.printf("Yes! %.2f lv left.", budget);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", budget);
        }


        {


        }
    }
    }

