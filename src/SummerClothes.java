import java.util.Scanner;

public class SummerClothes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temp = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "asdfv";
        String shoes = "aoep";

        switch (time) {
            case "Morning":
                if (temp >= 10 && temp <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");
                } else if (temp > 18 && temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");
                } else if (temp>=25){
                outfit = "T-Shirt";
                shoes = "Sandals";
                System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");}
                break;
            case "Afternoon":
                if (temp >= 10 && temp <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");
                } else if (temp > 18 && temp <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");
                } else if (temp>=25){
                    outfit = "Swim Suit";
                shoes = "Barefoot";
                System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");}
                break;
            case "Evening":
                if (temp >= 10 && temp <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");
                } else if (temp > 18 && temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");
                } else if (temp>=25){
                    outfit = "Shirt";
                shoes = "Moccasins";
                System.out.println("It's " + temp + " degrees, get your " + outfit + " and " + shoes + ".");}
                break;

            }
        }
    }
