/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 * created by Dimas Setiawan at Mar 22, 2017 6:41:52 PM
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Converter converter = new Converter();
        System.out.println("1. Konversi angka ke huruf");
        System.out.println("2. Konversi huruf ke angka");
        System.out.print("Masukkan pilihan : ");
        byte input = in.nextByte();
        switch (input) {
            case 1:
                System.out.print("Masukkan angka (max 1000): ");
                int inputAngka = in.nextInt();
                if (inputAngka < 0 || inputAngka > 1000) {
                    System.out.println("\nnot found");
                }else if(converter.converter(inputAngka).equals("")){
                    System.out.println("\nHuruf : nol");
                }else {
                    System.out.println("\nHuruf : " + converter.converter(inputAngka));
                }
                break;
            case 2:
                System.out.print("Masukkan huruf (max seribu): ");
                String inputHuruf = in.nextLine();
                inputHuruf = in.nextLine();
                if (converter.converter(inputHuruf).equals("not found")) {
                    System.out.println("\nnot found");
                } else {
                    System.out.println("\nAngka : " + converter.converter(inputHuruf));
                }
                break;
        }
    }   
}
