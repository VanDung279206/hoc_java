package hocTrenLop;

import java.util.Scanner;

public class student {
    private String msv;
    private String hoTen;
    private int tuoi;
    private String lop;
    private double diemTrungBinh;

    public student(){
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sinh vien: ");
        msv = sc.nextLine();
        System.out.print("nha ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("nhap tuoi: ");
        tuoi = new Scanner(System.in).nextInt();
        System.out.print("nhap lop: ");
        lop = new Scanner(System.in).nextLine();
        System.out.print("nhap diem trung binh: ");
        diemTrungBinh = new Scanner(System.in).nextDouble();
    }

    public void xuat(){
        System.out.println("ma sinh vien: " + msv);
        System.out.println("ho ten sinh vien: " + hoTen);
        System.out.println("tuoi sinh vien: " + tuoi);
        System.out.println("lop sinh vien: " + lop);
        System.out.println("diem trung binh: " + diemTrungBinh);
    }
}
