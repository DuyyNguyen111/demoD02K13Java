package array;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class exampleArray {
    public static void main(String[] args) {
//        Nhap mang gom 10 so thuc. Sap xep mang theo chieu tang dan
        Scanner input = new Scanner(System.in);
        float arr[] = new float[10];
        float temp;
        for ( int i = 0; i < arr.length; i++){
            System.out.print(" arr[" + i + "] : ");
            arr[i] = input.nextFloat();
        }
        for ( int i = 0; i < arr.length - 1; i ++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(" Mang sap xep theo thu tu tang dan la: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
