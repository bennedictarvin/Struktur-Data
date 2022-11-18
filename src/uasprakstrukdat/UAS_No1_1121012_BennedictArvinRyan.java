/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasprakstrukdat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Arvin Situmorang
 */
public class UAS_No1_1121012_BennedictArvinRyan {

    public static String karakterSama(String str1, String str2) {
        if (str1.length() > 0 && str2.length() > 0) {
            List<Character> ch1 = new ArrayList<Character>();
            List<Character> ch2 = new ArrayList<Character>();

            for (int i = 0; i < str1.length(); i++) {
                ch1.add(str1.charAt(i));
            }
            for (int i = 0; i < str2.length(); i++) {
                ch2.add(str2.charAt(i));
            }
            ch1.retainAll(ch2);
            StringBuilder sb = new StringBuilder();
            for (Character c : ch1) {
                sb.append(c);
            }
            return sb.toString();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama1 = scan.nextLine().toLowerCase();
        String nama2 = scan.nextLine().toLowerCase();
        if (nama1.length() <= 15 && nama1.length() <= 15) {
            int skor = 0;
            if (karakterSama(nama1, nama2).contains("z")
                    || karakterSama(nama1, nama2).contains("q")
                    || karakterSama(nama1, nama2).contains("x")
                    || karakterSama(nama1, nama2).contains("j")
                    || karakterSama(nama1, nama2).contains("k")) {
                skor += 40;
            }
            if (karakterSama(nama1, nama2).contains("v")
                    || karakterSama(nama1, nama2).contains("b")
                    || karakterSama(nama1, nama2).contains("p")
                    || karakterSama(nama1, nama2).contains("y")
                    || karakterSama(nama1, nama2).contains("g")) {
                skor += 35;
            }
            if (karakterSama(nama1, nama2).contains("f")
                    || karakterSama(nama1, nama2).contains("w")
                    || karakterSama(nama1, nama2).contains("m")
                    || karakterSama(nama1, nama2).contains("r")
                    || karakterSama(nama1, nama2).contains("c")) {
                skor += 30;
            }
            if (karakterSama(nama1, nama2).contains("l")
                    || karakterSama(nama1, nama2).contains("d")
                    || karakterSama(nama1, nama2).contains("u")
                    || karakterSama(nama1, nama2).contains("h")
                    || karakterSama(nama1, nama2).contains("s")) {
                skor += 20;
            }
            if (karakterSama(nama1, nama2).contains("n")
                    || karakterSama(nama1, nama2).contains("i")
                    || karakterSama(nama1, nama2).contains("o")
                    || karakterSama(nama1, nama2).contains("a")
                    || karakterSama(nama1, nama2).contains("t")
                    || karakterSama(nama1, nama2).contains("e")) {
                skor += 20;
            }
            System.out.println(skor + "%");
            if (skor >= 0 && skor <= 40) {
                System.out.println("Hanya angan-angan");
            } else if (skor > 40 && skor <= 60) {
                System.out.println("Tak ada yang tak mungkin");
            } else if (skor > 60 && skor <= 80) {
                System.out.println("Agak bisa diperjuangkan");
            } else {
                System.out.println("Inilah sang ayank");
            }
        } else {
            System.exit(0);
        }
    }
}
