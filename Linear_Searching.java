/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @M. Haikal Irhamna
 * Kelas    :TI20E
 * NIM      :202000400692
 */
public class Linear_Searching {
 int Nim;
 String Nama;
 String Alamat; 
    public Linear_Searching(int Nim, String Nama, String Alamat){
        this.Nim = Nim;
        this.Nama = Nama;
        this.Alamat = Alamat;
   } 
    public int getNIM(){
     return Nim;   
    }
    public String getName(){
     return Nama;   
    }
    public String getAddress(){
     return Alamat;
    }
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        String cari;
        Linear_Searching[] Data = new Linear_Searching[6];//Data
        System.out.println("NIM\tNAMA\t\t ALAMAT");//untuk menampilkan form NIM, Nama, dan Alamat
        Data[0] = new Linear_Searching(1102021, "Andri Hariadi", "Bandung");
        Data[1] = new Linear_Searching(1102022, "Dewi Lestari", "Surabaya");
        Data[2] = new Linear_Searching(1102023, "Dewi Agustin", "Malang");
        Data[3] = new Linear_Searching(1102024, "Reni Indrayanti", "Malang");
        Data[4] = new Linear_Searching(1102025, "Toni Sukmawan", "Surabaya");
        Data[5] = new Linear_Searching(1102026, "Toni Gunawan", "Bandung");
        boolean value = false;           
        for(n=0; n<Data.length; n++){
            System.out.println(Data[n].getNIM()+" "+Data[n].getName()+" "+Data[n].getAddress()); //untuk menampilkan data
        }
        System.out.print("======================================= \n");
        System.out.println("\n Cari Berdasarkan Nama :");
        cari = sc.next();
        for(n=0; n<Data.length; n++){
            String splitnama[]=Data[n].getName().split(" ");//method split berfungsi untuk membatasi data yang dicari/memotong.
            for (m=0; m<splitnama.length; m++){
                if(cari.equalsIgnoreCase(splitnama[m])){ //untuk membandingkan nilai dari 2 variable tanpa mempedulikan itu huruf kecil atau besar, yang terpenting mempunyai nilai yang sama dan akan menghasilkan nilai true. 
                   System.out.println("\nDATA BERHASIL DITEMUKAN "); //berbeda dengan method equals yang membandingkan nilai 2 variable dengan memperhatikan apa huruf itu kecil atau besar, jika ada 1 huruf saja yang berbeda maka akan menghasilkan nilai false.
                   for (int c=5; c<Data.length; c++){//untuk pengulangan
                        System.out.println("NIM : "+Data[n].getNIM()+"\nNama : "+Data[n].getName()+"\nAlamat :"+Data[n].getAddress());
                        value=true;
                        System.out.println("\nNama '"+cari+"' Ditemukan di Indeks Ke: "+(n)+"\nPosisi Nomor Ke: "+(n+1)); 
                        System.out.println("==========================================================================");
                        }
                  }            
            }
            if(value == false){
            System.out.println("NAMA '"+cari+"' TIDAK DITEMUKAN");
            }
        }
    }
};