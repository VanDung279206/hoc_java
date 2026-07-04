import java.util.Scanner;

public class giaibtap_13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số a từ bàn phím: ");
        double a = sc.nextDouble();
        if (a % 2 == 0) {
            double tong = 0;
            for (int i = 0; i <= a; i += 2) {
                tong += i;
            }
            System.out.println("tổng các số chẵn từ o đến "+a+" = " + tong);
        } else {
            System.out.println("tôi không tính số lẻ, bye bye");
        }
    }
}
