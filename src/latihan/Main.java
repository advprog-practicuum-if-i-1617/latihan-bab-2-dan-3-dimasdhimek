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

    private static String[] huruf = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
                }else if(converter(inputAngka).equals("")){
                    System.out.println("\nHuruf : nol");
                }else {
                    System.out.println("\nHuruf : " + converter(inputAngka));
                }
                break;
            case 2:
                System.out.print("Masukkan huruf (max seribu): ");
                String inputHuruf = in.nextLine();
                inputHuruf = in.nextLine();
                if (converter(inputHuruf).equals("not found")) {
                    System.out.println("\nnot found");
                } else {
                    System.out.println("\nAngka : " + converter(inputHuruf));
                }
                break;

        }
    }

    public static String converter(int angka) {
        if (angka == 1000) {
            return "seribu";
        } else if (angka <= 999 && angka >= 200) {
            return converter(angka / 100) + " ratus " + converter(angka % 100);
        } else if (angka <= 199 && angka >= 100) {
            return "seratus " + converter(angka % 100);
        } else if (angka <= 99 && angka >= 20) {
            return converter(angka / 10) + " puluh " + converter(angka % 10);
        } else if (angka >= 12 && angka < 20) {
            return huruf[angka / 10] + "belas";
        } else if (angka < 12) {
            if (angka == 11) {
                return huruf[angka];
            } else if (angka == 10) {
                return huruf[angka];
            } else if (angka == 9) {
                return huruf[angka];
            } else if (angka == 8) {
                return huruf[angka];
            } else if (angka == 7) {
                return huruf[angka];
            } else if (angka == 6) {
                return huruf[angka];
            } else if (angka == 5) {
                return huruf[angka];
            } else if (angka == 4) {
                return huruf[angka];
            } else if (angka == 3) {
                return huruf[angka];
            } else if (angka == 2) {
                return huruf[angka];
            } else if (angka == 1) {
                return huruf[angka];
            }
        }
        return "";
    }

    public static String converter(String huruf) {
        for (int i = 0; i <= 1000; i++) {
            String hurufTemp = huruf.replaceAll("\\s", "");
            String converterTemp = converter(i).replaceAll("\\s", "");
            if (hurufTemp.equalsIgnoreCase(converterTemp)) {
                return Integer.toString(i);
            } else if (hurufTemp.equalsIgnoreCase("nol")) {
                return Integer.toString(0);
            }
        }
        return "not found";
    }
}
