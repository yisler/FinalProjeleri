import java.util.Scanner;
public class Proje17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scanner.nextLine().toLowerCase();

        int sesliHarfSayisi = 0;
        int sessizHarfSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);

            if (harf >= 'a' && harf <= 'z') {
                if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
                    sesliHarfSayisi++;
                } else {
                    sessizHarfSayisi++;
                }
            }
        }

        System.out.println("Sesli Harf Sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz Harf Sayısı: " + sessizHarfSayisi);

        scanner.close();
    }
}
