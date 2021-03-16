/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author ngova
 */
public class Bai15_Thuan {
    public static int d,m,y,myMonth;
    public static int MyMonth(int m){
        switch ( m ) 
        { 
            case 4: case 6: case 9: case 11: myMonth = 30; break;
            case 2: myMonth = 28 + (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 1 : 0); break;
            default: myMonth = 31;
        }  
        return myMonth;
    }
    public static void myCalendar(){
        do
           {
               System.out.print("Nhap vao nam: ");      
               y = new Scanner(System.in).nextInt();  
               if ( y < 1582 )
                   System.err.println("Lich Gregorian bat dau tu nam 1582");
           }while(y < 1582);
           do {            
               System.out.print("\nNhap vao thang: ");
               m = new Scanner(System.in).nextInt();
               if ( m < 1 || m > 12 ) 
                   System.err.println("Thang khong hop le");           
           } while (m < 1 || m > 12);
           
           int isMyMonth = MyMonth(m);
           
           do {            
               System.out.print("\nNhap vao ngay: ");
               d = new Scanner(System.in).nextInt();
               if ( d < 1 || d > myMonth )
                   System.err.println("Ngay khong hop le"); 
           } while (d < 1 || d > myMonth);       
    }
    public static void main(String[] args) { 
       myCalendar();
       int sum = (int) (30.42 * (m - 1)) + d;
        if(m == 2 || MyMonth(2) == 29 && m > 2) sum++;
        if(m > 2 && m < 8) sum--;
       System.out.println("Ngay thu: "+sum);
       
    }    
}
