import java.util.Scanner;

public class Volleyball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double saturdays= 48-h;
        double nowork=0.75*saturdays;
        double total = (nowork+h+(2.0/3.0*p));

        if ("leap".equals(year)){
            total=Math.floor(total+0.15*total);
            System.out.println(total);
        }else

        System.out.println(Math.floor(total));
    }
}
