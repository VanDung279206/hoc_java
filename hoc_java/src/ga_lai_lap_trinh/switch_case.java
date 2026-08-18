package ga_lai_lap_trinh;

import java.util.Scanner;

public class switch_case {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời nhập vào 1 số nguyên: ");
        int n = sc.nextInt();

        //kiểm tra số dư của a cho 2
        int div = n % 2;
        switch (div) {
            case 0:
                System.out.println(n + " là số chẵn");
                break;
            default:
                System.out.println(n + " là số lẻ");
                break;
        }

    }
}
