package baitapjava;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Bai4_Hung {
    public  void tamgiac(double a, double b, double c){
        if( a<b+c && b<a+c && c<a+b ){
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                System.out.println("Day la tam giac vuong");
        else if(a==b && b==c)
                System.out.println("Day la tam giac deu");
        else if(a==b || a==c || b==c)
                System.out.println("Day la tam giac can");
        else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)    
                System.out.println("Day la tam giac tu");
        else
                System.out.println("Day la tam giac nhon");
    }
    else
            System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
    }
    public void dientich( double a, double b, double c){
         double p = (a+b+c)/2.0;
         double f = sqrt(p*(p-a)*(p-b)*(p-c));
         System.out.println("Diện tích tam giác là: "+f);
    }
    public static void main(String []args){
        Bai4_Hung obj = new Bai4_Hung();
        double a,b,c;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Nhập 3 số thực a,b,c:  ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }while(a <= 0 || b <= 0 || c <= 0);   
        obj.tamgiac(a, b, c);
        obj.dientich(a, b, c);
    }
}



