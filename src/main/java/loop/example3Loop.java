package loop;

import java.util.Scanner;

public class example3Loop {

//    public static boolean isprime(int n){
//        if(n <= 1){
//            return false;
//        }
//        for(int i = 2; i<= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap so nguyen n: ");
//        int n = input.nextInt();
//        if(isprime(n)) {
//            System.out.println(n + "la so nguyen to");
//        }
//        else {
//            System.out.println(n+ " khong la so nguyen to");
//        }
//    }
    public static void main(String[] args) {
        int n, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        if(n <= 1){
            System.out.println(n + " khong la so nguyen to");
        } else {
            for (int i = 2; i < n; i++){
                if(n % i == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong la so nguyen to");
            }
        }
    }
}
