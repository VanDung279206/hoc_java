package hocTrenLop;

import java.util.Scanner;

public class giaibtap_18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("mời nhập vào 1 số nguyên a>0: ");
            int a = sc.nextInt();
            //check điều kiện đảm bảo người dùng nhập số nguyên a > 0
            while (a <= 0) {
                System.out.println("nhập lại, a phải > 0:");
                a = sc.nextInt();
            }

            // ktra số nguyên tố
            int demuoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    demuoc++;
                }
            }
            if (demuoc == 2 ) {
                System.out.println(a + " là số nguyên tố");
            } else {
                System.out.println(a + " không phải là số nguyên tố");
            }
            System.out.println("bạn có muốn thoát không, bấm y để thoát: ");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("y") || traloi.equals("Y"))
                break;
        }
    }
}
