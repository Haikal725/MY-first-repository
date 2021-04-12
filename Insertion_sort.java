import java.util.Scanner;
/**
 *
 * @author M. Haikal Irhamna
 *         Kelas TI20E
 */
public class Insertion_sort {
    public static void Insertion_sort(int[] ar, int n) {
        for (int i=0; i<n-1; i++)//Logika pengurutan
        {
            int j = i+1;
            while(j>0){
                if(ar[j]<ar[j-1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = tmp;
                    j--;
                }
                else {
                    break;
                }
            }
            printArray(ar);
        }
    }
    
    public static void main (String[] args) {
        //Input Data
        System.out.print("Program Insertion sort \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data :");
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Input Data ke " + (i+1) + ":");
            ar[i] = in.nextInt();
        }
        Insertion_sort( ar, n);
        }
    private static void printArray(int[] ar) {
        for (int k: ar)//Hasil pengurutan
        {
        System.out.print(k+"");
   }
        System.out.println("");
        System.out.println("Hasil pengurutan :");
   }
};
