import java.util.Scanner;

public class PercabanganIF {
    public static void main(String[] args) {
        // final double PI = 3.14;
        Scanner inputKey = new Scanner (System.in);
        System.out.print("Masukkan bilangan : ");
        int bilPertama = inputKey.nextInt();
        int sisa = bilPertama % 2;
        if (sisa == 1) {
            System.out.println("Bilangan " + bilPertama + " adalah bilangan ganjil");
            if ((bilPertama == 9) || (bilPertama == 11)){
                System.out.println("Juga adalah bilangan 9 atau bilangan 11");
            }
        } else if (bilPertama == 0) {
            System.out.println("Bilangan yang anda inputkan adalah NOL");
        } else {
            System.out.println("Bilangan " + bilPertama + " adalah bilangan genap");
        } 

        if (bilPertama == 100) {
            System.out.println("dan Bilangan Sempurna");
        }
    }
}
