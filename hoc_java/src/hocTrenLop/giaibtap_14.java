package hocTrenLop;

import java.util.Scanner;

public class giaibtap_14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            if(i == 3)
                continue;
            tong += i;
        }
        System.out.println("tổng các số lẻ từ 1 đến " + n + " = " + tong);
    }
}
