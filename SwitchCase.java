import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner (System.in);
        System.out.print("Masukkan hari dalam angka : ");
        String hari = "";
        int hariInput = inputKey.nextInt();
        switch (hariInput) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = "Tidak ada hari ke-" + hariInput;
                break;
        }
        System.out.println(hari);
    }
}
