import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jenis suhu(F untuk Fahrenheit, R untuk Reamur)");
        char jenisSuhu = scanner.next().charAt(0);
        System.out.println("Masukan nilai suhu dalam Celsius");

        double suhuCelsius = scanner.nextDouble();
        double hasilKonversi = 0;
        String statusKelipatan = "";
        if (jenisSuhu == 'f' || jenisSuhu == 'f') {
            hasilKonversi = (suhuCelsius * 9 / 5) + 32;
        } else if (jenisSuhu == 'R' || jenisSuhu == 'r') {
            hasilKonversi = suhuCelsius * 4 / 5;
        } else {
            System.out.println("`Jenis suhu tidak valid. Program berhenti.");
            System.exit(0);

            if (hasilKonversi % 2 == 0 && hasilKonversi % 5 == 0) {
                statusKelipatan = "Kelipatan 2 dan 5";
            }
            System.out.println("Hasil konversi: " + hasilKonversi);
            System.out.println("Status kelipatan: " + statusKelipatan);
            scanner.close();
            }
        }
    }
