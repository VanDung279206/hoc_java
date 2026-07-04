public class xulyngoaile {
    static void main(String[] args) {
        int a = 10;
        int b = 0;


        try{
            int c = a/b;
            System.out.println("c = " + c);
        }catch (Exception ex){
            System.out.println("có lỗi r bu nó ơi...");
            ex.printStackTrace();
        }

        System.out.println("đoạn code phía sau");
    }
}
