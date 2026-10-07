// public class Aritmatika {
//     public static void main(String[] args) {
//         int bil1 = 30;
//         int bil2 = 45;
//         int hasil;

//         double hasilPembagian;
//         double Bil1,Bil2;
        
//         hasil = bil1 + bil2;
//         System.out.println("Hasil dari " + bil1 + " + " + bil2 + " = " + hasil);
//         hasil = bil1 - bil2;
//         System.out.println("Hasil dari " + bil1 + " - " + bil2 + " = " + hasil);
//         hasil = bil1 * bil2;
//         System.out.println("Hasil dari " + bil1 + " * " + bil2 + " = " + hasil);

//         Bil1 = 28;
//         Bil2 = 3;
//         hasilPembagian = Bil1 / Bil2;
//         System.out.println("Hasil dari " + Bil1 + " / " + Bil2 + " = " + hasilPembagian);
//     }
    
// }

public class Aritmatika {
    public static void main(String[] args) {
        int bil1 = 30;
        int bil2 = 45;
        int hasil;

        hasil = bil1 + bil2;
        System.out.println("Hasil dari " + bil1 + " + " + bil2 + " = " + hasil);

        hasil = bil1 - bil2;
        System.out.println("Hasil dari " + bil1 + " - " + bil2 + " = " + hasil);

        hasil = bil1 * bil2;
        System.out.println("Hasil dari " + bil1 + " * " + bil2 + " = " + hasil);

        double pembilang = 28;
        double penyebut = 3;
        double hasilPembagian = pembilang / penyebut;
        System.out.printf("Hasil dari %.0f / %.0f = %.2f%n", pembilang, penyebut, hasilPembagian);

        int sisa = 28 % 3;
        System.out.println("Hasil dari 28 % 3 = " + sisa);
    }
}