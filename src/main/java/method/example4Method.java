package method;

import java.util.Scanner;

public class example4Method {
//    global variable
    public static Scanner input = new Scanner(System.in);
    public static int nhap_n(){
        int n;
        System.out.print("n = ");
        n = input.nextInt();
        return n;
    }
    public static int[] nhap_mang(int n){
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static void tinh_tong(int[] arr){
        int tong = 0;
        for(int i = 0; i < arr.length; i++){
            tong += arr[i];
        }
        System.out.println("tong = " + tong);
    }
    public static void main(String[] args) {
        int n = nhap_n();
        int[] arr = nhap_mang(n);
        tinh_tong(arr);
    }
}
