package stack_algodata;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author M. Haikal Irhamna
 */
public class stack_algodata {


private static int[] stack = new int[30];
 private static int counters = 0;

 private static boolean stack_Storage() {
  if(counters < stack.length) {
   return true;
  }
  else {
   return false;
  }
 }
 
 private static void create_Playlist() {
  int loopX = 0; 
  int alpha = 0;
  while(loopX == 0) {
   System.out.print("Masukkan Data Berupa Angka : ");
   Scanner alphaX = new Scanner(System.in);
   try {
    alpha = alphaX.nextInt();
    loopX = 1;
   }
   catch(InputMismatchException e) {
    System.out.println("Inputan Harus Berupa Angka!");
    loopX = 0;
   }
  }
  stack[counters] = alpha;
  counters++;
 }
 
 private static void remove_Playlist() {
  counters--; 
  System.out.println("Data Terakhir Telah Dihapus");
 }
 
 private static void display_Data_Playlist() {
  System.out.print("Semua Data Playlist: ");
  for(int i = 0; i < counters; i++) {
   System.out.print(" ["+i+" => "+stack[i]+"]" );
  }
  System.out.println("");
 }
 
 private static void clean_Playlist() {
  counters = 0;
 }
 
 private static void quit_App() {
  String quitss = "y";
  System.out.print("Apakah Anda Yakin Ingin Keluar Dari Aplikasi? (Y/T): ");
  quitss = new Scanner(System.in).nextLine();
  if(quitss.equalsIgnoreCase("Y")) {
   System.exit(0);
  }
  else {
   menu_Program();
  }
 }
 
 private static void menuChooser(int choosenMenu) {
  switch(choosenMenu) {
    case 1:
    display_Data_Playlist();
    break;
    case 2:
    boolean check = stack_Storage();
    if(check) {
     create_Playlist();
    }
    else {
     System.out.println("Playlist Penuh!, Kosongkan Beberapa Data Terlebih Dahulu!");
    }
    break;
   case 3:
    remove_Playlist();
    break;
    case 4:
    clean_Playlist();
    break;
   case 5:
    System.out.println("Status Penyimpanan: ");
    System.out.println("Kapasitas: " + stack.length);
    System.out.println("Terisi   : " + counters);
    break;


   case 6:
    quit_App();
    break;
  }
  menu_Program();
 }
 
 private static void menu_Program() {
  int loopX = 0;
  int choosenMenu = 0;
  while(loopX == 0) {
   System.out.println("=====Program Stack Playlist======");
   System.out.println("==========Pilih Menu=============");
   System.out.println("- 11. Tampilkan data Playlist");
   System.out.println("- 12. Tambah Playlist");
   System.out.println("- 13. Hapus data Playlist");
   System.out.println("- 14. Hapus Semua Data Playlist");
   System.out.println("- 15. Status Penyimpanan Playlist");
   System.out.println("- 16. Tutup Aplikasi");
   System.out.print("Pilih Menu :  ");
   Scanner menuOption = new Scanner(System.in);
   try {
    choosenMenu = menuOption.nextInt();
    loopX = 1;
   }catch(InputMismatchException e) {
    System.out.println("Masukan Harus Angka!");
   }
  }
  System.out.println("");
  System.out.println("NIM  : 20200040069");
  System.out.println("Nama : M. Haikal Irhamna");
  System.out.println("Nusa Putra University");
  menuChooser(choosenMenu);
 }

 public static void main(String[] args) {
  menu_Program();
 }
 
}
;