// Proje 20 : Doğum günü bulma

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Proje20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen doğum tarihinizi gg.aa.yyyy formatında giriniz:");
        String dogum_tarihi_str = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dogum_tarihi = LocalDate.parse(dogum_tarihi_str, formatter);

        String[] gunler = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
        int gun_indeksi = getGunIndeksi(dogum_tarihi);
        String dogum_gunu = gunler[gun_indeksi];

        System.out.println(dogum_gunu);
    }

    private static int getGunIndeksi(LocalDate date) {
        return date.getDayOfWeek().getValue();
    }
}
