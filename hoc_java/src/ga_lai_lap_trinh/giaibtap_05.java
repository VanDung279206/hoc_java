package ga_lai_lap_trinh;

import java.util.Scanner;

public class giaibtap_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();
        System.out.print("nhập cân nặng: ");
        double canNang = sc.nextDouble();
        double BMI = canNang / (chieuCao * chieuCao);
        if (BMI < 15) {
            System.out.println("thân hình quá gầy");
        } else if (BMI < 16) {
            System.out.println("thân hình gầy");
        } else if (BMI < 18.5) {
            System.out.println("thân hình hơi gầy");
        } else if (BMI < 25) {
            System.out.println("thân hình bình thường");
        } else if (BMI < 30) {
            System.out.println("thân hình hơi béo");
        } else if (BMI < 35) {
            System.out.println("thân hình béo");
        } else {
            System.out.println("thân hình quá béo");
        }
    }
}
