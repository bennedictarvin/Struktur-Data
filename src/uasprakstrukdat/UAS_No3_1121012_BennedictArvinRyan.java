/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasprakstrukdat;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Arvin Situmorang
 */
public class UAS_No3_1121012_BennedictArvinRyan {

    public static void main(String[] args) {
        HashMap<Integer, String> daftarBarang = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nomor;
        String barang;
        for (int i = 0; i < n; i++) {
            nomor = scan.nextInt();
            barang = scan.next();
            daftarBarang.put(nomor, barang);
        }
        if (n == 0) {
            System.out.println("Kosong");
        } else if (n > 0) {
            int x = scan.nextInt();
            if (daftarBarang.containsKey(x)) {
                System.out.println("Jumlah item pada hashmap adalah " + n);
            } else {
                System.out.println("Key tidak ditemukan");
            }

        }
    }
}
