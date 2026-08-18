package ga_lai_lap_trinh;

import java.util.Scanner;

public class tínhCS_HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.println("nhâp số thục b: ");
        double b = sc.nextDouble();
        double p = (a + b) * 2;
        double s = a * b;
        System.out.println("chu vi hình chữ nhật: " + p);
        System.out.println("diện tích hình chữ nhật: " + s);
    }
}
