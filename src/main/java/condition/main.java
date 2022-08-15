package condition;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Khai bao a, b, tong
        int a;
        int b;
        int tong, hieu,tich;
        float thuong;
        boolean dung_sai;
//        Tạo đối tượng Scanner để nhập dữ liệu
        Scanner input = new Scanner(System.in);
//        Nhập dữ liệu cho a, b
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
//        Tính tổng a + b
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = (float) a / b;
//        Hiển thị tổng
        System.out.println("Tong a + b = " + tong);
        System.out.println("Hieu a - b = " + hieu);
        System.out.println("Tich a * b = " + tich);
        System.out.println("Thuong a / b = " +thuong);
    }
}
