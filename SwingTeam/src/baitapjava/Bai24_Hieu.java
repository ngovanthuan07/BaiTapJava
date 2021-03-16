/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai24_Hieu {
    public static int dem(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
       return count; 
    }
    public static int lastnum(int n){
        n=n%10;
        return n;
    }
    
    public static int firstnum(int n){
        int temp;
        do {
            temp = n % 10;
            n /= 10;
    } while (n > 0);
     return temp;
    }
    public static int sum(int n){
        int tmp,sum=0;
        while(n!=0){
            tmp=n%10;
            sum=sum+tmp;
            n=n/10;
        }
        return sum;
    }
    public static int songuoc(int n){
        int dv,dn=0;
while(n!=0)
{
        dv=n%10;
        dn=dn*10+dv;
        n=n/10;
}
return dn;
    }
    public static void main(String[] args) {
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số:");
        int so=sc.nextInt();
        System.out.println(so+" có "+dem(so)+" số");
        System.out.println("số cuối: "+lastnum(so));
        System.out.println("số đầu: "+firstnum(so));
        System.out.println("Tổng:"+sum(so));
        System.out.println("số đảo ngược: "+songuoc(so));
        System.out.println("Bạn có muốn làm tiếp không ? (c/k)");
            String line=new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }
        while(true);
        System.out.println("Bye. See you later");
    }
}
