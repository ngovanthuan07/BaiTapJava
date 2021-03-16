/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;
import static java.lang.Math.cos;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author NGUYEN VAN QUYNH
 */
public class Bai9_Quynh {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        double angle;
        float pi = (float) 3.14;
        System.out.println("Nhap so do x cua goc (phut) : ");
        angle = nhap.nextDouble();
        angle/=60;
        float kq ;
        kq = (float) Math.ceil((angle/90)%4);
        System.out.println("x thuoc goc vuong thu " + kq );
        System.out.println("cos(x) ="+cos(angle*pi/180));
    }
}

