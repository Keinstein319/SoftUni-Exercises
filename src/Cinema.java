import java.util.Scanner;

public class Cinema {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

String type = scanner.nextLine();
double rows = Double.parseDouble(scanner.nextLine());
double columns = Double.parseDouble(scanner.nextLine());

double Premiere = 12.00;
double Normal =7.50;
double Discount = 5.00;


switch (type){
    case "Premiere":
        double profit=Premiere*rows*columns;
        System.out.printf("%.2f leva", profit);
        break;
    case "Normal":
        double profit1=Normal*rows*columns;
        System.out.printf("%.2f leva", profit1);
        break;
    case "Discount":
        double profit2=Discount*rows*columns;
        System.out.printf("%.2f leva", profit2);
        break;
}

    }
}


