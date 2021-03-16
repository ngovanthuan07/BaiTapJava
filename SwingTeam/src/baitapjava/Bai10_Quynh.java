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
public class Bai10_Quynh {
    public static void main(String[]args)
    {
        Scanner nhap = new Scanner(System.in);
        String so;
        int kt,s1=0,s2=0,dodai, i, x;
        do{
            System.out.println("Mời bạn nhập: (Nhập 0 để thoát) ");
            so = nhap.nextLine();
            dodai=so.length();
            kt=Integer.parseInt(""+so.charAt(dodai-1));
            for(i=1;i<=dodai-1;i+=2)
                    s1+=Integer.parseInt(""+so.charAt(i-1));
            for(i=2;i<=dodai-1;i+=2){
                    x=Integer.parseInt(""+so.charAt(i-1));
                    if((x*2)<10)           
                        s2+=(x*2);
                    else
                    {
                        int sodu=0;
                        x*=2;
                        sodu=x%10;
                        x/=10;
                        s2+=x+sodu;
            }  
        }
        if((s1+s2+kt)%10==0)
            System.out.println("SIN hop le!");
       else
            System.out.println("SIN khong hop le!");
   }while(!"0".equals(so));
   }
}
