// Proje 14: Tarih Farkı

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Proje14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Farkı öğrenmek istediğiniz ilk tarihi (GG/AA/YYYY) şeklinde giriniz: ");
        String tarih1Str = scanner.nextLine();

        System.out.print("Farkı öğrenmek istediğiniz ikinci tarihi (GG/AA/YYYY) şeklinde giriniz: ");
        String tarih2Str = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("Proje 19/MM/yyyy");
        try {
            Date tarih1 = dateFormat.parse(tarih1Str);
            Date tarih2 = dateFormat.parse(tarih2Str);

            long farkMilisaniye = Math.abs(tarih2.getTime() - tarih1.getTime());
            long farkGun = farkMilisaniye / (24 * 60 * 60 * 1000);
            long farkAy = farkGun / 30;
            long farkYil = farkAy / 12;

            System.out.println("Tarih Farkı:");
            System.out.println("Gün: " + farkGun);
            System.out.println("Ay: " + farkAy);
            System.out.println("Yıl: " + farkYil);

        } catch (ParseException e) {
            System.out.println("Tarih formatını yanlış girdiniz, Lütfen GG/AA/YYYY formatında girin.");
        }

        scanner.close();
    }
}
