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
public class Bai13_Thuan {
    
    public static void main(String[] args) {
     int d,m,y,dayofweek,myMonth;
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
        
        
        switch ( m ) 
        { 
            case 4: case 6: case 9: case 11: myMonth = 30; break;
            case 2: myMonth = 28 + (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 1 : 0); break;
            default: myMonth = 31;
        }      
        
        
        do {            
            System.out.print("\nNhap vao ngay: ");
            d = new Scanner(System.in).nextInt();
            if ( d < 1 || d > myMonth )
                System.err.println("Ngay khong hop le"); 
        } while (d < 1 || d > myMonth);

        y -= ( 14 - m ) / 12;
        m += 12 * ( ( 14 - m ) / 12 ) - 2;

        dayofweek = (d + y + y/4 - y/100 + y/400 + (31 * m)/12) % 7;
        System.out.println((dayofweek == 0) ? "Chu Nhat" : "Thu "+ ++dayofweek);
    }

}
