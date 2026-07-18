package ga_lai_lap_trinh;

import java.util.Scanner;

public class giaibtap_08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời nhập vào hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("mời nhập vào hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("mời nhập vào hệ số c: ");
        double c = sc.nextDouble();

        // tính delta
        double delta = b * b - (4 * a * c);

        //kiểm tra điều kiện
        if (delta < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)));
        } else {
            System.out.println("phương trình có 2 nghiệm phân biệt.\n x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
