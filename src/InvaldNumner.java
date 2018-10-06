import java.util.Scanner;

public class InvaldNumner {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int input = Integer.parseInt(scanner.nextLine());

        if (input !=0 && (input <100 || input >200))
        {System.out.printf("invalid");


        }

    }
}