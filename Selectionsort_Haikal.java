/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selectionsort_M;

import java.util.Arrays;

/**
 *
 * @M. Haikal Irhamna
 * Kelas    :TI20E
 * NIM      :20200040069
 */
public class Selectionsort_Haikal {
    public static void main(String[] args) {
        System.out.print("Program selection sort");
         int Data[]={99,9,1,11,4,72,5,15,6,24,32,14,13,56,41}; // berfungsi sebagai input Data yang akan di swap
         int Min=Data[0];
         int index=0;
         int Swap=0;
         
         long startTime = System.currentTimeMillis(); //Agar dapat menampilkan waktu program di eksekusi
         
         for(int j=0;j<Data.length-1;j++){
             for(int i=j;i<Data.length;i++){ //Mencari niali terkecil(minimum)
                if(Data[i]<Min){ //logika swap 
                    Min=Data[i];
                    index=i;
                    Swap++;
                }
             System.out.println(Arrays.toString(Data) + "\n Total Swap : \n" + Swap);
            }
                if(Min<Data[j]){ //Logika swap 
                    Data[index]=Data[j];
                    Data[j]=Min;      
               }
             Min=Data[j+1];
        }
         long endTime=System.currentTimeMillis(); //Logika untuk menapilkan waktu program
         long time = endTime - startTime; //Logika waktu program menggunakan hasil dari (endtime -starttime) sebagai waktu
         System.out.print("Total waktu :" + time + "mili detik");
    }
};
