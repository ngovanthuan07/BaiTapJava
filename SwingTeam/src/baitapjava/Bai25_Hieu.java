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
public class Bai25_Hieu {
    public static  int ucbcnn(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return b;              
    }
    public static void main(String[] args) {
        do
        {
        Scanner hieu =new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a=hieu.nextInt();
        System.out.print("Nhập số b: ");
        int b=hieu.nextInt();
        System.out.println("UCLN["+a+","+b+"]= "+ucbcnn( a, b));
        System.out.println("BCNN["+a+","+b+"]= "+a*b/ucbcnn( a, b));
        System.out.println("Bạn có muốn làm tiếp không ? (c/k)");
            String line=new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }
        while(true);
        System.out.println("Bye. See you later");
    }
}
