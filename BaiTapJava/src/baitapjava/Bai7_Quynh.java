/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author NGUYEN VAN QUYNH
 */
public class Bai7_Quynh {
    public static void main(String[] args)
    {
        int a,b;
        double nghiem;
        DecimalFormat nhap = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a :");
        a = sc.nextInt();
        System.out.println("Nhap b :");
        b = sc.nextInt();
        System.out.println("phuong trinh ban vua nhap la "+ a+"x +"+ b +"=0");
        if(a==0)
        {
            if(b==0)
                System.out.println("Phuong trinh vo nghiem");
            else
                System.out.println("Phuong trinh vo so nghiem");
        }
        else{
            nghiem = (double) -b / a ;
            System.out.println("Phuong trinh co nghiem x =  " + nhap.format(nghiem)+".");
    }}
}
