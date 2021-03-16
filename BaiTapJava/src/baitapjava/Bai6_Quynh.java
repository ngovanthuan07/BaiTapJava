/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;
import java.util.Scanner;
/**
 *
 * @author NGUYEN VAN QUYNH
 */
public class Bai6_Quynh {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap a = ");
        a = nhap.nextInt();
        System.out.println("Nhap b = ");
        b = nhap.nextInt();
        System.out.println("Nhap c = ");
        c = nhap.nextInt();
        if(a>b)
        {
            int t;
            t=a;
            a=b;
            b=t;
        }
        if(a>c)
        {
            int t1;
            t1=a;
            a=c;
            c=t1;
        }
        if(b>c)
        {
            int t2;
            t2=b;
            b=c;
            c=t2;
        }
        System.out.println("Tang dan = "+a+b+c);
    }
}
