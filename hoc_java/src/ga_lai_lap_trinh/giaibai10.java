package ga_lai_lap_trinh;

import java.util.Scanner;

public class giaibai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính đường tròn r: ");
        double r =sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);

        // xuất kết quả
        System.out.println("chu vi là: "+ cv);
        System.out.println("diệ tích là: " + dt);

    }
}
