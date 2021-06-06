/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M. Haikal Irhamna
 * Kelas : TI20E
 */

import java.util.Scanner;

public class Rekursif {
    
private static int Pangkat(int n){
    if(n == 0){
        return 1;
    }
    return n * Pangkat(n-1);
}

private static int Deret(int d){
    if(d == 0 || d == 1) {
        return d;
    }
    else {
        return (Deret(d-1) + Deret(d-2));
    }
}

private static void MencetakAngka(){
    int angka;
    for(angka=1;angka<100;){
        System.out.println(angka);
        angka=angka+2;
    }
}

private static void MencetakNama(int nama){
    if (nama <=100){
            System.out.println(" M. Haikal Irhamna :" + nama);
            MencetakNama(1+nama);
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String input,a,b;
    int pilih;
    do{
        System.out.println("Program implementasi rekursif");
        System.out.println("\n==========Pilih Menu=============\n");
        System.out.println("- 1. Pangkat Bilangan");
        System.out.println("- 2. Deret Fibonachi");
        System.out.println("- 3. Mencetak Deret Angka 1,3,5,7...s/d 100");
        System.out.println("- 4. Mencetak Nama Sebanyak 100 kali");
        System.out.println("- 0. Keluar");
        System.out.print("Pilih Menu :  ");
      pilih = sc.nextInt();
      
      switch(pilih){
          case 1:
              int number, hasil;
              Scanner scan = new Scanner(System.in);
              System.out.print("Masukkan Angka : \n");
              number = scan.nextInt();
              hasil = Pangkat(number);
              System.out.println("Pangkat Bilangan Dari :" +number+ "adalah :" +hasil);
          break;
          case 2:
              int i,j =0;
              Scanner s = new Scanner(System.in);
              System.out.print("Masukkan Jumlah DERET Bilangan Fibonaci : \n");
              int d = s.nextInt();
              System.out.print("Hasil Bilangan Fibonaci : \n");
              for(i=0;i<d;i++){
                  System.out.print(Deret(j)+",");
                  j++;
              }
              System.out.println();
          break;
          case 3:
              MencetakAngka();
          break;
          case 4:
              System.out.println("---------Cetak nama ----");
              MencetakNama(2);
          break;
          
      }
    }while(pilih!=0);
   }
};
