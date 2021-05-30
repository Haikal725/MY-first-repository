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
public class Linear_search_number{        
    public static void main(String a[]){
        int[] angka = {1,3,5,7,9,11,13,15,17,19,21};
        System.out.print("Program Linear search berdasarkan angka \n");
        System.out.print("======================================= \n");
        Scanner sc = new Scanner(System.in);    
        System.out.print("MASUKKAN DATA YANG DICARI" + " : \n");
        int key = sc.nextInt();
        boolean value = false;
        for(int i=0;i<angka.length;i++){
            if(key == angka[i]){
                System.out.println("DATA "+key+" DITEMUKAN PADA URUTAN ke : "+(i+1));
                value = true;
                break; 
            }
        }
        if(value == false){
            System.out.println("DATA TIDAK DITEMUKAN");    
        }
    }
};    