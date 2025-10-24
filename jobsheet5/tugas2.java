package jobsheet5;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        //deklarasi
        int angka=0;
        System.out.println("Masukkan angka: ");

        if (angka % 2 == 0) {
            System.out.println("Angka Ganjil");
        } else {
            System.out.println("Angka Genap");
        }

        sc.close();
        }
    } 
}
