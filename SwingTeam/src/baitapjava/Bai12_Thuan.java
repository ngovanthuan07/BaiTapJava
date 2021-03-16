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
public class Bai12_Thuan {

    public static void main(String[] args) {
        double a1, b1, c1, a2, b2, c2, Dx, Dy, D;
        System.out.println("Nhap a1, b1, c1: ");
        a1 = new Scanner(System.in).nextInt();
        b1 = new Scanner(System.in).nextInt();
        c1 = new Scanner(System.in).nextInt();
        System.out.println("Nhap a1, b1, c1: ");
        a2 = new Scanner(System.in).nextInt();
        b2 = new Scanner(System.in).nextInt();
        c2 = new Scanner(System.in).nextInt();

        D = (a1 * b2 - a2 * b1);
        Dx = (c1 * b2 - c2 * b1);
        Dy = (a1 * c2 - a2 * c1);
        System.out.println((D == 0) ? (Dx == 0 && Dy == 0) ? "Phuong trinh vo dinh" : "Phuong trinh vo nghiem" : "x = " + Dx / D + "\ny = " + Dy / D);
    }
}
