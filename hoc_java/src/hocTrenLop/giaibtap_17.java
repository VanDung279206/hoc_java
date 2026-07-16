package hocTrenLop;

public class giaibtap_17 {
    static void main(String[] args) {
        //ktra xem 1 số có phải là số hoàn hảo hay không
        System.out.println("các số là số hoàn hảo từ 1 đến 1000 là: ");
        for(int i = 1; i <= 1000; i++){
            int tong = 0;
            for (int j =1; j <i; j++){
                if (i % j == 0){
                    tong += j;
                }
            }
            if(tong == i)
                System.out.println(i);
        }
    }
}
