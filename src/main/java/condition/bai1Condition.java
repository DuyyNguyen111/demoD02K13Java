package condition;

import java.util.Scanner;

public class bai1Condition {
    public static void main(String[] args) {
        //khai bao a,b,c
        int a,b,c;
        Scanner input = new Scanner(System.in);
        //nhap du lieu a,b,c
        System.out.print("a= ");
        a=input.nextInt();
        System.out.print("b= ");
        b=input.nextInt();
        System.out.print("c= ");
        c=input.nextInt();
        if(a>0&&b>0&&c>0){
            if(a+b>c&&a+c>b&&b+c>b){
                System.out.print("a,b,c la 3 canh cua 1 tam giac");
            }
            else{
                System.out.print("a,b,c khong la canh cua tam giac");
            }
        }
        else{
            System.out.print("a,b,c khong la canh cua tam giac");
        }

    }
}
