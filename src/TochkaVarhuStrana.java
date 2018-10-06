//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class TochkaVarhuStrana {
    public TochkaVarhuStrana() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double saturdays = (double)(48 - h);
        double nowork = 0.75D * saturdays;
        double total = nowork + (double)h +  2.0/3* (double)p;
        if ("leap".equals(year)) {
            total = Math.floor(total + 0.15D * total);
            System.out.println(total);
        } else {
            System.out.println(Math.floor(total));
        }

    }
}
