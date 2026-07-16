package hocTrenLop;

public class Mathtrongjava {
    public static void main(String[] args) {
        System.out.println("PI ₫ " + Math.PI);
        //trị tuyệt đối
        int a = -9;
        System.out.println("trị tuyệt đối của -9: " + Math.abs(a));
        //max, min
        System.out.println("max giữa 1 và 8: " + Math.max(1, 8));
        System.out.println("min giữa 8 và 1: " + Math.min(8, 1));
        //căn bậc 2
        System.out.println("căn bậc 2 của 2 = " + Math.sqrt(2));
        //lũy thừa
        System.out.println("lũy thừa của 2^3: " + Math.pow(2, 3));
        //sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI * goc / 180);
        double cos = Math.cos(Math.PI * goc / 180);
        double tan = Math.tan(Math.PI * goc / 180);
        System.out.println("sin 90 = " + sin);
        System.out.println("cos 90 = " + cos);
        System.out.println("tan 90 = " + tan);
    }
}
