import java.util.Scanner;
public class Proje13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen birinci kenarı giriniz: ");
        int kenar1 = scanner.nextInt();

        System.out.print("Lütfen ikinci kenarı giriniz: ");
        int kenar2 = scanner.nextInt();

        System.out.print("Lütfen üçüncü kenarı giriniz: ");
        int kenar3 = scanner.nextInt();

        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            System.out.println("Girmiş olduğunuz bu kenar uzunlukları ile bir üçgen oluşturulabilir.");

            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Girmiş olduğunuz bu kenar uzunlukları ile oluşturabileceğimiz üçgen eşkenar bir üçgendir.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("Girmiş olduğunuz bu kenar uzunlukları ile oluşturabileceğimiz üçgen ikizkenar bir üçgendir.");
            } else if (kenar1 * kenar1 + kenar2 * kenar2 == kenar3 * kenar3 ||
                    kenar1 * kenar1 + kenar3 * kenar3 == kenar2 * kenar2 ||
                    kenar2 * kenar2 + kenar3 * kenar3 == kenar1 * kenar1) {
                System.out.println("Girmiş olduğunuz bu kenar uzunlukları ile oluşturabileceğimiz üçgen dik bir üçgendir.");
            } else {
                System.out.println("Girmiş olduğunuz bu kenar uzunlukları ile oluşturabileceğimiz üçgen standart bir üçgendir.");
            }

        } else {
            System.out.println("Girmiş olduğunuz kenar uzunlukları ile maalesef bir üçgen oluşturulamaz.");
        }

        scanner.close();
    }
}
