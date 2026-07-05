public class ham {
    public static void main(String[] args) {
int kq = cong(1, 2, 3);
        System.out.println("tổng các số = "+kq);
        xinchao("mae");
    }

    public static int cong(int x, int y, int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x + y + z;
    }

    //hàm thủ tục
    public static void xinchao(String gioitinh){
        if(gioitinh.equals("female")){
            System.out.println("xin chào, tôi là nhân viên nữ");
        }else if (gioitinh.equals("male")){
            System.out.println("xin chào, tôi là nhân viên nam");
        }else{
            System.out.println("tôi là giới tính thứ 3");
        }
    }
}
