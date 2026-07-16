package hocTrenLop;

import java.util.Scanner;

public class giaibtap_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("mời nhập vào b: ");
        double b = sc.nextDouble();
        //cho người dùng chọn phép tính
        System.out.println("mời nhập vào phép tính: + - * /");
        String pheptinh = new Scanner(System.in).nextLine();
        switch (pheptinh) {
            case "+":
                cong(a, b);
                break;
            case "-":
                tru(a, b);
                break;
            case "*":
                nhan(a, b);
                break;
            case "/":
                chia(a, b);
                break;
            default:
                System.out.println("m nhập linh tinh cái gì đấy");
        }
    }

    //hàm cộng
    public static void cong(double a, double b) {
        double kq = a + b;
        System.out.println("kết quả của phép cộng: " + kq);
    }

    public static void tru(double a, double b) {
        double kq = a - b;
        System.out.println("kết quả của phép trừ: " + kq);
    }

    public static void nhan(double a, double b) {
        double kq = a * b;
        System.out.println("kết quả của phép nhân: " + kq);
    }

    public static void chia(double a, double b) {
        if (b == 0) {
            System.out.println("0 thì làm sao chia má ơi");
        } else {
            double kq = a / b;
            System.out.println("kết quả của phép chia: " + kq);
        }
    }
}
