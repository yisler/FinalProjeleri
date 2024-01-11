import java.util.Random;
import java.util.Scanner;
public class Proje11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int kazananSayac = 0;

        while (kazananSayac < 3) {
            System.out.print("Taş (0), Kağıt (1), Makas (2) seçin: ");
            int kullaniciSecim = scanner.nextInt();

            if (kullaniciSecim < 0 || kullaniciSecim > 2) {
                System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                continue;
            }

            int rakipSecim = random.nextInt(3);

            System.out.println("Rakibinizin Seçimi: " + rakipSecim);

            if (kullaniciSecim == rakipSecim) {
                System.out.println("Berabere!");
            } else if ((kullaniciSecim == 0 && rakipSecim == 2) ||
                    (kullaniciSecim == 1 && rakipSecim == 0) ||
                    (kullaniciSecim == 2 && rakipSecim == 1)) {
                System.out.println("Kazandınız!");
                kazananSayac++;
            } else {
                System.out.println("Rakibiniz Kazandı!");
            }
        }

        System.out.println("Tebrikler! Oyunu 3 kez kazandınız.");

        scanner.close();
    }
}
