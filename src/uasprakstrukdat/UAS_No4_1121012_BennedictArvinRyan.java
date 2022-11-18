/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasprakstrukdat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arvin Situmorang
 */
public class UAS_No4_1121012_BennedictArvinRyan {

    static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
    
    static boolean isCons(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U');
    }
    
    static int countCons(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isCons(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> password = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String entri;
        for (int i = 0; i < n; i++) {
            entri = scan.next();
            int jumlahVokal = countVowel(entri);
            String hasil = entri.replaceAll("(?i)(^[^aeiou]+)(.*)", "$2$1uy" + jumlahVokal);
            System.out.println(hasil);
        }
    }
}
