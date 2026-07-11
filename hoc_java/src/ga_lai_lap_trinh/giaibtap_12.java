package ga_lai_lap_trinh;

import java.util.Scanner;

public class giaibtap_12 {
    static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên n: ");
        int n = sc.nextInt();
        //for
        int gthua = 1;
        for (int i = 1; i <= n; i++) {
            gthua *= i;
        }
        System.out.println(n + "! = " + gthua);*/

        //while
        int n;
        int i = 1;
        int gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên n: ");
        n = sc.nextInt();
        while (i <= n) {
            gt *= i;
            i++;
        }
    }
}
