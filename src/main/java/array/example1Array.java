package array;

import java.util.Scanner;

public class example1Array {
    public static void main(String[] args) {
//        Nhap 40 so nguyen tu ban phim.
//        Tinh tong cua 40 so nguyen do
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr1[] = new int[10];
        char[] arr2 = {'h', 'e', 'l', 'l', 'o'};
        String arr3 = "hello";
//        Giai bai ben tren
        int mang[] = new int[10];
        int tong = 0;
        Scanner input = new Scanner(System.in);
//        Nhap mang
        for(int i = 0; i < mang.length; i++){
            System.out.print("mang[" + i + "] = ");
            mang[i] = input.nextInt();
        }
//        Tinh tong
        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];
        }
//        in tong
        System.out.println("Tong = " + tong);
    }
}
