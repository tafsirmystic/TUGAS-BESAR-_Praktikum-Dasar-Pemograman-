
import java.util.Scanner;
public class TuBes{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total judul buku: " );
        int n = sc.nextInt();
        String bookInventory[][] = new String[n][11];

        for(int i = 0; i < n; i++){
            System.out.println(" ");
            System.out.println("Judul buku ke-" + (i+1));

            int stock = sc.nextInt();
            System.out.print("Banyak buku yang rusak: ");
            int rusak = sc.nextInt();
            System.out.print("Banyak buku yang terjual dalam satu bulan: ");
            int terjual = sc.nextInt();
            int siapJual = stock - rusak;
            int sisaTotal = stock - terjual;   


            for(int j = 0; j < 11; j++){
                if(j==0){
                    System.out.print("Kategori buku: ");
                    bookInventory[i][0] = sc.nextLine();
                    bookInventory[i][j] = sc.nextLine();
                }else if (j==1){
                    System.out.print("Judul buku: ");
                    bookInventory[i][j] = sc.nextLine();
                }else if (j==2){
                    bookInventory[i][2] = String.valueOf(i+1);
                }else if (j==3){
                    System.out.print("Penerbit: ");
                    bookInventory[i][j] = sc.nextLine();
                }else if (j==4){
                    System.out.print("Penulis: ");
                    bookInventory[i][j] = sc.nextLine();
                }else if (j==5){
                    System.out.print("tanggal pembelian: ");
                    bookInventory[i][j] = sc.nextLine();
                }else if (j==6){
                    bookInventory[i][6] = String.valueOf(stock);
                }else if (j==7){
                    bookInventory[i][7] = String.valueOf(rusak);
                }else if (j==8){
                    bookInventory[i][8] = String.valueOf(terjual);
                }else if (j==9){
                    bookInventory[i][9] = String.valueOf(siapJual);
                }else{
                    bookInventory[i][10] = String.valueOf(sisaTotal);
                }
                System.out.print("");
            }

        }
        System.out.println("Laporan Bulanan Inventaris Toko Buku Jaya Pelita");
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.println("KATEGORI    |   JUDUL      |    KODE     |    PENERBIT     |   PENULIS     | TANGGAL PEMBELIAN |     STOCK AWAL    |  BUKU RUSAK   |   BUKU TERJUAL  | SIAP DIJUAL  | SISA BUKU ");

        for(int  i = 0; i<n; i++){
            for(int j = 0; j<11; j++){
                System.out.print(bookInventory[i][j] +"\t\t");
            }System.out.println("");
        
        } 
        System.out.print("kode buku yang ingin dicari: ");
        int kode = sc.nextInt();
            while (kode>n) {
                System.out.println("Kode yang Anda masukkan tidak tersedia");
                System.out.println("Masukkan kode yang benar : ");
                kode = sc.nextInt();
                if (kode<=n) {
                    for(int j = 0; j<11; j++){
            System.out.print(bookInventory[kode-1][j] +"\t\t");
                }
            }            
        }
       
        int terjual[] = new int[n];
        int a = 0;

        for(int i=0; i<n; i++) {
            terjual[i] = Integer.parseInt(bookInventory[i][8]);
          }
            int max=terjual[0];
            for (int i = 0; i < terjual.length; i++) {
                if(terjual[i]>max){
                    max = terjual[i];
                    a++;
                } 
            }
            System.out.println("Buku yang harus paling banyak bulan depan  =  "+bookInventory[a][1]);
            System.out.println("=======================");

    }
    }