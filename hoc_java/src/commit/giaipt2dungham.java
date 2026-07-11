package commit;

import java.util.Scanner;

public class giaipt2dungham {
    public static void main(String[] args) {
        double[] x = nhap();
        System.out.println(giaiptb2(x[0], x[1], x[2]));
    }

    //hàm nhập
    public static double[] nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        System.out.println("nhập c: ");
        double c = sc.nextDouble();
        return new double[] {a, b, c};
    }

    //hàm giải phương trình bậc 2
    public static String giaiptb2(double a, double b, double c) {
        //nếu a = 0 thì phương trình không phari là phương trình bậc 2
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "phương trình bậc nhất vo số nghiệm";
            } else if (b == 0 && c != 0) {
                return "phương trình bâc nhất vo nghiệm";
            } else {
                return "phương trình bậc nhất có nghiệm: " + (-c / b);
            }
        } else {
            //giải phương trình bậc 2
            double delta = Math.pow(b, 2) - (4 * a * c);
            if (delta < 0) {
                return "phương trình bậc 2 vo nghiệm";
            } else if (delta == 0) {
                return "phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "phương trình bậc 2 có 2 nghiệm phân biệt x1 = " + x1 + "\nx2 = " + x2;
            }
        }
    }
}
