package backjoon.math_1;

import java.util.Scanner;

public class BreakevenPoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println((a/(c-b))+1);
        }
    }
}
