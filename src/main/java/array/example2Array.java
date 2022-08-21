package array;

import java.util.Scanner;

public class example2Array {
    public static void main(String[] args) {
//        1. Nhap mang so thuc gom 10 phan tu
//              Tinh hieu cac phan tu cua mang
//        2. Nhap mang so thuc co 10 phan tu
//              Tim phan tu lon nhat va nho nhat
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
