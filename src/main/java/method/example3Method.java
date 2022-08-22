package method;
import java.util.Scanner;
public class example3Method {
/*
      2. Nhap 3 so thuc.
        Tinh nghiem phuong trinh ax^2 + bx + c = 0
        Luu y: viet ra cac method rieng biet
*/
    public static int nhap(){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        n = input.nextInt();
        return n;
    }
    public static void giaiPTBac2( float a, float b, float c){
        if ( a == 0){
            if ( b == 0){
                System.out.println(" Phuong trinh vo nghiem.");
            } else {
                System.out.println(" Phuong trinh co 1 nghiem: " + " x = " + ( -c / b));
            }
            return;
        }
        float delta = b * b - 4 * a * c;
        float x1,x2;
        if ( delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println(" Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2 = " + x2 );
        } else if ( delta == 0 ){
            x1 = ( -b / ( 2 * a));
            System.out.println(" Phuong trinh co nghiem kep: " + " x1 = x2 = " + x1);
        } else {
            System.out.println(" Phuong trinh vo nghiem.");
        }
    }
    public static void main(String[] args){
        float a,b,c;
        a = nhap();
        b = nhap();
        c = nhap();
        giaiPTBac2(a,b,c);
    }
}
