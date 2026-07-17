package ga_lai_lap_trinh;

import java.util.Scanner;

public class giaibtap_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời nhập vào 1 năm dương lịch: ");
        int nam = sc.nextInt();
        if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println("năm " + nam + " là năm nhuận");
        } else {
            System.out.println("năm " + nam + " không phải là năm nhuận");
        }
    }
}