public class ALGODATA { 

    public static void main(String[] args) {
        String [][] kamar_hotel ={
        
            {"1","2","3","4","x"},
            {"1","2","3","4","5"},
            {"1","2","3","4","5"},
            {"1","2","3","x","5"},
};
int kamar_kosong = 0;
for (int i = 0; i < kamar_hotel.length; i++){
    for (int j = 0; j < kamar_hotel[i].length; j++){
if (kamar_hotel[i][j] == "x"){
        System.out.println ("Tamu berada di lantai" + (i+1) + "Kamar" + (j+1));
}
else {
    kamar_kosong +=1;
}
} 
}
        System.out.println("");
        System.out.println("Jumlah kamar yang kosong" + kamar_kosong);
    }


};