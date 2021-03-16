package baitapjava;

import java.util.Scanner;

public class Bai5_Hung {

    public static double dientich(luutoado a, luutoado b, luutoado c) {
        return 1.0 * Math.abs(a.x * b.y - b.x * a.y + b.x * c.y - c.x * b.y + c.x * a.y - a.x * c.y);
    }

    public static void main(String[] args) {
        luutoado A = new luutoado();
        luutoado B = new luutoado();
        luutoado C = new luutoado();
        luutoado M = new luutoado();
        double sABC, sABM, sBCM, sACM;
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap toa do A : ");
        System.out.println("xA : ");
        A.x = nhap.nextDouble();
        System.out.println("yA : ");
        A.y = nhap.nextDouble();
        System.out.println("nhap toa do B : ");
        System.out.println("xB : ");
        B.x = nhap.nextDouble();
        System.out.println("yB : ");
        B.y = nhap.nextDouble();
        System.out.println("nhap toa do C : ");
        System.out.println("xC : ");
        C.x = nhap.nextDouble();
        System.out.println("yC : ");
        C.y = nhap.nextDouble();
        System.out.println("nhap toa do M : ");
        System.out.println("xM : ");
        M.x = nhap.nextDouble();
        System.out.println("yM : ");
        M.y = nhap.nextDouble();
        sABC = dientich(A, B, C);
        sABM = dientich(A, B, M);
        sBCM = dientich(B, C, M);
        sACM = dientich(A, C, M);
        if (sABC == (sABM + sBCM + sACM)) {
            System.out.println("diem M nam trong tam giac ABC ");
        } else {
            System.out.println("diem M khong nam trong tam giac ABC ");
        }
    }
}
