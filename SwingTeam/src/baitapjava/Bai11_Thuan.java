/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ngova
 */
public class Bai11_Thuan {

    private static int h = 0;
    private static int c = 0;

    public static int Computer() {
        Random generator = new Random();
        return generator.nextInt(3);
    }

    public static void play() {
        System.out.println("Chao mung ban den voi game b-d-k");
        String human = null;
        String computer = null;
        do {
            System.out.print("Moi ban nhap vao ky tu (b-d-k):");
            human = new Scanner(System.in).nextLine();
            if ((human.equals("b") || human.equals("d") || human.equals("k")) == false) {
                System.err.println("xin moi ban nhap lai");
            }

        } while ((human.equals("b") || human.equals("d") || human.equals("k")) == false);

        switch (human) {
            case "b": {
                switch (Computer()) {
                    case 0:
                        computer = "b";
                        break;
                    case 1:
                        computer = "d";
                        h++;
                        break;
                    case 2:
                        computer = "k";
                        c++;
                        break;
                }
                break;
            }
            case "d": {
                switch (Computer()) {
                    case 0:
                        computer = "b";
                        c++;
                        break;
                    case 1:
                        computer = "d";
                        break;
                    case 2:
                        computer = "k";
                        h++;
                        break;

                }
                break;
            }
            case "k": {
                switch (Computer()) {
                    case 0:
                        computer = "b";
                        h++;
                        break;

                    case 1:
                        computer = "d";
                        c++;
                        break;

                    case 2:
                        computer = "k";
                        break;
                }
                break;
            }
        }
        System.out.println("Computer: " + computer);
        System.out.println("Ty so: " + h + "-" + c);

    }

    public static void main(String[] args) {
        while (true) {
            play();
            String tl = null;
            System.out.print("Ban co choi game b-k-d hay nua khong (yes/no): ");
            do {
                tl = new Scanner(System.in).nextLine();
                if ((tl.equalsIgnoreCase("yes") || tl.equalsIgnoreCase("no")) == false) {
                    System.err.println("Bai phai chon yes hoac no");
                }
            } while ((tl.equalsIgnoreCase("yes") || tl.equalsIgnoreCase("no")) == false);

            if (tl.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Cam on ban da choi game cua chung toi ^_^");
    }

}
