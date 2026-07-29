package hocTrenLop;

import java.util.Scanner;

public class timhieu_scanner {
    public static void main(String[] args) {
        //khởi tạo 1 đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // cho phép nhập chuỗi
        System.out.print("nhâp mật khẩu cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("mật khẩu cấp 1 là: " + mk1);

        // nhập số nguyên
        System.out.println("mời nhập vào 1 số nguyên k: ");
        int k = sc.nextInt();
        System.out.print("a = " + k);

        // nhập số thực
        System.out.println("mời nhập vào 1 số thực x: ");
        double x = sc.nextFloat();
        System.out.println("x = " + x);
    }
}
