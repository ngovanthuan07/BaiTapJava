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
public class Bai22_Hieu {
    public static void uocso(int n){   
        int count=0,sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                sum=sum+i;
                System.out.print(i+" ");
                
            }           
        }
        System.out.println("\n");
        System.out.println("Có "+count+" ước số");
        System.out.println("Tổng các ước số: "+sum);
    }
    public static void main(String[] args) {
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số:");
        int so=sc.nextInt();
        uocso( so);
        System.out.println("Bạn có muốn làm tiếp không ? (c/k)");
            String line=new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }while(true);
        System.out.println("Bye. See you later");
        
    }
    
}
