import java.util.Scanner;

public class lab4task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("m"))
        {
            if (age >= 16) {
                System.out.printf("Mr.");
            } else if (age<16){
                System.out.printf("Master");
            }
        }
        if (gender.equals("f"))
        {
            if (age >= 16) {
                System.out.printf("Ms.");
            } else if (age<16){
                System.out.printf("Miss");
            }

        }
    }
}