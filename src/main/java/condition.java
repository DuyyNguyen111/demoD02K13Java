import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
//        Cho số nguyên a nhập từ bàn phím. kiểm tra a là số âm hay dương.
//        Nếu a là số dương thì kiểm tra a có chia hết cho 2 không.
//        Khai báo a
        int a;
//        Nhập a
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
//        Kiểm tra a > 0???
        if(a > 0) {
            if (a % 2 == 0) {
                System.out.println("a là số dương và là số chẵn");
            }
            else {
                System.out.println("a là số dương và là số lẻ");
            }
        } else if (a == 0) {
            System.out.println("a là số không âm không dương");
        } else {
            System.out.println("a là số âm");
        }
    }
}
