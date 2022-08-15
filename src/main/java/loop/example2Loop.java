package loop;

import java.util.Scanner;

public class example2Loop {
    public static void main(String[] args) {
//        Tinh n giai thua voi n nhap tu ban phim

//        Khai bao gt, i, n
        int gt = 1, i = 1, n;
//        Khai bao doi tuong Scanner
        Scanner input = new Scanner(System.in);
//        Nhap n
        System.out.print("n = ");
        n = input.nextInt();
//        Kiem tra n
        if(n < 0){
            System.out.println("n khong co giai thua");
        } else if (n == 0) {
            System.out.println("n! = " + gt);
        } else {
            for (i = 1; i <= n; i++){
                gt *= i;
            }
            System.out.println("n! = " + gt);
        }
    }
}
