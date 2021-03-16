/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author ngova
 */
public class Bai20_Toan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kw;
        int  money;
        System.out.println( "Nhap so kW tieu thu: " );
        kw = sc.nextInt();
        /* cứ tính giá sàn, tiền phụ thu tính sau */
        money = kw * 500;
        /* từ kw 100 trở đi, thêm phụ thu (800 - 500) cho mỗi kw tăng thêm */
        if ( kw > 100 ) money += ( kw - 100 ) * 300;
        /* từ kw 250 trở đi, thêm phụ thu (1000 - 800) cho mỗi kw tăng thêm */
        if ( kw > 250 ) money += ( kw - 250 ) * 200;
        /* từ kw 350 trở đi, thêm phụ thu (1500 - 1000) cho mỗi kw tăng thêm */
        if ( kw > 350 ) money += ( kw - 350 ) * 500;
        System.out.println( "Chi phi: "+money );
    }
  
}
