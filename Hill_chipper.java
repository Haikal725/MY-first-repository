/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hill_chipper;

/**
 *
 * @author ACER
 */
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hill_chipper {

    static String [] huruf = {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                              "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                              "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d",
                              "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                              "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                              "y", "z", "`", "~", "!", "@", "#", "$", "%", "^",
                              "&", "*", "(" , ")", "_", "-", "+", "=", "{", "}",
                              "[", "]", "|", "\\", ":", ";", "’", "<", ">", ",", ".", "?", "/"};
    static int [] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                          21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
                          38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                          55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
                          72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84};
    static String HasilEnkripsi = "";
    static String[] character;
    static String[][] Hasil;
    static String [][] Konversi1;
    static int mod = 84;
    
 
    public int words(String txt) {
        int w = txt.length();
        System.out.println("Jumlah huruf"+w);
        
        return w;
    }
    
    static String Text(String text) {
        String t = text;
        if (t.length() % 2 == 0) {
            t = text;
            } 
        else {
            t = text + ".";
            }
        assert t.length() % 2 == 0;
        character = new String[t.length() / 2];
        for (int index = 0; index < character.length; index++) {
            character[index] = t.substring(index * 2, index * 2 + 2);
        }
        return t;
    }
    
    static String[][] konversitoNum(String[] text) {
        Konversi1 = new String[text.length][2];
        for (int i=0; i<text.length; i++) {
            String char1 = text[i].substring(0, 1);
            String char2 = text[i].substring(1);

            for (int j=0; j<huruf.length; j++) {
                if (char1.equals(huruf[j])) {
                    char1 = String.valueOf(angka[j]);
                }
                if (char2.equals(huruf[j])) {
                    char2 = String.valueOf(angka[j]);
                }
            }

            if (Konversi1[i][0] == null) {
                Konversi1[i][0] = char1;
                if (Konversi1[i][1] == null) {
                    Konversi1[i][1] = char2;
                }
            }
        }
        for (int n=0; n<Konversi1.length; n++) {
            for (int p=0; p<Konversi1[0].length; p++) {
            }
        }

        return Konversi1;
    }

    static String[][] Keymatrix(String[][] angka, int[][] kunci) {
        int kunciK0B0 = kunci[0][0];
        int kunciK0B1 = kunci[0][1];
        int kunciK1B0 = kunci[1][0];
        int kunciK1B1 = kunci[1][1];
        Hasil = new String[angka.length][2];
        for (int n = 0; n < angka.length; n++) {
            int konvert = Integer.parseInt(angka[n][0]);
            int konvert1 = Integer.parseInt(angka[n][1]);
            int hasil = (kunciK0B0 * konvert) + (kunciK0B1 * konvert1);
            int hasil1 = (kunciK1B0 * konvert) + (kunciK1B1 * konvert1);
            hasil = hasil % mod;
            hasil1 = hasil1 % mod;

            if (Hasil[n][0] == null) {
                Hasil[n][0] = String.valueOf(hasil);
                if (Hasil[n][1] == null) {
                    Hasil[n][1] = String.valueOf(hasil1);
                }
            }
        }
        
        for (int i=0; i<Hasil.length; i++) {
            for (int j=0; j<Hasil[0].length; j++) {
            }
        }
        return Hasil;
    }

    static String konversitowords(String[][] Hasil) {

        String Enkripsi = "";
        if (choice==1){
           System.out.println("HASIL ENKRIPSI Adalah ");
        }else {
           System.out.println("HASIL DESKRIPSI Adalah ");
        }
        HasilEnkripsi = "";
        for (int i=0; i<Hasil.length; i++) {
            for (int j=0; j<Hasil[0].length; j++) {
                for (int k = 0; k < angka.length; k++) {
                    if (Hasil[i][j].equals(String.valueOf(angka[k]))) {
                        Enkripsi = huruf[k];
                        HasilEnkripsi = HasilEnkripsi + Enkripsi;
                    }
                }
            }
        }
        System.out.println(HasilEnkripsi);
        return HasilEnkripsi;
    }
    
    public String keysEnkripsi(String txt, int [][] kunci){
    System.out.println("Plaintext : '" + txt + "'");
    words(txt);
    Text(txt);
    konversitoNum(character);
    Keymatrix(Konversi1, kunci);
    konversitowords(Hasil);

    return HasilEnkripsi;
    }
    static int choice;    
     /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    Hill_chipper h = new Hill_chipper();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Program Hill cipher");
        System.out.println("===================");
        System.out.println("1. Enkripsi");
        System.out.println("2. Deskripsi");
        choice = Integer.parseInt(in.readLine());
        if(choice==1){ 
        System.out.println("\nKUNCI MATRIKS ORDO 2X2");
        System.out.println("Silahkan Isi Nilai Matrik A :");
        int ma = scan.nextInt();
        System.out.println("Silahkan Isi Nilai Matrik B :");
        int mb = scan.nextInt();
        System.out.println("Silahkan Isi Nilai Matrik C :");
        int mc = scan.nextInt();
        System.out.println("Silahkan Isi Nilai Matrik D :");
        int md = scan.nextInt();
        if((ma*md)-(mc*mb) == 1) {
            System.out.println("Matriks Memenuhi Syarat\n");
            int[][] kunci = {{ma, mc}, {mb, md}};
            System.out.printf("Masukan Directory file :");
            String path = scan.next();
            try {
            File f0 = new File(path);
            Scanner reader=new Scanner(f0);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                //proses enkripsi;
                h.keysEnkripsi(data, kunci);
            }
            reader.close();
            }catch(FileNotFoundException e){
            System.out.println("Kesalahan Akses File!");
            e.printStackTrace();
            }
             FileWriter writer = new FileWriter("C:\\Users\\ACER\\OneDrive\\Documents\\NetBeansProjects\\Hill_chipper\\src\\hill_chipper\\teks");
             try{
             writer.write(HasilEnkripsi);
             }catch(IOException e){
             e.printStackTrace();
             }
             finally{
             writer.flush();
             writer.close();
             System.out.println("Data Telah Tersimpan\n");
             main(args);
             }
        } else {
            System.out.println("Matriks Tidak Memenuhi Syarat, Hasil Determinan Harus = 1\n");
            main(args);
        }
        }
        if(choice==2){ 
        System.out.println("KUNCI MATRIK ORDO 2X2");
        System.out.println("Silahkan Isi Nilai Matrik A :");
        int ma = scan.nextInt();
        System.out.println("Silahkan Isi Nilai Matrik B :");
        int mb = scan.nextInt();
        System.out.println("Silahkan Isi Nilai Matrik C :");
        int mc = scan.nextInt();
        System.out.println("Silahkan Isi Nilai Matrik D :");
        int md = scan.nextInt();
        if ((ma*md)-(mc*mb) == 1) {
            System.out.println("Matriks Memenuhi Syarat\n");
            int[][] kunci = {{md, mod-mc}, {mod-mb, ma}};
            System.out.printf("Masukan Directory file :");
            String path2 = scan.next();
            try {
            File f0 = new File(path2);
            Scanner reader=new Scanner(f0);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                //proses enkripsi;
                h.keysEnkripsi(data, kunci);
            }
            reader.close();
            }catch(FileNotFoundException e){
            System.out.println("Kesalahan Akses File!");
            e.printStackTrace();
            }
            //simpan ke deskripsi
            FileWriter writer=new FileWriter("C:\\Users\\ACER\\OneDrive\\Documents\\NetBeansProjects\\Hill_chipper\\src\\hill_chipper\\teks");
            writer.write(HasilEnkripsi);
            writer.flush();
            writer.close();
            System.out.println("Data Telah Tersimpan\n");
            main(args);
            } 
        else {
            System.out.println("Matriks Tidak Memenuhi Syarat, Hasil Determinan Harus = 1\n");
            main(args);
        }
    
        }
    }
};
