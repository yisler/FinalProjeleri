import java.util.Scanner;
public class Proje6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Lütfen sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }

        int enBuyukSayi = sayilar[0];
        int enBuyukSira = 1;

        for (int i = 1; i < 10; i++) {
            if (sayilar[i] > enBuyukSayi) {
                enBuyukSayi = sayilar[i];
                enBuyukSira = i + 1;
            }
        }

        System.out.println("En Büyük Sayı: " + enBuyukSayi);
        System.out.println("En Büyük Sayı Girilme Sırası: " + enBuyukSira);

        scanner.close();
    }
}
