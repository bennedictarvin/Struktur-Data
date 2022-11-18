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
public class UAS_No2_1121012_BennedictArvinRyan {

    public static void main(String[] args) {
        HashMap<String, String> query = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);

        int entri = scan.nextInt();
        String nama = "";
        String nomor = "";
        String queryNama = "";

        for (int i = 0; i < entri; i++) {
            nama = scan.next();
            nomor = scan.next();
            query.put(nama, nomor);
        }

        for (int i = 0; i < entri; i++) {
            queryNama = scan.next();
        }

        if (queryNama.equals(query.keySet())) {
            for (String i : query.keySet()) {
                System.out.println(i + "=" + query.get(i));
            }
        } else {
            System.out.println("Not found");
        }
    }
}
