package ga_lai_lap_trinh;

public class continue_break {
    static void main(String[] args) {
        //tính tổng từ 1-5 nhưng bỏ qua số 3
        int tong = 0;
        for (int i =0; i<=5; i++){
            if (i == 3)
                continue;
            tong += i;
        }
        System.out.println("tổng = "+tong);//

        //break
        int n = 0;
        while (n < 100){
            System.out.println("n = "+n);
            if(n == 15)
                break;
            n++;
        }
    }
}
