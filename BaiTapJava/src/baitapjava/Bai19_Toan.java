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
public class Bai19_Toan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s, time;
        System.out.println("Nhap gio, phut, giay [1]: ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        time = 3600 * h + 60 * m + s;
        System.out.println("Nhap gio, phut, giay [2]: ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        time -= 3600 * h + 60 * m + s;
        if (time < 0) {
            time = -time;
        }
        System.out.println("Hieu thoi gian: " + time / 3600 + " gio ," + (time % 3600) / 60 + " phut, " + ", " + (time % 3600) % 60+" giay");
    }
}
