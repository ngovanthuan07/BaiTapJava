import java.util.Scanner;
public class Bai3_Hung {
    public static void main(String[] args){
        int xM, yM, xO, yO, R;
        String viTri;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào hoành độ tâm O: ");
        xO = scanner.nextInt();
        System.out.println("Nhập vào tung độ tâm O: ");
        yO = scanner.nextInt();
        System.out.println("Nhập vào hoành độ điểm M: ");
        xM = scanner.nextInt();
        System.out.println("Nhập vào tung độ điểm M: ");
        yM = scanner.nextInt();
        System.out.println("Nhập vào bán kính R: ");
        R = scanner.nextInt();
        int khoangCachOM = (yM - yO) * (xM - xO) + 
            (yM - yO) * (yM - yO);
        int banKinh = R * R;
        if (khoangCachOM < banKinh) {
            viTri = "Điểm M nằm bên trong đường tròn.";
        } else if (khoangCachOM == banKinh) {
            viTri = "Điểm M nằm trên đường tròn.";
        } else {
            viTri = "Điểm M nằm ngoài đường tròn.";
        }
        System.out.println(viTri);
    }
}
