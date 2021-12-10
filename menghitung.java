import java.util.Scanner;
class menghitung{

    static int bayar = 0;

    public static int paketReguler() {
        bayar = 12000;
        return bayar;
    }
    public static int paketSuper() {
        bayar = 13000;
        return bayar;
    }
    public static int paketSuperMantab() {
        bayar = 16000;
        return bayar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan menu");
        System.out.println("1. Paket Reguler");
        System.out.println("2. Paket Super");
        System.out.println("3. Paket Super Mantab");
        System.out.print("Masukkan angka: ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                paketReguler();
                break;
            case 2:
                paketSuper();
                break;
                case 3:
                paketSuperMantab();
                break;
            default:
                System.out.println("Tidak dalam Range!");
                break;
        }
        System.out.println(bayar);
        // int a, b, hasil;
        // System.out.print("Masukkan angka 1: ");
        // a = sc.nextInt();
        // System.out.print("Masukkan angka 2: ");
        // b = sc.nextInt();
        // hasil = a + b;
        // System.out.println("Hasil dari penjumlahan " + a + " dan " + b + " hasilnya adalah " + hasil);
    }
}