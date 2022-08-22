package method;

import java.util.Scanner;

public class example2Method {
/*    1. Nhap 3 so thuc.
        Kiem tra 3 so do co phai canh tam giac khong
        Luu y: viet ra cac method rieng biet
      2. Nhap 3 so thuc.
        Tinh nghiem phuong trinh ax^2 + bx + c = 0
        Luu y: viet ra cac method rieng biet
*/
    public static float nhap(){
        Scanner input = new Scanner(System.in);
        float n;
        System.out.println(" Nhap so: ");
        n = input.nextFloat();
        return n;
    }

    public static void kiemtra(float n, float m, float i){
        if(m + n > i && m + i > n && n + i> m){
            System.out.println(" la 3 canh tam giac");
        }
        else{
            System.out.println(" khong la 3 canh tam giac");
        }
    }
    public static void main(String[] args){
        float a, b, c;
        a= nhap();
        b= nhap();
        c= nhap();
        kiemtra(a, b, c);
    }
}
