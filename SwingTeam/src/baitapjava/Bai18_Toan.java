/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author toan
 */
public class Bai18_Toan {

    public static void main(String[] args) {
        System.out.println("Nhap vao so gio: ");
        int h = new Scanner(System.in).nextInt();
        int week = h / ( 24 * 7 );
        int day = ( h % ( 24 * 7 ) ) / 24;
        int hour = ( h % ( 24 * 7 ) ) % 24;
        System.out.println(week+" tuan," +day+" ngay,"+hour+" gio");                        
    }
}
