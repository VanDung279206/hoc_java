package hocTrenLop;

public class giaibtap_16 {
    static void main(String[] args) {
        int gt = 1;
        int tong = 0;
        for (int i = 1; i<= 10; i++){
            gt *= i;
            tong += gt;
        }
        System.out.println(tong);
    }
}
