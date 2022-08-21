package method;

import java.util.Scanner;

public class example1Method {
//    Nhap 2 so nguyen. Tinh tong, hieu, tich, thuong

//    Co 5 method: nhap, tinh tong, tinh hieu, tinh tich, tinh thuong

//    Method nhap
    public static int nhap(){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        n = input.nextInt();
        return n;
    }
//    Method tinh tong
    public static void tinh_tong(int n, int m){
        int tong = n + m;
        System.out.println("Tong = " + tong);
    }
//    Method tinh hieu
    public static void tinh_hieu(int a, int b){
        int hieu = a - b;
        System.out.println("Hieu = " + hieu);
    }
//    Method tinh tich
    public static void tinh_tich(int a, int b){
        int tich = a * b;
        System.out.println("Tich = " + tich);
    }
//    Method tinh thuong
    public static void tinh_thuong(int a, int b){
        double thuong = (double) a / b;
        System.out.println("Thuong = " + thuong);
    }
    public static void main(String[] args) {
        int a, b;
        a = nhap();
        b = nhap();
        tinh_tong(a, b);
        tinh_hieu(a, b);
        tinh_tich(a, b);
        tinh_thuong(a, b);
    }
}
