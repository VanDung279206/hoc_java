package commit;

import java.util.Scanner;

public class giaibtap_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào tổng 2 số: ");
        double tong = sc.nextDouble();
        System.out.println("mời nhập vào hiệu 2 số: ");
        double hieu = sc.nextDouble();
        double x = (tong + hieu)/2;
        double y = tong - x;
        System.out.println("x = " + x + "; y = " + y);
        System.out.println("hoặc x = " + y + "; y = " + x);
    }
}
