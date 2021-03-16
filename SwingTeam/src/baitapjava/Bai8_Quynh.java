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
public class Bai8_Quynh {
    public static void main(String[]args){
    Scanner nhap = new Scanner(System.in);
    int a , b , c;
    float x1 ,x2 ,d;
    System.out.println("Nhap vao a = (a!=0)");
    a = nhap.nextInt();
    System.out.println("Nhap vao b = ");
    b = nhap.nextInt();
    System.out.println("Nhap vao c = ");
    c = nhap.nextInt();
    System.out.println("phuong trinh ban vua nhap la : "+a+"x^2 + "+b+"x"+c+"=0");
    if(a==0){
        if(b==0)
            System.out.println("Phuong trinh vo so nghiem");
        else
            System.out.println("Phuong co nghiem : x= "+(-c/b));
    }
    d = b*b - 4*a*c;
    if(d > 0)
    {
        x1=(float)((-b + Math.sqrt(d))/(2*a));
        x2=(float)((-b - Math.sqrt(d))/(2*a));
        System.out.println("phuong trinh co 2 nghiem x1 = "+ x1 + "x2 =" + x2 +".");
    }
    else
        if(d==0)
        {
            x1=(-b/(2*a));
            System.out.println("Phuong trinh co nghiem kep : x1=x2="+x1);
        }
        else
            System.out.println("Phuong trinh vo nghiem");
    }
}
