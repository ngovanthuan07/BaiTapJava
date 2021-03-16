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
public class Bai17_Toan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, m, dow, s, i, p, top = 0, d;
        System.out.println("Nhap nam: ");
        y = sc.nextInt();
        System.out.println("Nhap thu cho ngay dau tien cua nam: ");
        dow = sc.nextInt();
        System.out.println("Nhap thang: ");
        s = 0;
        m = sc.nextInt();
        for (i = 1; i <= m; ++i, s += top) {
            switch (i) {
                case 4:
                case 6:
                case 9:
                case 11:
                    top = 30;
                    break;
                case 2:
                    top = 28 + (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 1 : 0);
                    break;
                default:
                    top = 31;
            }
        }
        s -= top;
        for (p = 0, i = dow; i < s + dow; ++i) {
            if (i % 7 == 0) {
                p = (p + 1) % 5;
            }
        }
        dow = i % 7;
        System.out.println("    Sun    Mon       Tue     Wen    Thu    Fri        Sat");
        for (d = 0; d < dow; ++d) {
            System.out.print("       " + ' ');
        }
        for (d = 1; d <= top; ++d) 
        {
            System.out.print("   " + d);
            if ( ( dow + d - 1 ) % 7 != 0) {
                String P = "ABCDE";
                System.out.print("["+P.charAt(p)+"]");
                p = (p + 1) % 5;

            } else {
                System.out.print(" [ ]");
            }
            if ((dow + d) % 7 == 0) {
                System.out.println("");
            }
        }
        if ((dow + top) % 7 == 0) {
            System.out.println("");
        }
        System.out.println("");
    }
}
