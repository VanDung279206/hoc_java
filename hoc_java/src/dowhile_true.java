import java.util.Scanner;

public class dowhile_true {
    static void main(String[] args) {
        /*//tính tổng các số từ 1 đến 5
        int a = 1;
        int tong = 0;//
        do {
            tong += a;
            a++;
        } while (a <= 5);
        System.out.println("tong = " + tong);*/

        Scanner sc = new Scanner(System.in);
        double x;
        do {
            System.out.println("nhập vào 1 số thực x: ");
            x = sc.nextDouble();
        } while (x < 10 || x > 100);
    }
}
