import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int ppl = Integer.parseInt(scanner.nextLine());

        double price = 0;


        if (season.equals("Spring")){
            price=3000;
        } else if (season.equals("Summer")|| season.equals("Autumn")){
            price=4200;
        } else if (season.equals("Winter")){
            price=2600;
        } if (ppl<=6){
           price=price-0.1*price;
        } else if (ppl>=7 && ppl<=11){
            price=price-0.15*price;
        }else if (ppl>12){
            price=price-0.25*price;
        } if (ppl%2==0 && !season.equals("Autumn")){
            price=price-0.05*price;
        } if (budget>=price){
            double remain = budget-price;
            System.out.printf("Yes! You have %.2f leva left.", remain);
        } else if (budget<price){
            double remain = budget-price;
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(remain));
        }
    }
}
