package baitapjava;
import java.util.Scanner;
public class Bai2_Hung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tọa độ xA:");
        double xA = scanner.nextDouble();
        System.out.println("Nhập vào tọa độ yA:");
        double yA = scanner.nextDouble();
        System.out.println("Nhập vào tọa độ xB:");
        double xB = scanner.nextDouble();
        System.out.println("Nhập vào tọa độ yB:");
        double yB = scanner.nextDouble();
        double area = Math.sqrt((xB-xA)*(xB-xA) + (yB-yA)*(yB-yA));
        System.out.println("khoảng cách hai điểm A và B là:"+area);
    }
}
