package ga_lai_lap_trinh;

import java.util.Scanner;

public class toantu3ngoi {
    static void main(String[] args) {
        // nhập vào bàn phím 1 số, ktra tính chẵn lẻ
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào 1 số: ");
        int a = sc.nextInt();
        String traloi = (a % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println("số " + a + " là số " + traloi);
    }
}
