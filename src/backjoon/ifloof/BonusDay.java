package backjoon.ifloof;

import java.util.Scanner;

public class BonusDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("1");
        } else if (a % 100 == 0 && a % 400 == 00) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
