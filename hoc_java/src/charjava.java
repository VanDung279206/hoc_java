import java.util.Scanner;

public class charjava {
    public static void main(String[] args) {
        //khai báo
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch2);
        char ch3;   //khai báo//
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào 1 ký tự: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("ký tự vừa nhập: " + ch4);
        //so sánh
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('b', 'a'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';

        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch7));
    }
}
