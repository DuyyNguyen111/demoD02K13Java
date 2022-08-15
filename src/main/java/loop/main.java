package loop;

public class main {
    public static void main(String[] args) {
//        vi du: in ra cac so tu 0 den 50
        int a;
//        Vong lap for
        System.out.println("---------------------- for ------------------");
        for(a = 50; a < 50; a++){
            System.out.println(a);
        }

//        vong lap while
        System.out.println("---------------------- while ------------------");
        a = 50;
        while (a < 50){
            System.out.println(a);
            a++;
        }

//        vong lap do ... while
        System.out.println("---------------------- do ... while ------------------");
        a = 50;
        do{
            System.out.println(a);
            a++;
        } while (a < 50);
    }
}
