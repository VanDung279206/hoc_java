package commit;

import java.util.Scanner;

public class while_loop {
    static void main(String[] args) {
       /* int x = 0;
        while (x <= 5) {
            System.out.println("x = " + x);
            x++;
        } */

        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số nguyên từ 1-99: ");
        int n = sc.nextInt();
        while (n < 1 || n > 99) {
            System.out.println("số bạn nhập không nằm trong 1-99, nhập lại: ");
            n = sc.nextInt();
        }
        System.out.println("đã nhập xong n = " + n);
    }
}
