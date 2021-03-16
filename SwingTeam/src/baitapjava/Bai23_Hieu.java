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
public class Bai23_Hieu {
    public static int kiemtra(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                s=s+i;
        }
        if(s==n)
            return 1;
        else
            return 0;
    }
    public static void xuat(int n){
        for(int i=1;i<n;i++){
            int kt=kiemtra(i);
            if(kt==1)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số:");
        int so=sc.nextInt();
        System.out.print("Các số hoàn hảo nhỏ hơn "+so+" là: ");
        xuat(so);
        System.out.println("Bạn có muốn làm tiếp không ? (c/k)");
            String line=new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }
        while(true);
        System.out.println("Bye. See you later");
    }
}
