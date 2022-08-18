package loop;

import java.util.Scanner;

public class example4Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hight;
        System.out.print("Nhap vao chieu cao: ");
        hight = input.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
