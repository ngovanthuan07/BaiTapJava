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
public class Bai16_Toan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, m, dow, d, top, y1, m1;
        System.out.println("Nhap nam: ");
        y = sc.nextInt();
        m = 1;
        y1 = y - (14 - m) / 12;
        m1 = m + 12 * ((14 - m) / 12) - 2;
        dow = (1 + y1 + y1 / 4 - y1 / 100 + y1 / 400 + (31 * m1) / 12) % 7;
        for ( m = 1; m <= 12; ++m ) {
            System.out.println("\nThang "+m );
            switch ( m ) {
                case 4: case 6: case 9: case 11: top = 30; break;
                case 2: top = 28 + (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 1 : 0);
                default: top = 31;
            }
            System.out.println(" S M T W T F S" );
            for ( d = 0; d < dow; ++d )
                System.out.print("  ");
            for ( d = 1; d <= top; ++d ) {
                System.out.print(" "+d );
                if (( dow + d ) % 7 == 0 )
                    System.out.println();
            }
            dow = ( dow + top ) % 7;
            if(dow == 0)
                System.out.println("");

        }
    }
}
